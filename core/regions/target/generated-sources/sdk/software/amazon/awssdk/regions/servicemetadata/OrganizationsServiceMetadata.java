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

package software.amazon.awssdk.regions.servicemetadata;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.regions.EndpointTag;
import software.amazon.awssdk.regions.PartitionEndpointKey;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.regions.ServiceEndpointKey;
import software.amazon.awssdk.regions.ServiceMetadata;
import software.amazon.awssdk.regions.ServicePartitionMetadata;
import software.amazon.awssdk.regions.internal.DefaultServicePartitionMetadata;
import software.amazon.awssdk.regions.internal.util.ServiceMetadataUtils;
import software.amazon.awssdk.utils.ImmutableMap;
import software.amazon.awssdk.utils.Pair;

@Generated("software.amazon.awssdk:codegen")
@SdkPublicApi
public final class OrganizationsServiceMetadata implements ServiceMetadata {
    private static final String ENDPOINT_PREFIX = "organizations";

    private static final List<Region> REGIONS = Collections.unmodifiableList(Arrays.asList(Region.of("aws-global"),
            Region.of("fips-aws-global"), Region.of("aws-cn-global"), Region.of("aws-us-gov-global"),
            Region.of("fips-aws-us-gov-global")));

    private static final List<ServicePartitionMetadata> PARTITIONS = Collections.unmodifiableList(Arrays.asList(
            new DefaultServicePartitionMetadata("aws", Region.of("aws-global")), new DefaultServicePartitionMetadata("aws-cn",
                    Region.of("aws-cn-global")),
            new DefaultServicePartitionMetadata("aws-us-gov", Region.of("aws-us-gov-global"))));

    private static final Map<ServiceEndpointKey, String> SIGNING_REGIONS_BY_REGION = ImmutableMap
            .<ServiceEndpointKey, String> builder()
            .put(ServiceEndpointKey.builder().region(Region.of("aws-global")).build(), "us-east-1")
            .put(ServiceEndpointKey.builder().region(Region.of("aws-global")).tags(EndpointTag.of("fips")).build(), "us-east-1")
            .put(ServiceEndpointKey.builder().region(Region.of("fips-aws-global")).build(), "us-east-1")
            .put(ServiceEndpointKey.builder().region(Region.of("aws-cn-global")).build(), "cn-northwest-1")
            .put(ServiceEndpointKey.builder().region(Region.of("aws-us-gov-global")).build(), "us-gov-west-1")
            .put(ServiceEndpointKey.builder().region(Region.of("aws-us-gov-global")).tags(EndpointTag.of("fips")).build(),
                    "us-gov-west-1")
            .put(ServiceEndpointKey.builder().region(Region.of("fips-aws-us-gov-global")).build(), "us-gov-west-1").build();

    private static final Map<Pair<String, PartitionEndpointKey>, String> SIGNING_REGIONS_BY_PARTITION = ImmutableMap
            .<Pair<String, PartitionEndpointKey>, String> builder().build();

    private static final Map<ServiceEndpointKey, String> DNS_SUFFIXES_BY_REGION = ImmutableMap
            .<ServiceEndpointKey, String> builder().build();

    private static final Map<Pair<String, PartitionEndpointKey>, String> DNS_SUFFIXES_BY_PARTITION = ImmutableMap
            .<Pair<String, PartitionEndpointKey>, String> builder().build();

    private static final Map<ServiceEndpointKey, String> HOSTNAMES_BY_REGION = ImmutableMap
            .<ServiceEndpointKey, String> builder()
            .put(ServiceEndpointKey.builder().region(Region.of("aws-global")).build(), "organizations.us-east-1.amazonaws.com")
            .put(ServiceEndpointKey.builder().region(Region.of("aws-global")).tags(EndpointTag.of("fips")).build(),
                    "organizations-fips.us-east-1.amazonaws.com")
            .put(ServiceEndpointKey.builder().region(Region.of("fips-aws-global")).build(),
                    "organizations-fips.us-east-1.amazonaws.com")
            .put(ServiceEndpointKey.builder().region(Region.of("aws-cn-global")).build(),
                    "organizations.cn-northwest-1.amazonaws.com.cn")
            .put(ServiceEndpointKey.builder().region(Region.of("aws-us-gov-global")).build(),
                    "organizations.us-gov-west-1.amazonaws.com")
            .put(ServiceEndpointKey.builder().region(Region.of("aws-us-gov-global")).tags(EndpointTag.of("fips")).build(),
                    "organizations.us-gov-west-1.amazonaws.com")
            .put(ServiceEndpointKey.builder().region(Region.of("fips-aws-us-gov-global")).build(),
                    "organizations.us-gov-west-1.amazonaws.com").build();

    private static final Map<Pair<String, PartitionEndpointKey>, String> HOSTNAMES_BY_PARTITION = ImmutableMap
            .<Pair<String, PartitionEndpointKey>, String> builder().build();

    @Override
    public List<Region> regions() {
        return REGIONS;
    }

    @Override
    public List<ServicePartitionMetadata> servicePartitions() {
        return PARTITIONS;
    }

    @Override
    public URI endpointFor(ServiceEndpointKey key) {
        return ServiceMetadataUtils.endpointFor(ServiceMetadataUtils.hostname(key, HOSTNAMES_BY_REGION, HOSTNAMES_BY_PARTITION),
                ENDPOINT_PREFIX, key.region().id(),
                ServiceMetadataUtils.dnsSuffix(key, DNS_SUFFIXES_BY_REGION, DNS_SUFFIXES_BY_PARTITION));
    }

    @Override
    public Region signingRegion(ServiceEndpointKey key) {
        return ServiceMetadataUtils.signingRegion(key, SIGNING_REGIONS_BY_REGION, SIGNING_REGIONS_BY_PARTITION);
    }
}
