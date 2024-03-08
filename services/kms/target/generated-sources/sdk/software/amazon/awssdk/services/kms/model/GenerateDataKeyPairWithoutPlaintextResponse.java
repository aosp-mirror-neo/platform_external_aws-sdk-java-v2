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

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import software.amazon.awssdk.annotations.Generated;
import software.amazon.awssdk.core.SdkBytes;
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
public final class GenerateDataKeyPairWithoutPlaintextResponse extends KmsResponse implements
        ToCopyableBuilder<GenerateDataKeyPairWithoutPlaintextResponse.Builder, GenerateDataKeyPairWithoutPlaintextResponse> {
    private static final SdkField<SdkBytes> PRIVATE_KEY_CIPHERTEXT_BLOB_FIELD = SdkField
            .<SdkBytes> builder(MarshallingType.SDK_BYTES).memberName("PrivateKeyCiphertextBlob")
            .getter(getter(GenerateDataKeyPairWithoutPlaintextResponse::privateKeyCiphertextBlob))
            .setter(setter(Builder::privateKeyCiphertextBlob))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("PrivateKeyCiphertextBlob").build())
            .build();

    private static final SdkField<SdkBytes> PUBLIC_KEY_FIELD = SdkField.<SdkBytes> builder(MarshallingType.SDK_BYTES)
            .memberName("PublicKey").getter(getter(GenerateDataKeyPairWithoutPlaintextResponse::publicKey))
            .setter(setter(Builder::publicKey))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("PublicKey").build()).build();

    private static final SdkField<String> KEY_ID_FIELD = SdkField.<String> builder(MarshallingType.STRING).memberName("KeyId")
            .getter(getter(GenerateDataKeyPairWithoutPlaintextResponse::keyId)).setter(setter(Builder::keyId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KeyId").build()).build();

    private static final SdkField<String> KEY_PAIR_SPEC_FIELD = SdkField.<String> builder(MarshallingType.STRING)
            .memberName("KeyPairSpec").getter(getter(GenerateDataKeyPairWithoutPlaintextResponse::keyPairSpecAsString))
            .setter(setter(Builder::keyPairSpec))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KeyPairSpec").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(
            PRIVATE_KEY_CIPHERTEXT_BLOB_FIELD, PUBLIC_KEY_FIELD, KEY_ID_FIELD, KEY_PAIR_SPEC_FIELD));

    private final SdkBytes privateKeyCiphertextBlob;

    private final SdkBytes publicKey;

    private final String keyId;

    private final String keyPairSpec;

    private GenerateDataKeyPairWithoutPlaintextResponse(BuilderImpl builder) {
        super(builder);
        this.privateKeyCiphertextBlob = builder.privateKeyCiphertextBlob;
        this.publicKey = builder.publicKey;
        this.keyId = builder.keyId;
        this.keyPairSpec = builder.keyPairSpec;
    }

    /**
     * <p>
     * The encrypted copy of the private key. When you use the HTTP API or the Amazon Web Services CLI, the value is
     * Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * 
     * @return The encrypted copy of the private key. When you use the HTTP API or the Amazon Web Services CLI, the
     *         value is Base64-encoded. Otherwise, it is not Base64-encoded.
     */
    public final SdkBytes privateKeyCiphertextBlob() {
        return privateKeyCiphertextBlob;
    }

    /**
     * <p>
     * The public key (in plaintext). When you use the HTTP API or the Amazon Web Services CLI, the value is
     * Base64-encoded. Otherwise, it is not Base64-encoded.
     * </p>
     * 
     * @return The public key (in plaintext). When you use the HTTP API or the Amazon Web Services CLI, the value is
     *         Base64-encoded. Otherwise, it is not Base64-encoded.
     */
    public final SdkBytes publicKey() {
        return publicKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the KMS
     * key that encrypted the private key.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of
     *         the KMS key that encrypted the private key.
     */
    public final String keyId() {
        return keyId;
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #keyPairSpec} will
     * return {@link DataKeyPairSpec#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #keyPairSpecAsString}.
     * </p>
     * 
     * @return The type of data key pair that was generated.
     * @see DataKeyPairSpec
     */
    public final DataKeyPairSpec keyPairSpec() {
        return DataKeyPairSpec.fromValue(keyPairSpec);
    }

    /**
     * <p>
     * The type of data key pair that was generated.
     * </p>
     * <p>
     * If the service returns an enum value that is not available in the current SDK version, {@link #keyPairSpec} will
     * return {@link DataKeyPairSpec#UNKNOWN_TO_SDK_VERSION}. The raw value returned by the service is available from
     * {@link #keyPairSpecAsString}.
     * </p>
     * 
     * @return The type of data key pair that was generated.
     * @see DataKeyPairSpec
     */
    public final String keyPairSpecAsString() {
        return keyPairSpec;
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
        hashCode = 31 * hashCode + Objects.hashCode(privateKeyCiphertextBlob());
        hashCode = 31 * hashCode + Objects.hashCode(publicKey());
        hashCode = 31 * hashCode + Objects.hashCode(keyId());
        hashCode = 31 * hashCode + Objects.hashCode(keyPairSpecAsString());
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
        if (!(obj instanceof GenerateDataKeyPairWithoutPlaintextResponse)) {
            return false;
        }
        GenerateDataKeyPairWithoutPlaintextResponse other = (GenerateDataKeyPairWithoutPlaintextResponse) obj;
        return Objects.equals(privateKeyCiphertextBlob(), other.privateKeyCiphertextBlob())
                && Objects.equals(publicKey(), other.publicKey()) && Objects.equals(keyId(), other.keyId())
                && Objects.equals(keyPairSpecAsString(), other.keyPairSpecAsString());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GenerateDataKeyPairWithoutPlaintextResponse")
                .add("PrivateKeyCiphertextBlob", privateKeyCiphertextBlob()).add("PublicKey", publicKey()).add("KeyId", keyId())
                .add("KeyPairSpec", keyPairSpecAsString()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "PrivateKeyCiphertextBlob":
            return Optional.ofNullable(clazz.cast(privateKeyCiphertextBlob()));
        case "PublicKey":
            return Optional.ofNullable(clazz.cast(publicKey()));
        case "KeyId":
            return Optional.ofNullable(clazz.cast(keyId()));
        case "KeyPairSpec":
            return Optional.ofNullable(clazz.cast(keyPairSpecAsString()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GenerateDataKeyPairWithoutPlaintextResponse, T> g) {
        return obj -> g.apply((GenerateDataKeyPairWithoutPlaintextResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends KmsResponse.Builder, SdkPojo,
            CopyableBuilder<Builder, GenerateDataKeyPairWithoutPlaintextResponse> {
        /**
         * <p>
         * The encrypted copy of the private key. When you use the HTTP API or the Amazon Web Services CLI, the value is
         * Base64-encoded. Otherwise, it is not Base64-encoded.
         * </p>
         * 
         * @param privateKeyCiphertextBlob
         *        The encrypted copy of the private key. When you use the HTTP API or the Amazon Web Services CLI, the
         *        value is Base64-encoded. Otherwise, it is not Base64-encoded.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder privateKeyCiphertextBlob(SdkBytes privateKeyCiphertextBlob);

        /**
         * <p>
         * The public key (in plaintext). When you use the HTTP API or the Amazon Web Services CLI, the value is
         * Base64-encoded. Otherwise, it is not Base64-encoded.
         * </p>
         * 
         * @param publicKey
         *        The public key (in plaintext). When you use the HTTP API or the Amazon Web Services CLI, the value is
         *        Base64-encoded. Otherwise, it is not Base64-encoded.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder publicKey(SdkBytes publicKey);

        /**
         * <p>
         * The Amazon Resource Name (<a
         * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the
         * KMS key that encrypted the private key.
         * </p>
         * 
         * @param keyId
         *        The Amazon Resource Name (<a
         *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>)
         *        of the KMS key that encrypted the private key.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder keyId(String keyId);

        /**
         * <p>
         * The type of data key pair that was generated.
         * </p>
         * 
         * @param keyPairSpec
         *        The type of data key pair that was generated.
         * @see DataKeyPairSpec
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see DataKeyPairSpec
         */
        Builder keyPairSpec(String keyPairSpec);

        /**
         * <p>
         * The type of data key pair that was generated.
         * </p>
         * 
         * @param keyPairSpec
         *        The type of data key pair that was generated.
         * @see DataKeyPairSpec
         * @return Returns a reference to this object so that method calls can be chained together.
         * @see DataKeyPairSpec
         */
        Builder keyPairSpec(DataKeyPairSpec keyPairSpec);
    }

    static final class BuilderImpl extends KmsResponse.BuilderImpl implements Builder {
        private SdkBytes privateKeyCiphertextBlob;

        private SdkBytes publicKey;

        private String keyId;

        private String keyPairSpec;

        private BuilderImpl() {
        }

        private BuilderImpl(GenerateDataKeyPairWithoutPlaintextResponse model) {
            super(model);
            privateKeyCiphertextBlob(model.privateKeyCiphertextBlob);
            publicKey(model.publicKey);
            keyId(model.keyId);
            keyPairSpec(model.keyPairSpec);
        }

        public final ByteBuffer getPrivateKeyCiphertextBlob() {
            return privateKeyCiphertextBlob == null ? null : privateKeyCiphertextBlob.asByteBuffer();
        }

        public final void setPrivateKeyCiphertextBlob(ByteBuffer privateKeyCiphertextBlob) {
            privateKeyCiphertextBlob(privateKeyCiphertextBlob == null ? null : SdkBytes.fromByteBuffer(privateKeyCiphertextBlob));
        }

        @Override
        public final Builder privateKeyCiphertextBlob(SdkBytes privateKeyCiphertextBlob) {
            this.privateKeyCiphertextBlob = privateKeyCiphertextBlob;
            return this;
        }

        public final ByteBuffer getPublicKey() {
            return publicKey == null ? null : publicKey.asByteBuffer();
        }

        public final void setPublicKey(ByteBuffer publicKey) {
            publicKey(publicKey == null ? null : SdkBytes.fromByteBuffer(publicKey));
        }

        @Override
        public final Builder publicKey(SdkBytes publicKey) {
            this.publicKey = publicKey;
            return this;
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

        public final String getKeyPairSpec() {
            return keyPairSpec;
        }

        public final void setKeyPairSpec(String keyPairSpec) {
            this.keyPairSpec = keyPairSpec;
        }

        @Override
        public final Builder keyPairSpec(String keyPairSpec) {
            this.keyPairSpec = keyPairSpec;
            return this;
        }

        @Override
        public final Builder keyPairSpec(DataKeyPairSpec keyPairSpec) {
            this.keyPairSpec(keyPairSpec == null ? null : keyPairSpec.toString());
            return this;
        }

        @Override
        public GenerateDataKeyPairWithoutPlaintextResponse build() {
            return new GenerateDataKeyPairWithoutPlaintextResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
