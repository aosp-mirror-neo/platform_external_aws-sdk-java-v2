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
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.pagination.sync.PaginatedItemsIterable;
import software.amazon.awssdk.core.pagination.sync.PaginatedResponsesIterator;
import software.amazon.awssdk.core.pagination.sync.SdkIterable;
import software.amazon.awssdk.core.pagination.sync.SyncPageFetcher;
import software.amazon.awssdk.core.util.PaginatorUtils;
import software.amazon.awssdk.services.kms.KmsClient;
import software.amazon.awssdk.services.kms.internal.UserAgentUtils;
import software.amazon.awssdk.services.kms.model.ListResourceTagsRequest;
import software.amazon.awssdk.services.kms.model.ListResourceTagsResponse;
import software.amazon.awssdk.services.kms.model.Tag;

/**
 * <p>
 * Represents the output for the
 * {@link software.amazon.awssdk.services.kms.KmsClient#listResourceTagsPaginator(software.amazon.awssdk.services.kms.model.ListResourceTagsRequest)}
 * operation which is a paginated operation. This class is an iterable of
 * {@link software.amazon.awssdk.services.kms.model.ListResourceTagsResponse} that can be used to iterate through all
 * the response pages of the operation.
 * </p>
 * <p>
 * When the operation is called, an instance of this class is returned. At this point, no service calls are made yet and
 * so there is no guarantee that the request is valid. As you iterate through the iterable, SDK will start lazily
 * loading response pages by making service calls until there are no pages left or your iteration stops. If there are
 * errors in your request, you will see the failures only after you start iterating through the iterable.
 * </p>
 *
 * <p>
 * The following are few ways to iterate through the response pages:
 * </p>
 * 1) Using a Stream
 * 
 * <pre>
 * {@code
 * software.amazon.awssdk.services.kms.paginators.ListResourceTagsIterable responses = client.listResourceTagsPaginator(request);
 * responses.stream().forEach(....);
 * }
 * </pre>
 *
 * 2) Using For loop
 * 
 * <pre>
 * {
 *     &#064;code
 *     software.amazon.awssdk.services.kms.paginators.ListResourceTagsIterable responses = client.listResourceTagsPaginator(request);
 *     for (software.amazon.awssdk.services.kms.model.ListResourceTagsResponse response : responses) {
 *         // do something;
 *     }
 * }
 * </pre>
 *
 * 3) Use iterator directly
 * 
 * <pre>
 * {@code
 * software.amazon.awssdk.services.kms.paginators.ListResourceTagsIterable responses = client.listResourceTagsPaginator(request);
 * responses.iterator().forEachRemaining(....);
 * }
 * </pre>
 * <p>
 * <b>Please notice that the configuration of Limit won't limit the number of results you get with the paginator. It
 * only limits the number of results in each page.</b>
 * </p>
 * <p>
 * <b>Note: If you prefer to have control on service calls, use the
 * {@link #listResourceTags(software.amazon.awssdk.services.kms.model.ListResourceTagsRequest)} operation.</b>
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public class ListResourceTagsIterable implements SdkIterable<ListResourceTagsResponse> {
    private final KmsClient client;

    private final ListResourceTagsRequest firstRequest;

    private final SyncPageFetcher nextPageFetcher;

    public ListResourceTagsIterable(KmsClient client, ListResourceTagsRequest firstRequest) {
        this.client = client;
        this.firstRequest = UserAgentUtils.applyPaginatorUserAgent(firstRequest);
        this.nextPageFetcher = new ListResourceTagsResponseFetcher();
    }

    @Override
    public Iterator<ListResourceTagsResponse> iterator() {
        return PaginatedResponsesIterator.builder().nextPageFetcher(nextPageFetcher).build();
    }

    /**
     * Returns an iterable to iterate through the paginated {@link ListResourceTagsResponse#tags()} member. The returned
     * iterable is used to iterate through the results across all response pages and not a single page.
     *
     * This method is useful if you are interested in iterating over the paginated member in the response pages instead
     * of the top level pages. Similar to iteration over pages, this method internally makes service calls to get the
     * next list of results until the iteration stops or there are no more results.
     */
    public final SdkIterable<Tag> tags() {
        Function<ListResourceTagsResponse, Iterator<Tag>> getIterator = response -> {
            if (response != null && response.tags() != null) {
                return response.tags().iterator();
            }
            return Collections.emptyIterator();
        };
        return PaginatedItemsIterable.<ListResourceTagsResponse, Tag> builder().pagesIterable(this)
                .itemIteratorFunction(getIterator).build();
    }

    private class ListResourceTagsResponseFetcher implements SyncPageFetcher<ListResourceTagsResponse> {
        @Override
        public boolean hasNextPage(ListResourceTagsResponse previousPage) {
            return PaginatorUtils.isOutputTokenAvailable(previousPage.nextMarker());
        }

        @Override
        public ListResourceTagsResponse nextPage(ListResourceTagsResponse previousPage) {
            if (previousPage == null) {
                return client.listResourceTags(firstRequest);
            }
            return client.listResourceTags(firstRequest.toBuilder().marker(previousPage.nextMarker()).build());
        }
    }
}
