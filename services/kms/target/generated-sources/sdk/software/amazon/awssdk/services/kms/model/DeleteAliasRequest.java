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

package software.amazon.awssdk.services.kms.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.awscore.AwsRequestOverrideConfiguration;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 */
@Generated("software.amazon.awssdk:codegen")
public final class DeleteAliasRequest extends KmsRequest implements
        ToCopyableBuilder<DeleteAliasRequest.Builder, DeleteAliasRequest> {
    private static final SdkField<String> ALIAS_NAME_FIELD = SdkField.<String> builder(MarshallingType.STRING)
            .memberName("AliasName").getter(getter(DeleteAliasRequest::aliasName)).setter(setter(Builder::aliasName))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("AliasName").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ALIAS_NAME_FIELD));

    private final String aliasName;

    private DeleteAliasRequest(BuilderImpl builder) {
        super(builder);
        this.aliasName = builder.aliasName;
    }

    /**
     * <p>
     * The alias to be deleted. The alias name must begin with <code>alias/</code> followed by the alias name, such as
     * <code>alias/ExampleAlias</code>.
     * </p>
     * 
     * @return The alias to be deleted. The alias name must begin with <code>alias/</code> followed by the alias name,
     *         such as <code>alias/ExampleAlias</code>.
     */
    public final String aliasName() {
        return aliasName;
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    public static Builder builder() {
        return new BuilderImpl();
    }

    public static Class<? extends Builder> serializableBuilderClass() {
        return BuilderImpl.class;
    }

    @Override
    public final int hashCode() {
        int hashCode = 1;
        hashCode = 31 * hashCode + super.hashCode();
        hashCode = 31 * hashCode + Objects.hashCode(aliasName());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return super.equals(obj) && equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DeleteAliasRequest)) {
            return false;
        }
        DeleteAliasRequest other = (DeleteAliasRequest) obj;
        return Objects.equals(aliasName(), other.aliasName());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("DeleteAliasRequest").add("AliasName", aliasName()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "AliasName":
            return Optional.ofNullable(clazz.cast(aliasName()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<DeleteAliasRequest, T> g) {
        return obj -> g.apply((DeleteAliasRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends KmsRequest.Builder, SdkPojo, CopyableBuilder<Builder, DeleteAliasRequest> {
        /**
         * <p>
         * The alias to be deleted. The alias name must begin with <code>alias/</code> followed by the alias name, such
         * as <code>alias/ExampleAlias</code>.
         * </p>
         * 
         * @param aliasName
         *        The alias to be deleted. The alias name must begin with <code>alias/</code> followed by the alias
         *        name, such as <code>alias/ExampleAlias</code>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder aliasName(String aliasName);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends KmsRequest.BuilderImpl implements Builder {
        private String aliasName;

        private BuilderImpl() {
        }

        private BuilderImpl(DeleteAliasRequest model) {
            super(model);
            aliasName(model.aliasName);
        }

        public final String getAliasName() {
            return aliasName;
        }

        public final void setAliasName(String aliasName) {
            this.aliasName = aliasName;
        }

        @Override
        public final Builder aliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }

        @Override
        public Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration) {
            super.overrideConfiguration(overrideConfiguration);
            return this;
        }

        @Override
        public Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer) {
            super.overrideConfiguration(builderConsumer);
            return this;
        }

        @Override
        public DeleteAliasRequest build() {
            return new DeleteAliasRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
