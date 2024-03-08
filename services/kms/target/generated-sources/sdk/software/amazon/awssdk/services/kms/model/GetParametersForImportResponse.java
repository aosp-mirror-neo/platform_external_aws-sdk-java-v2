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
import java.time.Instant;
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
public final class GetParametersForImportResponse extends KmsResponse implements
        ToCopyableBuilder<GetParametersForImportResponse.Builder, GetParametersForImportResponse> {
    private static final SdkField<String> KEY_ID_FIELD = SdkField.<String> builder(MarshallingType.STRING).memberName("KeyId")
            .getter(getter(GetParametersForImportResponse::keyId)).setter(setter(Builder::keyId))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("KeyId").build()).build();

    private static final SdkField<SdkBytes> IMPORT_TOKEN_FIELD = SdkField.<SdkBytes> builder(MarshallingType.SDK_BYTES)
            .memberName("ImportToken").getter(getter(GetParametersForImportResponse::importToken))
            .setter(setter(Builder::importToken))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ImportToken").build()).build();

    private static final SdkField<SdkBytes> PUBLIC_KEY_FIELD = SdkField.<SdkBytes> builder(MarshallingType.SDK_BYTES)
            .memberName("PublicKey").getter(getter(GetParametersForImportResponse::publicKey)).setter(setter(Builder::publicKey))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("PublicKey").build()).build();

    private static final SdkField<Instant> PARAMETERS_VALID_TO_FIELD = SdkField.<Instant> builder(MarshallingType.INSTANT)
            .memberName("ParametersValidTo").getter(getter(GetParametersForImportResponse::parametersValidTo))
            .setter(setter(Builder::parametersValidTo))
            .traits(LocationTrait.builder().location(MarshallLocation.PAYLOAD).locationName("ParametersValidTo").build()).build();

    private static final List<SdkField<?>> SDK_FIELDS = Collections.unmodifiableList(Arrays.asList(KEY_ID_FIELD,
            IMPORT_TOKEN_FIELD, PUBLIC_KEY_FIELD, PARAMETERS_VALID_TO_FIELD));

    private final String keyId;

    private final SdkBytes importToken;

    private final SdkBytes publicKey;

    private final Instant parametersValidTo;

    private GetParametersForImportResponse(BuilderImpl builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.importToken = builder.importToken;
        this.publicKey = builder.publicKey;
        this.parametersValidTo = builder.parametersValidTo;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the KMS
     * key to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same KMS key specified in the
     * <code>GetParametersForImport</code> request.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of
     *         the KMS key to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same KMS key specified
     *         in the <code>GetParametersForImport</code> request.
     */
    public final String keyId() {
        return keyId;
    }

    /**
     * <p>
     * The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
     * </p>
     * 
     * @return The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
     */
    public final SdkBytes importToken() {
        return importToken;
    }

    /**
     * <p>
     * The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     * </p>
     * 
     * @return The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
     */
    public final SdkBytes publicKey() {
        return publicKey;
    }

    /**
     * <p>
     * The time at which the import token and public key are no longer valid. After this time, you cannot use them to
     * make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code> request to
     * get new ones.
     * </p>
     * 
     * @return The time at which the import token and public key are no longer valid. After this time, you cannot use
     *         them to make an <a>ImportKeyMaterial</a> request and you must send another
     *         <code>GetParametersForImport</code> request to get new ones.
     */
    public final Instant parametersValidTo() {
        return parametersValidTo;
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
        hashCode = 31 * hashCode + Objects.hashCode(importToken());
        hashCode = 31 * hashCode + Objects.hashCode(publicKey());
        hashCode = 31 * hashCode + Objects.hashCode(parametersValidTo());
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
        if (!(obj instanceof GetParametersForImportResponse)) {
            return false;
        }
        GetParametersForImportResponse other = (GetParametersForImportResponse) obj;
        return Objects.equals(keyId(), other.keyId()) && Objects.equals(importToken(), other.importToken())
                && Objects.equals(publicKey(), other.publicKey())
                && Objects.equals(parametersValidTo(), other.parametersValidTo());
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     */
    @Override
    public final String toString() {
        return ToString.builder("GetParametersForImportResponse").add("KeyId", keyId()).add("ImportToken", importToken())
                .add("PublicKey", publicKey() == null ? null : "*** Sensitive Data Redacted ***")
                .add("ParametersValidTo", parametersValidTo()).build();
    }

    public final <T> Optional<T> getValueForField(String fieldName, Class<T> clazz) {
        switch (fieldName) {
        case "KeyId":
            return Optional.ofNullable(clazz.cast(keyId()));
        case "ImportToken":
            return Optional.ofNullable(clazz.cast(importToken()));
        case "PublicKey":
            return Optional.ofNullable(clazz.cast(publicKey()));
        case "ParametersValidTo":
            return Optional.ofNullable(clazz.cast(parametersValidTo()));
        default:
            return Optional.empty();
        }
    }

    @Override
    public final List<SdkField<?>> sdkFields() {
        return SDK_FIELDS;
    }

    private static <T> Function<Object, T> getter(Function<GetParametersForImportResponse, T> g) {
        return obj -> g.apply((GetParametersForImportResponse) obj);
    }

    private static <T> BiConsumer<Object, T> setter(BiConsumer<Builder, T> s) {
        return (obj, val) -> s.accept((Builder) obj, val);
    }

    public interface Builder extends KmsResponse.Builder, SdkPojo, CopyableBuilder<Builder, GetParametersForImportResponse> {
        /**
         * <p>
         * The Amazon Resource Name (<a
         * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the
         * KMS key to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same KMS key specified in the
         * <code>GetParametersForImport</code> request.
         * </p>
         * 
         * @param keyId
         *        The Amazon Resource Name (<a
         *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>)
         *        of the KMS key to use in a subsequent <a>ImportKeyMaterial</a> request. This is the same KMS key
         *        specified in the <code>GetParametersForImport</code> request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder keyId(String keyId);

        /**
         * <p>
         * The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
         * </p>
         * 
         * @param importToken
         *        The import token to send in a subsequent <a>ImportKeyMaterial</a> request.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder importToken(SdkBytes importToken);

        /**
         * <p>
         * The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
         * </p>
         * 
         * @param publicKey
         *        The public key to use to encrypt the key material before importing it with <a>ImportKeyMaterial</a>.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder publicKey(SdkBytes publicKey);

        /**
         * <p>
         * The time at which the import token and public key are no longer valid. After this time, you cannot use them
         * to make an <a>ImportKeyMaterial</a> request and you must send another <code>GetParametersForImport</code>
         * request to get new ones.
         * </p>
         * 
         * @param parametersValidTo
         *        The time at which the import token and public key are no longer valid. After this time, you cannot use
         *        them to make an <a>ImportKeyMaterial</a> request and you must send another
         *        <code>GetParametersForImport</code> request to get new ones.
         * @return Returns a reference to this object so that method calls can be chained together.
         */
        Builder parametersValidTo(Instant parametersValidTo);
    }

    static final class BuilderImpl extends KmsResponse.BuilderImpl implements Builder {
        private String keyId;

        private SdkBytes importToken;

        private SdkBytes publicKey;

        private Instant parametersValidTo;

        private BuilderImpl() {
        }

        private BuilderImpl(GetParametersForImportResponse model) {
            super(model);
            keyId(model.keyId);
            importToken(model.importToken);
            publicKey(model.publicKey);
            parametersValidTo(model.parametersValidTo);
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

        public final ByteBuffer getImportToken() {
            return importToken == null ? null : importToken.asByteBuffer();
        }

        public final void setImportToken(ByteBuffer importToken) {
            importToken(importToken == null ? null : SdkBytes.fromByteBuffer(importToken));
        }

        @Override
        public final Builder importToken(SdkBytes importToken) {
            this.importToken = importToken;
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

        public final Instant getParametersValidTo() {
            return parametersValidTo;
        }

        public final void setParametersValidTo(Instant parametersValidTo) {
            this.parametersValidTo = parametersValidTo;
        }

        @Override
        public final Builder parametersValidTo(Instant parametersValidTo) {
            this.parametersValidTo = parametersValidTo;
            return this;
        }

        @Override
        public GetParametersForImportResponse build() {
            return new GetParametersForImportResponse(this);
        }

        @Override
        public List<SdkField<?>> sdkFields() {
            return SDK_FIELDS;
        }
    }
}
