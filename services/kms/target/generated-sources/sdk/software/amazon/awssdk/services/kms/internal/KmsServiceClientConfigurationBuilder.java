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

package software.amazon.awssdk.services.kms.internal;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.awscore.client.config.AwsClientOption;
import software.amazon.awssdk.core.client.config.ClientOverrideConfiguration;
import software.amazon.awssdk.core.client.config.SdkClientConfiguration;
import software.amazon.awssdk.core.client.config.SdkClientOption;
import software.amazon.awssdk.endpoints.EndpointProvider;
import software.amazon.awssdk.http.auth.spi.scheme.AuthScheme;
import software.amazon.awssdk.http.auth.spi.scheme.AuthSchemeProvider;
import software.amazon.awssdk.identity.spi.AwsCredentialsIdentity;
import software.amazon.awssdk.identity.spi.IdentityProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.kms.KmsServiceClientConfiguration;
import software.amazon.awssdk.services.kms.auth.scheme.KmsAuthSchemeProvider;
import software.amazon.awssdk.utils.Validate;

@Generated("software.amazon.awssdk:codegen")
@SdkInternalApi
public class KmsServiceClientConfigurationBuilder implements KmsServiceClientConfiguration.Builder {
    private final SdkClientConfiguration.Builder config;

    public KmsServiceClientConfigurationBuilder() {
        this(SdkClientConfiguration.builder());
    }

    public KmsServiceClientConfigurationBuilder(SdkClientConfiguration.Builder config) {
        this.config = config;
    }

    /**
     * Sets the value for client override configuration
     */
    @Override
    public KmsServiceClientConfiguration.Builder overrideConfiguration(ClientOverrideConfiguration overrideConfiguration) {
        config.putAll(overrideConfiguration);
        return this;
    }

    /**
     * Gets the value for client override configuration
     */
    @Override
    public ClientOverrideConfiguration overrideConfiguration() {
        return config.asOverrideConfigurationBuilder().build();
    }

    /**
     * Sets the value for endpoint override
     */
    @Override
    public KmsServiceClientConfiguration.Builder endpointOverride(URI endpointOverride) {
        if (endpointOverride != null) {
            config.option(SdkClientOption.ENDPOINT, endpointOverride);
            config.option(SdkClientOption.ENDPOINT_OVERRIDDEN, true);
        } else {
            config.option(SdkClientOption.ENDPOINT, null);
            config.option(SdkClientOption.ENDPOINT_OVERRIDDEN, false);
        }
        return this;
    }

    /**
     * Gets the value for endpoint override
     */
    @Override
    public URI endpointOverride() {
        if (Boolean.TRUE.equals(config.option(SdkClientOption.ENDPOINT_OVERRIDDEN))) {
            return config.option(SdkClientOption.ENDPOINT);
        }
        return null;
    }

    /**
     * Sets the value for endpoint provider
     */
    @Override
    public KmsServiceClientConfiguration.Builder endpointProvider(EndpointProvider endpointProvider) {
        config.option(SdkClientOption.ENDPOINT_PROVIDER, endpointProvider);
        return this;
    }

    /**
     * Gets the value for endpoint provider
     */
    @Override
    public EndpointProvider endpointProvider() {
        return config.option(SdkClientOption.ENDPOINT_PROVIDER);
    }

    /**
     * Sets the value for AWS region
     */
    @Override
    public KmsServiceClientConfiguration.Builder region(Region region) {
        config.option(AwsClientOption.AWS_REGION, region);
        return this;
    }

    /**
     * Gets the value for AWS region
     */
    @Override
    public Region region() {
        return config.option(AwsClientOption.AWS_REGION);
    }

    /**
     * Sets the value for credentials provider
     */
    @Override
    public KmsServiceClientConfiguration.Builder credentialsProvider(
            IdentityProvider<? extends AwsCredentialsIdentity> credentialsProvider) {
        config.option(AwsClientOption.CREDENTIALS_IDENTITY_PROVIDER, credentialsProvider);
        return this;
    }

    /**
     * Gets the value for credentials provider
     */
    @Override
    public IdentityProvider<? extends AwsCredentialsIdentity> credentialsProvider() {
        return config.option(AwsClientOption.CREDENTIALS_IDENTITY_PROVIDER);
    }

    @Override
    public KmsServiceClientConfiguration.Builder putAuthScheme(AuthScheme<?> authScheme) {
        config.computeOptionIfAbsent(SdkClientOption.AUTH_SCHEMES, HashMap::new).put(authScheme.schemeId(), authScheme);
        return this;
    }

    /**
     * Gets the value for auth schemes
     */
    @Override
    public Map<String, AuthScheme<?>> authSchemes() {
        Map<String, AuthScheme<?>> authSchemes = config.option(SdkClientOption.AUTH_SCHEMES);
        return Collections.unmodifiableMap(authSchemes == null ? Collections.emptyMap() : authSchemes);
    }

    /**
     * Sets the value for auth scheme provider
     */
    @Override
    public KmsServiceClientConfiguration.Builder authSchemeProvider(KmsAuthSchemeProvider authSchemeProvider) {
        config.option(SdkClientOption.AUTH_SCHEME_PROVIDER, authSchemeProvider);
        return this;
    }

    /**
     * Gets the value for auth scheme provider
     */
    @Override
    public KmsAuthSchemeProvider authSchemeProvider() {
        AuthSchemeProvider result = config.option(SdkClientOption.AUTH_SCHEME_PROVIDER);
        if (result == null) {
            return null;
        }
        return Validate.isInstanceOf(KmsAuthSchemeProvider.class, result, "Expected an instance of "
                + KmsAuthSchemeProvider.class.getSimpleName());
    }

    @Override
    public KmsServiceClientConfiguration build() {
        return new KmsServiceClientConfiguration(this);
    }
}
