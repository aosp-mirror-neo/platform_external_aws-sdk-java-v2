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
public final class ScheduleKeyDeletionRequest extends KmsRequest implements
        ToCopyableBuilder<ScheduleKeyDeletionRequest.Builder, ScheduleKeyDeletionRequest> {
    private static final SdkField<String> KEY_ID_FIELD = SdkField.<String> builder(MarshallingType.STRING).memberName("KeyId")
            .getter(getter(ScheduleKeyDeletionRequest::keyId)).setter(setter(Builder::keyId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KeyId").build()).build();

    private static final SdkField<Integer> PENDING_WINDOW_IN_DAYS_FIELD = SdkField.<Integer> builder(MarshallingType.INTEGER)
            .memberName("PendingWindowInDays").getter(getter(ScheduleKeyDeletionRequest::pendingWindowInDays))
            .setter(setter(Builder::pendingWindowInDays))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("PendingWindowInDays").build())
            .build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(KEY_ID_FIELD,
            PENDING_WINDOW_IN_DAYS_FIELD));

    private final String keyId;

    private final Integer pendingWindowInDays;

    private ScheduleKeyDeletionRequest(BuilderImpl builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.pendingWindowInDays = builder.pendingWindowInDays;
    }

    /**
     * <p>
     * The unique identifier of the KMS key to delete.
     * </p>
     * <p>
     * Specify the key ID or key ARN of the KMS key.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     * </p>
     * 
     * @return The unique identifier of the KMS key to delete.</p>
     *         <p>
     *         Specify the key ID or key ARN of the KMS key.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
     */
    public final String keyId() {
        return keyId;
    }

    /**
     * <p>
     * The waiting period, specified in number of days. After the waiting period ends, KMS deletes the KMS key.
     * </p>
     * <p>
     * If the KMS key is a multi-Region primary key with replica keys, the waiting period begins when the last of its
     * replica keys is deleted. Otherwise, the waiting period begins immediately.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 7 and 30, inclusive. If you do not include a
     * value, it defaults to 30. You can use the <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
     * > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a> condition key to further constrain the values that
     * principals can specify in the <code>PendingWindowInDays</code> parameter.
     * </p>
     * 
     * @return The waiting period, specified in number of days. After the waiting period ends, KMS deletes the KMS
     *         key.</p>
     *         <p>
     *         If the KMS key is a multi-Region primary key with replica keys, the waiting period begins when the last
     *         of its replica keys is deleted. Otherwise, the waiting period begins immediately.
     *         </p>
     *         <p>
     *         This value is optional. If you include a value, it must be between 7 and 30, inclusive. If you do not
     *         include a value, it defaults to 30. You can use the <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
     *         > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a> condition key to further constrain the
     *         values that principals can specify in the <code>PendingWindowInDays</code> parameter.
     */
    public final Integer pendingWindowInDays() {
        return pendingWindowInDays;
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
        hashCode = 31 * hashCode + Objects.hashCode(keyId());
        hashCode = 31 * hashCode + Objects.hashCode(pendingWindowInDays());
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
        if (!(obj instanceof ScheduleKeyDeletionRequest)) {
            return false;
        }
        ScheduleKeyDeletionRequest other = (ScheduleKeyDeletionRequest) obj;
        return Objects.equals(keyId(), other.keyId()) && Objects.equals(pendingWindowInDays(), other.pendingWindowInDays());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("ScheduleKeyDeletionRequest").add("KeyId", keyId())
                .add("PendingWindowInDays", pendingWindowInDays()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "KeyId":
            return Optional.ofNullable(clazz.cast(keyId()));
        case "PendingWindowInDays":
            return Optional.ofNullable(clazz.cast(pendingWindowInDays()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<ScheduleKeyDeletionRequest, T> g) {
        return obj -> g.apply((ScheduleKeyDeletionRequest) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends KmsRequest.Builder, SdkPojo, CopyableBuilder<Builder, ScheduleKeyDeletionRequest> {
        /**
         * <p>
         * The unique identifier of the KMS key to delete.
         * </p>
         * <p>
         * Specify the key ID or key ARN of the KMS key.
         * </p>
         * <p>
         * For example:
         * </p>
         * <ul>
         * <li>
         * <p>
         * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
         * </p>
         * </li>
         * <li>
         * <p>
         * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
         * </p>
         * </li>
         * </ul>
         * <p>
         * To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
         * </p>
         * 
         * @param keyId
         *        The unique identifier of the KMS key to delete.</p>
         *        <p>
         *        Specify the key ID or key ARN of the KMS key.
         *        </p>
         *        <p>
         *        For example:
         *        </p>
         *        <ul>
         *        <li>
         *        <p>
         *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
         *        </p>
         *        </li>
         *        <li>
         *        <p>
         *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
         *        </p>
         *        </li>
         *        </ul>
         *        <p>
         *        To get the key ID and key ARN for a KMS key, use <a>ListKeys</a> or <a>DescribeKey</a>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder keyId(String keyId);

        /**
         * <p>
         * The waiting period, specified in number of days. After the waiting period ends, KMS deletes the KMS key.
         * </p>
         * <p>
         * If the KMS key is a multi-Region primary key with replica keys, the waiting period begins when the last of
         * its replica keys is deleted. Otherwise, the waiting period begins immediately.
         * </p>
         * <p>
         * This value is optional. If you include a value, it must be between 7 and 30, inclusive. If you do not include
         * a value, it defaults to 30. You can use the <a href=
         * "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
         * > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a> condition key to further constrain the values
         * that principals can specify in the <code>PendingWindowInDays</code> parameter.
         * </p>
         * 
         * @param pendingWindowInDays
         *        The waiting period, specified in number of days. After the waiting period ends, KMS deletes the KMS
         *        key.</p>
         *        <p>
         *        If the KMS key is a multi-Region primary key with replica keys, the waiting period begins when the
         *        last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
         *        </p>
         *        <p>
         *        This value is optional. If you include a value, it must be between 7 and 30, inclusive. If you do not
         *        include a value, it defaults to 30. You can use the <a href=
         *        "https://docs.aws.amazon.com/kms/latest/developerguide/conditions-kms.html#conditions-kms-schedule-key-deletion-pending-window-in-days"
         *        > <code>kms:ScheduleKeyDeletionPendingWindowInDays</code> </a> condition key to further constrain the
         *        values that principals can specify in the <code>PendingWindowInDays</code> parameter.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder pendingWindowInDays(Integer pendingWindowInDays);

        @Override
        Builder overrideConfiguration(AwsRequestOverrideConfiguration overrideConfiguration);

        @Override
        Builder overrideConfiguration(Consumer<AwsRequestOverrideConfiguration.Builder> builderConsumer);
    }

    static final class BuilderImpl extends KmsRequest.BuilderImpl implements Builder {
        private String keyId;

        private Integer pendingWindowInDays;

        private BuilderImpl() {
        }

        private BuilderImpl(ScheduleKeyDeletionRequest model) {
            super(model);
            keyId(model.keyId);
            pendingWindowInDays(model.pendingWindowInDays);
        }

        public final String getKeyId() {
            return keyId;
        }

        public final void setKeyId(String keyId) {
            this.keyId = keyId;
        }

        @Override
        public final Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        public final Integer getPendingWindowInDays() {
            return pendingWindowInDays;
        }

        public final void setPendingWindowInDays(Integer pendingWindowInDays) {
            this.pendingWindowInDays = pendingWindowInDays;
        }

        @Override
        public final Builder pendingWindowInDays(Integer pendingWindowInDays) {
            this.pendingWindowInDays = pendingWindowInDays;
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
        public ScheduleKeyDeletionRequest build() {
            return new ScheduleKeyDeletionRequest(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
