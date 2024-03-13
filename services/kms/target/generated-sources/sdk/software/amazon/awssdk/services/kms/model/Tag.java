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
 * A key-value pair. A tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag
 * values can be empty (null) strings.
 * </p>
 * <important>
 * <p>
 * Do not include confidential or sensitive information in this field. This field may be displayed in plaintext in
 * CloudTrail logs and other output.
 * </p>
 * </important>
 * <p>
 * For information about the rules that apply to tag keys and tag values, see <a
 * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined Tag
 * Restrictions</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
 * </p>
 */
@Generated("software.amazon.awssdk:codegen")
public final class Tag implements SdkPojo, Serializable, ToCopyableBuilder<Tag.Builder, Tag> {
    private static final SdkField<String> TAG_KEY_FIELD = SdkField.<String> builder(MarshallingType.STRING).memberName("TagKey")
            .getter(getter(Tag::tagKey)).setter(setter(Builder::tagKey))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("TagKey").build()).build();

    private static final SdkField<String> TAG_VALUE_FIELD = SdkField.<String> builder(MarshallingType.STRING)
            .memberName("TagValue").getter(getter(Tag::tagValue)).setter(setter(Builder::tagValue))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("TagValue").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays
            .asList(TAG_KEY_FIELD, TAG_VALUE_FIELD));

    private static final long serialVersionUID = 1L;

    private final String tagKey;

    private final String tagValue;

    private Tag(BuilderImpl builder) {
        this.tagKey = builder.tagKey;
        this.tagValue = builder.tagValue;
    }

    /**
     * <p>
     * The key of the tag.
     * </p>
     * 
     * @return The key of the tag.
     */
    public final String tagKey() {
        return tagKey;
    }

    /**
     * <p>
     * The value of the tag.
     * </p>
     * 
     * @return The value of the tag.
     */
    public final String tagValue() {
        return tagValue;
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
        hashCode = 31 * hashCode + Objects.hashCode(tagKey());
        hashCode = 31 * hashCode + Objects.hashCode(tagValue());
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
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag other = (Tag) obj;
        return Objects.equals(tagKey(), other.tagKey()) && Objects.equals(tagValue(), other.tagValue());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("Tag").add("TagKey", tagKey()).add("TagValue", tagValue()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "TagKey":
            return Optional.ofNullable(clazz.cast(tagKey()));
        case "TagValue":
            return Optional.ofNullable(clazz.cast(tagValue()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<Tag, T> g) {
        return obj -> g.apply((Tag) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends SdkPojo, CopyableBuilder<Builder, Tag> {
        /**
         * <p>
         * The key of the tag.
         * </p>
         * 
         * @param tagKey
         *        The key of the tag.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tagKey(String tagKey);

        /**
         * <p>
         * The value of the tag.
         * </p>
         * 
         * @param tagValue
         *        The value of the tag.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder tagValue(String tagValue);
    }

    static final class BuilderImpl implements Builder {
        private String tagKey;

        private String tagValue;

        private BuilderImpl() {
        }

        private BuilderImpl(Tag model) {
            tagKey(model.tagKey);
            tagValue(model.tagValue);
        }

        public final String getTagKey() {
            return tagKey;
        }

        public final void setTagKey(String tagKey) {
            this.tagKey = tagKey;
        }

        @Override
        public final Builder tagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }

        public final String getTagValue() {
            return tagValue;
        }

        public final void setTagValue(String tagValue) {
            this.tagValue = tagValue;
        }

        @Override
        public final Builder tagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        @Override
        public Tag build() {
            return new Tag(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
