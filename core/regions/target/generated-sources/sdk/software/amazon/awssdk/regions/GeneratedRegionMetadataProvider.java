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

package software.amazon.awssdk.regions;

import java.util.Map;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkPublicApi;
import software.amazon.awssdk.regions.regionmetadata.AfSouth1;
import software.amazon.awssdk.regions.regionmetadata.ApEast1;
import software.amazon.awssdk.regions.regionmetadata.ApNortheast1;
import software.amazon.awssdk.regions.regionmetadata.ApNortheast2;
import software.amazon.awssdk.regions.regionmetadata.ApNortheast3;
import software.amazon.awssdk.regions.regionmetadata.ApSouth1;
import software.amazon.awssdk.regions.regionmetadata.ApSouth2;
import software.amazon.awssdk.regions.regionmetadata.ApSoutheast1;
import software.amazon.awssdk.regions.regionmetadata.ApSoutheast2;
import software.amazon.awssdk.regions.regionmetadata.ApSoutheast3;
import software.amazon.awssdk.regions.regionmetadata.ApSoutheast4;
import software.amazon.awssdk.regions.regionmetadata.CaCentral1;
import software.amazon.awssdk.regions.regionmetadata.CaWest1;
import software.amazon.awssdk.regions.regionmetadata.CnNorth1;
import software.amazon.awssdk.regions.regionmetadata.CnNorthwest1;
import software.amazon.awssdk.regions.regionmetadata.EuCentral1;
import software.amazon.awssdk.regions.regionmetadata.EuCentral2;
import software.amazon.awssdk.regions.regionmetadata.EuNorth1;
import software.amazon.awssdk.regions.regionmetadata.EuSouth1;
import software.amazon.awssdk.regions.regionmetadata.EuSouth2;
import software.amazon.awssdk.regions.regionmetadata.EuWest1;
import software.amazon.awssdk.regions.regionmetadata.EuWest2;
import software.amazon.awssdk.regions.regionmetadata.EuWest3;
import software.amazon.awssdk.regions.regionmetadata.IlCentral1;
import software.amazon.awssdk.regions.regionmetadata.MeCentral1;
import software.amazon.awssdk.regions.regionmetadata.MeSouth1;
import software.amazon.awssdk.regions.regionmetadata.SaEast1;
import software.amazon.awssdk.regions.regionmetadata.UsEast1;
import software.amazon.awssdk.regions.regionmetadata.UsEast2;
import software.amazon.awssdk.regions.regionmetadata.UsGovEast1;
import software.amazon.awssdk.regions.regionmetadata.UsGovWest1;
import software.amazon.awssdk.regions.regionmetadata.UsIsoEast1;
import software.amazon.awssdk.regions.regionmetadata.UsIsoWest1;
import software.amazon.awssdk.regions.regionmetadata.UsIsobEast1;
import software.amazon.awssdk.regions.regionmetadata.UsWest1;
import software.amazon.awssdk.regions.regionmetadata.UsWest2;
import software.amazon.awssdk.utils.ImmutableMap;

@Generated("software.amazon.awssdk:codegen")
@SdkPublicApi
public final class GeneratedRegionMetadataProvider implements RegionMetadataProvider {
    private static final Map<Region, RegionMetadata> REGION_METADATA = ImmutableMap.<Region, RegionMetadata> builder()
            .put(Region.AF_SOUTH_1, new AfSouth1()).put(Region.AP_EAST_1, new ApEast1())
            .put(Region.AP_NORTHEAST_1, new ApNortheast1()).put(Region.AP_NORTHEAST_2, new ApNortheast2())
            .put(Region.AP_NORTHEAST_3, new ApNortheast3()).put(Region.AP_SOUTH_1, new ApSouth1())
            .put(Region.AP_SOUTH_2, new ApSouth2()).put(Region.AP_SOUTHEAST_1, new ApSoutheast1())
            .put(Region.AP_SOUTHEAST_2, new ApSoutheast2()).put(Region.AP_SOUTHEAST_3, new ApSoutheast3())
            .put(Region.AP_SOUTHEAST_4, new ApSoutheast4()).put(Region.CA_CENTRAL_1, new CaCentral1())
            .put(Region.CA_WEST_1, new CaWest1()).put(Region.EU_CENTRAL_1, new EuCentral1())
            .put(Region.EU_CENTRAL_2, new EuCentral2()).put(Region.EU_NORTH_1, new EuNorth1())
            .put(Region.EU_SOUTH_1, new EuSouth1()).put(Region.EU_SOUTH_2, new EuSouth2()).put(Region.EU_WEST_1, new EuWest1())
            .put(Region.EU_WEST_2, new EuWest2()).put(Region.EU_WEST_3, new EuWest3()).put(Region.IL_CENTRAL_1, new IlCentral1())
            .put(Region.ME_CENTRAL_1, new MeCentral1()).put(Region.ME_SOUTH_1, new MeSouth1())
            .put(Region.SA_EAST_1, new SaEast1()).put(Region.US_EAST_1, new UsEast1()).put(Region.US_EAST_2, new UsEast2())
            .put(Region.US_WEST_1, new UsWest1()).put(Region.US_WEST_2, new UsWest2()).put(Region.CN_NORTH_1, new CnNorth1())
            .put(Region.CN_NORTHWEST_1, new CnNorthwest1()).put(Region.US_GOV_EAST_1, new UsGovEast1())
            .put(Region.US_GOV_WEST_1, new UsGovWest1()).put(Region.US_ISO_EAST_1, new UsIsoEast1())
            .put(Region.US_ISO_WEST_1, new UsIsoWest1()).put(Region.US_ISOB_EAST_1, new UsIsobEast1()).build();

    public RegionMetadata regionMetadata(Region region) {
        return REGION_METADATA.get(region);
    }
}
