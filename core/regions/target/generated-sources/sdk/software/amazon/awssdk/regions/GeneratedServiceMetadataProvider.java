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
import software.amazon.awssdk.regions.servicemetadata.A4bServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AccessAnalyzerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AccountServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AcmPcaServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AcmServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AgreementMarketplaceServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AirflowServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AmplifyServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AmplifybackendServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AmplifyuibuilderServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AossServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiDetectiveServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiEcrPublicServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiEcrServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiElasticInferenceServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiFleethubIotServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiIotdeviceadvisorServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiIotwirelessServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiMediatailorServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiPricingServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiSagemakerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApiTunnelingIotServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApigatewayServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AppIntegrationsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AppconfigServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AppconfigdataServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AppflowServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApplicationAutoscalingServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApplicationinsightsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AppmeshServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApprunnerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Appstream2ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AppsyncServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ApsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ArcZonalShiftServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AthenaServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AuditmanagerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AutoscalingPlansServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.AutoscalingServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.BackupGatewayServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.BackupServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.BackupstorageServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.BatchServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.BedrockServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.BillingconductorServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.BraketServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.BudgetsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CasesServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CassandraServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CatalogMarketplaceServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ChimeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CleanroomsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Cloud9ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CloudcontrolapiServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ClouddirectoryServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CloudformationServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CloudfrontServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CloudhsmServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Cloudhsmv2ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CloudsearchServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CloudtrailDataServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CloudtrailServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodeartifactServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodebuildServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodecatalystServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodecommitServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodedeployServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodeguruReviewerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodepipelineServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodestarConnectionsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodestarNotificationsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CodestarServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CognitoIdentityServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CognitoIdpServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CognitoSyncServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ComprehendServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ComprehendmedicalServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ComputeOptimizerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ConfigServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ConnectCampaignsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ConnectServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ContactLensServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ControltowerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CostOptimizationHubServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.CurServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DataAtsIotServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DataIotServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DataJobsIotServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DataMediastoreServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DatabrewServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DataexchangeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DatapipelineServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DatasyncServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DatazoneServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DaxServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DevicefarmServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DevopsGuruServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DirectconnectServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DiscoveryServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DlmServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DmsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DocdbServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DrsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.DynamodbServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EbsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Ec2ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EcsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EdgeSagemakerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EksAuthServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EksServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ElasticacheServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ElasticbeanstalkServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ElasticfilesystemServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ElasticloadbalancingServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ElasticmapreduceServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ElastictranscoderServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EmailServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EmrContainersServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EmrServerlessServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EnhancedS3ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EntitlementMarketplaceServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EventsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.EvidentlyServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.FinspaceApiServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.FinspaceServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.FirehoseServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.FmsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ForecastServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ForecastqueryServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.FrauddetectorServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.FsxServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.GameliftServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.GeoServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.GlacierServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.GlueServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.GrafanaServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.GreengrassServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.GroundstationServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.GuarddutyServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.HealthServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.HealthlakeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.HoneycodeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IamServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IdentityChimeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IdentitystoreServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ImportexportServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IngestTimestreamServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Inspector2ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.InspectorServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.InternetmonitorServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IotServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IotanalyticsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IoteventsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IoteventsdataServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IotfleetwiseServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IotroborunnerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IotsecuredtunnelingServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IotsitewiseServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IotthingsgraphServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IottwinmakerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IotwirelessServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IvsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IvschatServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.IvsrealtimeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.KafkaServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.KafkaconnectServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.KendraRankingServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.KendraServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.KinesisServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.KinesisanalyticsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.KinesisvideoServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.KmsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LakeformationServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LambdaServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LicenseManagerLinuxSubscriptionsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LicenseManagerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LicenseManagerUserSubscriptionsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LightsailServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LogsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LookoutequipmentServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LookoutmetricsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.LookoutvisionServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.M2ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MachinelearningServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Macie2ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ManagedblockchainQueryServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ManagedblockchainServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MarketplacecommerceanalyticsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MediaPipelinesChimeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MediaconnectServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MediaconvertServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MedialiveServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MediapackageServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MediapackageVodServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Mediapackagev2ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MediastoreServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MeetingsChimeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MemoryDbServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MessagingChimeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MeteringMarketplaceServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MetricsSagemakerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MghServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MgnServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MigrationhubOrchestratorServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MigrationhubStrategyServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MobileanalyticsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ModelsLexServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ModelsV2LexServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MonitoringServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MqServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.MturkRequesterServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.NeptuneServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.NetworkFirewallServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.NetworkmanagerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.NimbleServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.OamServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.OidcServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.OmicsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.OpsworksCmServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.OpsworksServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.OrganizationsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.OsisServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.OutpostsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ParticipantConnectServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.PersonalizeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.PiServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.PinpointServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.PipesServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.PollyServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.PortalSsoServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.PrivateNetworksServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ProfileServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ProjectsIot1clickServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ProtonServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.QbusinessServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.QldbServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.QuicksightServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RamServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RbinServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RdsDataServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RdsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RedshiftServerlessServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RedshiftServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RekognitionServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ResiliencehubServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ResourceExplorer2ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ResourceGroupsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RobomakerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RolesanywhereServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Route53RecoveryControlConfigServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Route53ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Route53domainsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Route53resolverServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RumServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RuntimeLexServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RuntimeSagemakerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.RuntimeV2LexServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.S3ControlServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.S3OutpostsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SagemakerGeospatialServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SavingsplansServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SchedulerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SchemasServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SdbServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SecretsmanagerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SecurityhubServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SecuritylakeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ServerlessrepoServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ServicecatalogAppregistryServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ServicecatalogServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ServicediscoveryServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ServicequotasServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SessionQldbServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ShieldServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SignerServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SimspaceweaverServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SmsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SmsVoiceServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SnowballServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SnsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SqsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SsmContactsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SsmIncidentsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SsmSapServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SsmServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SsoServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.StatesServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.StoragegatewayServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.StreamsDynamodbServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.StsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SupportServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SupportappServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SwfServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.SyntheticsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.TaggingServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.TextractServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.ThinclientServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.TnbServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.TranscribeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.TranscribestreamingServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.TransferServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.TranslateServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.VerifiedpermissionsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.VoiceChimeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.VoiceidServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.VpcLatticeServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.WafRegionalServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.WafServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.Wafv2ServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.WellarchitectedServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.WisdomServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.WorkdocsServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.WorkmailServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.WorkspacesServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.WorkspacesWebServiceMetadata;
import software.amazon.awssdk.regions.servicemetadata.XrayServiceMetadata;
import software.amazon.awssdk.utils.ImmutableMap;

