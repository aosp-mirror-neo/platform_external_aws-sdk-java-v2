/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package software.amazon.awssdk.services.kms.paginators;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.reactivestreams.Subscriber;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.async.SdkPublisher;
import software.amazon.awssdk.core.pagination.async.AsyncPageFetcher;
import software.amazon.awssdk.core.pagination.async.PaginatedItemsPublisher;
import software.amazon.awssdk.core.pagination.async.ResponsesSubscription;
import software.amazon.awssdk.core.util.PaginatorUtils;
import software.amazon.awssdk.services.kms.KmsAsyncClient;
import software.amazon.awssdk.services.kms.internal.UserAgentUtils;
import software.amazon.awssdk.services.kms.model.GrantListEntry;
import software.amazon.awssdk.services.kms.model.ListRetirableGrantsRequest;
import software.amazon.awssdk.services.kms.model.ListRetirableGrantsResponse;

/**
 * <p>
 * Represents the output for the
 * {@link software.amazon.awssdk.services.kms.KmsAsyncClient#listRetirableGrantsPaginator(software.amazon.awssdk.services.kms.model.ListRetirableGrantsRequest)}
 * operation which is a paginated operation. This class is a type of {@link org.reactivestreams.Publisher} which can be
 * used to provide a sequence of {@link software.amazon.awssdk.services.kms.model.ListRetirableGrantsResponse} response
 * pages as per demand from the subscriber.
 * </p>
 * <p>
 * When the operation is called, an instance of this class is returned. At this point, no service calls are made yet and
 * so there is no guarantee that the request is valid. If there are errors in your request, you will see the failures
 * only after you start streaming the data. The subscribe method should be called as a request to start streaming data.
 * For more info, see {@link org.reactivestreams.Publisher#subscribe(org.reactivestreams.Subscriber)}. Each call to the
 * subscribe method will result in a new {@link org.reactivestreams.Subscription} i.e., a new contract to stream data
 * from the starting request.
 * </p>
 *
 * <p>
 * The following are few ways to use the response class:
 * </p>
 * 1) Using the subscribe helper method
 * 
 * <pre>
 * {@code
 * software.amazon.awssdk.services.kms.paginators.ListRetirableGrantsPublisher publisher = client.listRetirableGrantsPaginator(request);
 * CompletableFuture<Void> future = publisher.subscribe(res -> { // Do something with the response });
 * future.get();
 * }
 * </pre>
 *
 * 2) Using a custom subscriber
 * 
 * <pre>
 * {@code
 * software.amazon.awssdk.services.kms.paginators.ListRetirableGrantsPublisher publisher = client.listRetirableGrantsPaginator(request);
 * publisher.subscribe(new Subscriber<software.amazon.awssdk.services.kms.model.ListRetirableGrantsResponse>() {
 * 
 * public void onSubscribe(org.reactivestreams.Subscriber subscription) { //... };
 * 
 * 
 * public void onNext(software.amazon.awssdk.services.kms.model.ListRetirableGrantsResponse response) { //... };
 * });}
 * </pre>
 * 
 * As the response is a publisher, it can work well with third party reactive streams implementations like RxJava2.
 * <p>
 * <b>Please notice that the configuration of Limit won't limit the number of results you get with the paginator. It
 * only limits the number of results in each page.</b>
 * </p>
 * <p>
 * <b>Note: If you prefer to have control on service calls, use the
 * {@link #listRetirableGrants(software.amazon.awssdk.services.kms.model.ListRetirableGrantsRequest)} operation.</b>
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public class ListRetirableGrantsPublisher implements SdkPublisher<ListRetirableGrantsResponse> {
    private final KmsAsyncClient client;

    private final ListRetirableGrantsRequest firstRequest;

    private final AsyncPageFetcher nextPageFetcher;

    private boolean isLastPage;

    public ListRetirableGrantsPublisher(KmsAsyncClient client, ListRetirableGrantsRequest firstRequest) {
        this(client, firstRequest, false);
    }

    private ListRetirableGrantsPublisher(KmsAsyncClient client, ListRetirableGrantsRequest firstRequest, boolean isLastPage) {
        this.client = client;
        this.firstRequest = UserAgentUtils.applyPaginatorUserAgent(firstRequest);
        this.isLastPage = isLastPage;
        this.nextPageFetcher = new ListRetirableGrantsResponseFetcher();
    }

    @Override
    public void subscribe(Subscriber<? super ListRetirableGrantsResponse> subscriber) {
        subscriber.onSubscribe(ResponsesSubscription.builder().subscriber(subscriber).nextPageFetcher(nextPageFetcher).build());
    }

    /**
     * Returns a publisher that can be used to get a stream of data. You need to subscribe to the publisher to request
     * the stream of data. The publisher has a helper forEach method that takes in a {@link java.util.function.Consumer}
     * and then applies that consumer to each response returned by the service.
     */
    public final SdkPublisher<GrantListEntry> grants() {
        Function<ListRetirableGrantsResponse, Iterator<GrantListEntry>> getIterator = response -> {
            if (response != null && response.grants() != null) {
                return response.grants().iterator();
            }
            return Collections.emptyIterator();
        };
        return PaginatedItemsPublisher.builder().nextPageFetcher(new ListRetirableGrantsResponseFetcher())
                .iteratorFunction(getIterator).isLastPage(isLastPage).build();
    }

    private class ListRetirableGrantsResponseFetcher implements AsyncPageFetcher<ListRetirableGrantsResponse> {
        @Override
        public boolean hasNextPage(final ListRetirableGrantsResponse previousPage) {
            return PaginatorUtils.isOutputTokenAvailable(previousPage.nextMarker());
        }

        @Override
        public CompletableFuture<ListRetirableGrantsResponse> nextPage(final ListRetirableGrantsResponse previousPage) {
            if (previousPage == null) {
                return client.listRetirableGrants(firstRequest);
            }
            return client.listRetirableGrants(firstRequest.toBuilder().marker(previousPage.nextMarker()).build());
        }
    }
}
