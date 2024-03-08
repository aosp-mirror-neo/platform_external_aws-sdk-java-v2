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

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkField;
import software.amazon.awssdk.core.SdkPojo;
import software.amazon.awssdk.core.protocol.MarshallLocation;
import software.amazon.awssdk.core.protocol.MarshallingType;
import software.amazon.awssdk.core.traits.LocationTrait;
import software.amazon.awssdk.utils.ToString;
import software.amazon.awssdk.utils.builder.CopyableBuilder;
import software.amazon.awssdk.utils.builder.ToCopyableBuilder;

/**
 * <p>
 * Describes the primary or replica key in a multi-Region key.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class MultiRegionKey implements SdkPojo, Serializable, ToCopyableBuilder<MultiRegionKey.Builder, MultiRegionKey> {
    private static final SdkField<String> ARN_FIELD = SdkField.<String> builder(MarshallingType.STRING).memberName("Arn")
            .getter(getter(MultiRegionKey::arn)).setter(setter(Builder::arn))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Arn").build()).build();

    private static final SdkField<String> REGION_FIELD = SdkField.<String> builder(MarshallingType.STRING).memberName("Region")
            .getter(getter(MultiRegionKey::region)).setter(setter(Builder::region))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("Region").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(ARN_FIELD, REGION_FIELD));

    private static final long serialVersionUID = 1L;

    private final String arn;

    private final String region;

    private MultiRegionKey(BuilderImpl builder) {
        this.arn = builder.arn;
        this.region = builder.region;
    }

    /**
     * <p>
     * Displays the key ARN of a primary or replica key of a multi-Region key.
     * </p>
     * 
     * @return Displays the key ARN of a primary or replica key of a multi-Region key.
     */
    public final String arn() {
        return arn;
    }

    /**
     * <p>
     * Displays the Amazon Web Services Region of a primary or replica key in a multi-Region key.
     * </p>
     * 
     * @return Displays the Amazon Web Services Region of a primary or replica key in a multi-Region key.
     */
    public final String region() {
        return region;
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
        hashCode = 31 * hashCode + Objects.hashCode(arn());
        hashCode = 31 * hashCode + Objects.hashCode(region());
        return hashCode;
    }

    @Override
    public final boolean equals(Object obj) {
        return equalsBySdkFields(obj);
    }

    @Override
    public final boolean equalsBySdkFields(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MultiRegionKey)) {
            return false;
        }
        MultiRegionKey other = (MultiRegionKey) obj;
        return Objects.equals(arn(), other.arn()) && Objects.equals(region(), other.region());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("MultiRegionKey").add("Arn", arn()).add("Region", region()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "Arn":
            return Optional.ofNullable(clazz.cast(arn()));
        case "Region":
            return Optional.ofNullable(clazz.cast(region()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<MultiRegionKey, T> g) {
        return obj -> g.apply((MultiRegionKey) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, MultiRegionKey> {
        /**
         * <p>
         * Displays the key ARN of a primary or replica key of a multi-Region key.
         * </p>
         * 
         * @param arn
         *        Displays the key ARN of a primary or replica key of a multi-Region key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder arn(String arn);

        /**
         * <p>
         * Displays the Amazon Web Services Region of a primary or replica key in a multi-Region key.
         * </p>
         * 
         * @param region
         *        Displays the Amazon Web Services Region of a primary or replica key in a multi-Region key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder region(String region);
    }

    static final class BuilderImpl implements Builder {
        private String arn;

        private String region;

        private BuilderImpl() {
        }

        private BuilderImpl(MultiRegionKey model) {
            arn(model.arn);
            region(model.region);
        }

        public final String getArn() {
            return arn;
        }

        public final void setArn(String arn) {
            this.arn = arn;
        }

        @Override
        public final Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        public final String getRegion() {
            return region;
        }

        public final void setRegion(String region) {
            this.region = region;
        }

        @Override
        public final Builder region(String region) {
            this.region = region;
            return this;
        }

        @Override
        public MultiRegionKey build() {
            return new MultiRegionKey(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