@Generated("software.amazon.awssdk:codegen")
@SdkPublicApi
public final class GeneratedServiceMetadataProvider implements ServiceMetadataProvider {
    private static final Map<String, ServiceMetadata> SERVICE_METADATA = ImmutableMap.<String, ServiceMetadata> builder()
            .put("a4b", new A4bServiceMetadata()).put("access-analyzer", new AccessAnalyzerServiceMetadata())
            .put("account", new AccountServiceMetadata()).put("acm", new AcmServiceMetadata())
            .put("acm-pca", new AcmPcaServiceMetadata()).put("agreement-marketplace", new AgreementMarketplaceServiceMetadata())
            .put("airflow", new AirflowServiceMetadata()).put("amplify", new AmplifyServiceMetadata())
            .put("amplifybackend", new AmplifybackendServiceMetadata())
            .put("amplifyuibuilder", new AmplifyuibuilderServiceMetadata()).put("aoss", new AossServiceMetadata())
            .put("api.detective", new ApiDetectiveServiceMetadata()).put("api.ecr", new ApiEcrServiceMetadata())
            .put("api.ecr-public", new ApiEcrPublicServiceMetadata())
            .put("api.elastic-inference", new ApiElasticInferenceServiceMetadata())
            .put("api.fleethub.iot", new ApiFleethubIotServiceMetadata())
            .put("api.iotdeviceadvisor", new ApiIotdeviceadvisorServiceMetadata())
            .put("api.iotwireless", new ApiIotwirelessServiceMetadata())
            .put("api.mediatailor", new ApiMediatailorServiceMetadata()).put("api.pricing", new ApiPricingServiceMetadata())
            .put("api.sagemaker", new ApiSagemakerServiceMetadata())
            .put("api.tunneling.iot", new ApiTunnelingIotServiceMetadata()).put("apigateway", new ApigatewayServiceMetadata())
            .put("app-integrations", new AppIntegrationsServiceMetadata()).put("appconfig", new AppconfigServiceMetadata())
            .put("appconfigdata", new AppconfigdataServiceMetadata()).put("appflow", new AppflowServiceMetadata())
            .put("application-autoscaling", new ApplicationAutoscalingServiceMetadata())
            .put("applicationinsights", new ApplicationinsightsServiceMetadata()).put("appmesh", new AppmeshServiceMetadata())
            .put("apprunner", new ApprunnerServiceMetadata()).put("appstream2", new Appstream2ServiceMetadata())
            .put("appsync", new AppsyncServiceMetadata()).put("aps", new ApsServiceMetadata())
            .put("arc-zonal-shift", new ArcZonalShiftServiceMetadata()).put("athena", new AthenaServiceMetadata())
            .put("auditmanager", new AuditmanagerServiceMetadata()).put("autoscaling", new AutoscalingServiceMetadata())
            .put("autoscaling-plans", new AutoscalingPlansServiceMetadata()).put("backup", new BackupServiceMetadata())
            .put("backup-gateway", new BackupGatewayServiceMetadata()).put("backupstorage", new BackupstorageServiceMetadata())
            .put("batch", new BatchServiceMetadata()).put("bedrock", new BedrockServiceMetadata())
            .put("billingconductor", new BillingconductorServiceMetadata()).put("braket", new BraketServiceMetadata())
            .put("budgets", new BudgetsServiceMetadata()).put("cases", new CasesServiceMetadata())
            .put("cassandra", new CassandraServiceMetadata()).put("catalog.marketplace", new CatalogMarketplaceServiceMetadata())
            .put("ce", new CeServiceMetadata()).put("chime", new ChimeServiceMetadata())
            .put("cleanrooms", new CleanroomsServiceMetadata()).put("cloud9", new Cloud9ServiceMetadata())
            .put("cloudcontrolapi", new CloudcontrolapiServiceMetadata())
            .put("clouddirectory", new ClouddirectoryServiceMetadata())
            .put("cloudformation", new CloudformationServiceMetadata()).put("cloudfront", new CloudfrontServiceMetadata())
            .put("cloudhsm", new CloudhsmServiceMetadata()).put("cloudhsmv2", new Cloudhsmv2ServiceMetadata())
            .put("cloudsearch", new CloudsearchServiceMetadata()).put("cloudtrail", new CloudtrailServiceMetadata())
            .put("cloudtrail-data", new CloudtrailDataServiceMetadata()).put("codeartifact", new CodeartifactServiceMetadata())
            .put("codebuild", new CodebuildServiceMetadata()).put("codecatalyst", new CodecatalystServiceMetadata())
            .put("codecommit", new CodecommitServiceMetadata()).put("codedeploy", new CodedeployServiceMetadata())
            .put("codeguru-reviewer", new CodeguruReviewerServiceMetadata())
            .put("codepipeline", new CodepipelineServiceMetadata()).put("codestar", new CodestarServiceMetadata())
            .put("codestar-connections", new CodestarConnectionsServiceMetadata())
            .put("codestar-notifications", new CodestarNotificationsServiceMetadata())
            .put("cognito-identity", new CognitoIdentityServiceMetadata()).put("cognito-idp", new CognitoIdpServiceMetadata())
            .put("cognito-sync", new CognitoSyncServiceMetadata()).put("comprehend", new ComprehendServiceMetadata())
            .put("comprehendmedical", new ComprehendmedicalServiceMetadata())
            .put("compute-optimizer", new ComputeOptimizerServiceMetadata()).put("config", new ConfigServiceMetadata())
            .put("connect", new ConnectServiceMetadata()).put("connect-campaigns", new ConnectCampaignsServiceMetadata())
            .put("contact-lens", new ContactLensServiceMetadata()).put("controltower", new ControltowerServiceMetadata())
            .put("cost-optimization-hub", new CostOptimizationHubServiceMetadata()).put("cur", new CurServiceMetadata())
            .put("data-ats.iot", new DataAtsIotServiceMetadata()).put("data.iot", new DataIotServiceMetadata())
            .put("data.jobs.iot", new DataJobsIotServiceMetadata()).put("data.mediastore", new DataMediastoreServiceMetadata())
            .put("databrew", new DatabrewServiceMetadata()).put("dataexchange", new DataexchangeServiceMetadata())
            .put("datapipeline", new DatapipelineServiceMetadata()).put("datasync", new DatasyncServiceMetadata())
            .put("datazone", new DatazoneServiceMetadata()).put("dax", new DaxServiceMetadata())
            .put("devicefarm", new DevicefarmServiceMetadata()).put("devops-guru", new DevopsGuruServiceMetadata())
            .put("directconnect", new DirectconnectServiceMetadata()).put("discovery", new DiscoveryServiceMetadata())
            .put("dlm", new DlmServiceMetadata()).put("dms", new DmsServiceMetadata()).put("docdb", new DocdbServiceMetadata())
            .put("drs", new DrsServiceMetadata()).put("ds", new DsServiceMetadata())
            .put("dynamodb", new DynamodbServiceMetadata()).put("ebs", new EbsServiceMetadata())
            .put("ec2", new Ec2ServiceMetadata()).put("ecs", new EcsServiceMetadata())
            .put("edge.sagemaker", new EdgeSagemakerServiceMetadata()).put("eks", new EksServiceMetadata())
            .put("eks-auth", new EksAuthServiceMetadata()).put("elasticache", new ElasticacheServiceMetadata())
            .put("elasticbeanstalk", new ElasticbeanstalkServiceMetadata())
            .put("elasticfilesystem", new ElasticfilesystemServiceMetadata())
            .put("elasticloadbalancing", new ElasticloadbalancingServiceMetadata())
            .put("elasticmapreduce", new ElasticmapreduceServiceMetadata())
            .put("elastictranscoder", new ElastictranscoderServiceMetadata()).put("email", new EmailServiceMetadata())
            .put("emr-containers", new EmrContainersServiceMetadata()).put("emr-serverless", new EmrServerlessServiceMetadata())
            .put("entitlement.marketplace", new EntitlementMarketplaceServiceMetadata()).put("es", new EsServiceMetadata())
            .put("events", new EventsServiceMetadata()).put("evidently", new EvidentlyServiceMetadata())
            .put("finspace", new FinspaceServiceMetadata()).put("finspace-api", new FinspaceApiServiceMetadata())
            .put("firehose", new FirehoseServiceMetadata()).put("fms", new FmsServiceMetadata())
            .put("forecast", new ForecastServiceMetadata()).put("forecastquery", new ForecastqueryServiceMetadata())
            .put("frauddetector", new FrauddetectorServiceMetadata()).put("fsx", new FsxServiceMetadata())
            .put("gamelift", new GameliftServiceMetadata()).put("geo", new GeoServiceMetadata())
            .put("glacier", new GlacierServiceMetadata()).put("glue", new GlueServiceMetadata())
            .put("grafana", new GrafanaServiceMetadata()).put("greengrass", new GreengrassServiceMetadata())
            .put("groundstation", new GroundstationServiceMetadata()).put("guardduty", new GuarddutyServiceMetadata())
            .put("health", new HealthServiceMetadata()).put("healthlake", new HealthlakeServiceMetadata())
            .put("honeycode", new HoneycodeServiceMetadata()).put("iam", new IamServiceMetadata())
            .put("identity-chime", new IdentityChimeServiceMetadata()).put("identitystore", new IdentitystoreServiceMetadata())
            .put("importexport", new ImportexportServiceMetadata())
            .put("ingest.timestream", new IngestTimestreamServiceMetadata()).put("inspector", new InspectorServiceMetadata())
            .put("inspector2", new Inspector2ServiceMetadata()).put("internetmonitor", new InternetmonitorServiceMetadata())
            .put("iot", new IotServiceMetadata()).put("iotanalytics", new IotanalyticsServiceMetadata())
            .put("iotevents", new IoteventsServiceMetadata()).put("ioteventsdata", new IoteventsdataServiceMetadata())
            .put("iotfleetwise", new IotfleetwiseServiceMetadata()).put("iotroborunner", new IotroborunnerServiceMetadata())
            .put("iotsecuredtunneling", new IotsecuredtunnelingServiceMetadata())
            .put("iotsitewise", new IotsitewiseServiceMetadata()).put("iotthingsgraph", new IotthingsgraphServiceMetadata())
            .put("iottwinmaker", new IottwinmakerServiceMetadata()).put("iotwireless", new IotwirelessServiceMetadata())
            .put("ivs", new IvsServiceMetadata()).put("ivschat", new IvschatServiceMetadata())
            .put("ivsrealtime", new IvsrealtimeServiceMetadata()).put("kafka", new KafkaServiceMetadata())
            .put("kafkaconnect", new KafkaconnectServiceMetadata()).put("kendra", new KendraServiceMetadata())
            .put("kendra-ranking", new KendraRankingServiceMetadata()).put("kinesis", new KinesisServiceMetadata())
            .put("kinesisanalytics", new KinesisanalyticsServiceMetadata())
            .put("kinesisvideo", new KinesisvideoServiceMetadata()).put("kms", new KmsServiceMetadata())
            .put("lakeformation", new LakeformationServiceMetadata()).put("lambda", new LambdaServiceMetadata())
            .put("license-manager", new LicenseManagerServiceMetadata())
            .put("license-manager-linux-subscriptions", new LicenseManagerLinuxSubscriptionsServiceMetadata())
            .put("license-manager-user-subscriptions", new LicenseManagerUserSubscriptionsServiceMetadata())
            .put("lightsail", new LightsailServiceMetadata()).put("logs", new LogsServiceMetadata())
            .put("lookoutequipment", new LookoutequipmentServiceMetadata())
            .put("lookoutmetrics", new LookoutmetricsServiceMetadata()).put("lookoutvision", new LookoutvisionServiceMetadata())
            .put("m2", new M2ServiceMetadata()).put("machinelearning", new MachinelearningServiceMetadata())
            .put("macie2", new Macie2ServiceMetadata()).put("managedblockchain", new ManagedblockchainServiceMetadata())
            .put("managedblockchain-query", new ManagedblockchainQueryServiceMetadata())
            .put("marketplacecommerceanalytics", new MarketplacecommerceanalyticsServiceMetadata())
            .put("media-pipelines-chime", new MediaPipelinesChimeServiceMetadata())
            .put("mediaconnect", new MediaconnectServiceMetadata()).put("mediaconvert", new MediaconvertServiceMetadata())
            .put("medialive", new MedialiveServiceMetadata()).put("mediapackage", new MediapackageServiceMetadata())
            .put("mediapackage-vod", new MediapackageVodServiceMetadata())
            .put("mediapackagev2", new Mediapackagev2ServiceMetadata()).put("mediastore", new MediastoreServiceMetadata())
            .put("meetings-chime", new MeetingsChimeServiceMetadata()).put("memory-db", new MemoryDbServiceMetadata())
            .put("messaging-chime", new MessagingChimeServiceMetadata())
            .put("metering.marketplace", new MeteringMarketplaceServiceMetadata())
            .put("metrics.sagemaker", new MetricsSagemakerServiceMetadata()).put("mgh", new MghServiceMetadata())
            .put("mgn", new MgnServiceMetadata()).put("migrationhub-orchestrator", new MigrationhubOrchestratorServiceMetadata())
            .put("migrationhub-strategy", new MigrationhubStrategyServiceMetadata())
            .put("mobileanalytics", new MobileanalyticsServiceMetadata()).put("models-v2-lex", new ModelsV2LexServiceMetadata())
            .put("models.lex", new ModelsLexServiceMetadata()).put("monitoring", new MonitoringServiceMetadata())
            .put("mq", new MqServiceMetadata()).put("mturk-requester", new MturkRequesterServiceMetadata())
            .put("neptune", new NeptuneServiceMetadata()).put("network-firewall", new NetworkFirewallServiceMetadata())
            .put("networkmanager", new NetworkmanagerServiceMetadata()).put("nimble", new NimbleServiceMetadata())
            .put("oam", new OamServiceMetadata()).put("oidc", new OidcServiceMetadata()).put("omics", new OmicsServiceMetadata())
            .put("opsworks", new OpsworksServiceMetadata()).put("opsworks-cm", new OpsworksCmServiceMetadata())
            .put("organizations", new OrganizationsServiceMetadata()).put("osis", new OsisServiceMetadata())
            .put("outposts", new OutpostsServiceMetadata()).put("participant.connect", new ParticipantConnectServiceMetadata())
            .put("personalize", new PersonalizeServiceMetadata()).put("pi", new PiServiceMetadata())
            .put("pinpoint", new PinpointServiceMetadata()).put("pipes", new PipesServiceMetadata())
            .put("polly", new PollyServiceMetadata()).put("portal.sso", new PortalSsoServiceMetadata())
            .put("private-networks", new PrivateNetworksServiceMetadata()).put("profile", new ProfileServiceMetadata())
            .put("projects.iot1click", new ProjectsIot1clickServiceMetadata()).put("proton", new ProtonServiceMetadata())
            .put("qbusiness", new QbusinessServiceMetadata()).put("qldb", new QldbServiceMetadata())
            .put("quicksight", new QuicksightServiceMetadata()).put("ram", new RamServiceMetadata())
            .put("rbin", new RbinServiceMetadata()).put("rds", new RdsServiceMetadata())
            .put("rds-data", new RdsDataServiceMetadata()).put("redshift", new RedshiftServiceMetadata())
            .put("redshift-serverless", new RedshiftServerlessServiceMetadata())
            .put("rekognition", new RekognitionServiceMetadata()).put("resiliencehub", new ResiliencehubServiceMetadata())
            .put("resource-explorer-2", new ResourceExplorer2ServiceMetadata())
            .put("resource-groups", new ResourceGroupsServiceMetadata()).put("robomaker", new RobomakerServiceMetadata())
            .put("rolesanywhere", new RolesanywhereServiceMetadata()).put("route53", new Route53ServiceMetadata())
            .put("route53-recovery-control-config", new Route53RecoveryControlConfigServiceMetadata())
            .put("route53domains", new Route53domainsServiceMetadata())
            .put("route53resolver", new Route53resolverServiceMetadata()).put("rum", new RumServiceMetadata())
            .put("runtime-v2-lex", new RuntimeV2LexServiceMetadata()).put("runtime.lex", new RuntimeLexServiceMetadata())
            .put("runtime.sagemaker", new RuntimeSagemakerServiceMetadata()).put("s3", new EnhancedS3ServiceMetadata())
            .put("s3-control", new S3ControlServiceMetadata()).put("s3-outposts", new S3OutpostsServiceMetadata())
            .put("sagemaker-geospatial", new SagemakerGeospatialServiceMetadata())
            .put("savingsplans", new SavingsplansServiceMetadata()).put("scheduler", new SchedulerServiceMetadata())
            .put("schemas", new SchemasServiceMetadata()).put("sdb", new SdbServiceMetadata())
            .put("secretsmanager", new SecretsmanagerServiceMetadata()).put("securityhub", new SecurityhubServiceMetadata())
            .put("securitylake", new SecuritylakeServiceMetadata()).put("serverlessrepo", new ServerlessrepoServiceMetadata())
            .put("servicecatalog", new ServicecatalogServiceMetadata())
            .put("servicecatalog-appregistry", new ServicecatalogAppregistryServiceMetadata())
            .put("servicediscovery", new ServicediscoveryServiceMetadata())
            .put("servicequotas", new ServicequotasServiceMetadata()).put("session.qldb", new SessionQldbServiceMetadata())
            .put("shield", new ShieldServiceMetadata()).put("signer", new SignerServiceMetadata())
            .put("simspaceweaver", new SimspaceweaverServiceMetadata()).put("sms", new SmsServiceMetadata())
            .put("sms-voice", new SmsVoiceServiceMetadata()).put("snowball", new SnowballServiceMetadata())
            .put("sns", new SnsServiceMetadata()).put("sqs", new SqsServiceMetadata()).put("ssm", new SsmServiceMetadata())
            .put("ssm-contacts", new SsmContactsServiceMetadata()).put("ssm-incidents", new SsmIncidentsServiceMetadata())
            .put("ssm-sap", new SsmSapServiceMetadata()).put("sso", new SsoServiceMetadata())
            .put("states", new StatesServiceMetadata()).put("storagegateway", new StoragegatewayServiceMetadata())
            .put("streams.dynamodb", new StreamsDynamodbServiceMetadata()).put("sts", new StsServiceMetadata())
            .put("support", new SupportServiceMetadata()).put("supportapp", new SupportappServiceMetadata())
            .put("swf", new SwfServiceMetadata()).put("synthetics", new SyntheticsServiceMetadata())
            .put("tagging", new TaggingServiceMetadata()).put("textract", new TextractServiceMetadata())
            .put("thinclient", new ThinclientServiceMetadata()).put("tnb", new TnbServiceMetadata())
            .put("transcribe", new TranscribeServiceMetadata())
            .put("transcribestreaming", new TranscribestreamingServiceMetadata()).put("transfer", new TransferServiceMetadata())
            .put("translate", new TranslateServiceMetadata())
            .put("verifiedpermissions", new VerifiedpermissionsServiceMetadata())
            .put("voice-chime", new VoiceChimeServiceMetadata()).put("voiceid", new VoiceidServiceMetadata())
            .put("vpc-lattice", new VpcLatticeServiceMetadata()).put("waf", new WafServiceMetadata())
            .put("waf-regional", new WafRegionalServiceMetadata()).put("wafv2", new Wafv2ServiceMetadata())
            .put("wellarchitected", new WellarchitectedServiceMetadata()).put("wisdom", new WisdomServiceMetadata())
            .put("workdocs", new WorkdocsServiceMetadata()).put("workmail", new WorkmailServiceMetadata())
            .put("workspaces", new WorkspacesServiceMetadata()).put("workspaces-web", new WorkspacesWebServiceMetadata())
            .put("xray", new XrayServiceMetadata()).build();

    public ServiceMetadata serviceMetadata(String endpointPrefix) {
        return SERVICE_METADATA.get(endpointPrefix);
    }
}
