/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package software.amazon.awssdk.regions.partitionmetadata;

import java.util.Map;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.regions.EndpointTag;
import software.amazon.awssdk.regions.PartitionEndpointKey;
import software.amazon.awssdk.regions.PartitionMetadata;
import software.amazon.awssdk.utils.ImmutableMap;

@SdkPublicApi
@Generated("software.amazon.awssdk:codegen")
public final class AwsCnPartitionMetadata implements PartitionMetadata {
    private static final Map<PartitionEndpointKey, String> DNS_SUFFIXES = ImmutableMap
            .<PartitionEndpointKey, String> builder()
            .put(PartitionEndpointKey.builder().build(), "amazonaws.com.cn")
            .put(PartitionEndpointKey.builder().tags(EndpointTag.of("fips")).build(), "amazonaws.com.cn")
            .put(PartitionEndpointKey.builder().tags(EndpointTag.of("dualstack"), EndpointTag.of("fips")).build(),
                    "api.amazonwebservices.com.cn")
            .put(PartitionEndpointKey.builder().tags(EndpointTag.of("dualstack")).build(), "api.amazonwebservices.com.cn")
            .build();

    private static final Map<PartitionEndpointKey, String> HOSTNAMES = ImmutableMap
            .<PartitionEndpointKey, String> builder()
            .put(PartitionEndpointKey.builder().build(), "{service}.{region}.{dnsSuffix}")
            .put(PartitionEndpointKey.builder().tags(EndpointTag.of("fips")).build(), "{service}-fips.{region}.{dnsSuffix}")
            .put(PartitionEndpointKey.builder().tags(EndpointTag.of("dualstack"), EndpointTag.of("fips")).build(),
                    "{service}-fips.{region}.{dnsSuffix}")
            .put(PartitionEndpointKey.builder().tags(EndpointTag.of("dualstack")).build(), "{service}.{region}.{dnsSuffix}")
            .build();

    private static final String ID = "aws-cn";

    private static final String NAME = "AWS China";

    private static final String REGION_REGEX = "^cn\\-\\w+\\-\\d+$";

    @Override
    public String id() {
        return ID;
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public String regionRegex() {
        return REGION_REGEX;
    }

    @Override
    public String dnsSuffix(PartitionEndpointKey key) {
        return DNS_SUFFIXES.get(key);
    }

    @Override
    public String hostname(PartitionEndpointKey key) {
        return HOSTNAMES.get(key);
    }
}
