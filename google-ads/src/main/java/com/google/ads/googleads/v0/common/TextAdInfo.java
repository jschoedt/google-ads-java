// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/ad_type_infos.proto

package com.google.ads.googleads.v0.common;

/**
 * <pre>
 * A text ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.common.TextAdInfo}
 */
public  final class TextAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.common.TextAdInfo)
    TextAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextAdInfo.newBuilder() to construct.
  private TextAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextAdInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TextAdInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (headline_ != null) {
              subBuilder = headline_.toBuilder();
            }
            headline_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(headline_);
              headline_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (description1_ != null) {
              subBuilder = description1_.toBuilder();
            }
            description1_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(description1_);
              description1_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (description2_ != null) {
              subBuilder = description2_.toBuilder();
            }
            description2_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(description2_);
              description2_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.common.AdTypeInfosProto.internal_static_google_ads_googleads_v0_common_TextAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.common.AdTypeInfosProto.internal_static_google_ads_googleads_v0_common_TextAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.common.TextAdInfo.class, com.google.ads.googleads.v0.common.TextAdInfo.Builder.class);
  }

  public static final int HEADLINE_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue headline_;
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  public boolean hasHeadline() {
    return headline_ != null;
  }
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  public com.google.protobuf.StringValue getHeadline() {
    return headline_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : headline_;
  }
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue headline = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder() {
    return getHeadline();
  }

  public static final int DESCRIPTION1_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue description1_;
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description1 = 2;</code>
   */
  public boolean hasDescription1() {
    return description1_ != null;
  }
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description1 = 2;</code>
   */
  public com.google.protobuf.StringValue getDescription1() {
    return description1_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description1_;
  }
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description1 = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getDescription1OrBuilder() {
    return getDescription1();
  }

  public static final int DESCRIPTION2_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue description2_;
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description2 = 3;</code>
   */
  public boolean hasDescription2() {
    return description2_ != null;
  }
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description2 = 3;</code>
   */
  public com.google.protobuf.StringValue getDescription2() {
    return description2_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description2_;
  }
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description2 = 3;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getDescription2OrBuilder() {
    return getDescription2();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (headline_ != null) {
      output.writeMessage(1, getHeadline());
    }
    if (description1_ != null) {
      output.writeMessage(2, getDescription1());
    }
    if (description2_ != null) {
      output.writeMessage(3, getDescription2());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (headline_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeadline());
    }
    if (description1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDescription1());
    }
    if (description2_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDescription2());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v0.common.TextAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.common.TextAdInfo other = (com.google.ads.googleads.v0.common.TextAdInfo) obj;

    boolean result = true;
    result = result && (hasHeadline() == other.hasHeadline());
    if (hasHeadline()) {
      result = result && getHeadline()
          .equals(other.getHeadline());
    }
    result = result && (hasDescription1() == other.hasDescription1());
    if (hasDescription1()) {
      result = result && getDescription1()
          .equals(other.getDescription1());
    }
    result = result && (hasDescription2() == other.hasDescription2());
    if (hasDescription2()) {
      result = result && getDescription2()
          .equals(other.getDescription2());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeadline()) {
      hash = (37 * hash) + HEADLINE_FIELD_NUMBER;
      hash = (53 * hash) + getHeadline().hashCode();
    }
    if (hasDescription1()) {
      hash = (37 * hash) + DESCRIPTION1_FIELD_NUMBER;
      hash = (53 * hash) + getDescription1().hashCode();
    }
    if (hasDescription2()) {
      hash = (37 * hash) + DESCRIPTION2_FIELD_NUMBER;
      hash = (53 * hash) + getDescription2().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.TextAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v0.common.TextAdInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A text ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.common.TextAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.common.TextAdInfo)
      com.google.ads.googleads.v0.common.TextAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.common.AdTypeInfosProto.internal_static_google_ads_googleads_v0_common_TextAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.common.AdTypeInfosProto.internal_static_google_ads_googleads_v0_common_TextAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.common.TextAdInfo.class, com.google.ads.googleads.v0.common.TextAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.common.TextAdInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headlineBuilder_ == null) {
        headline_ = null;
      } else {
        headline_ = null;
        headlineBuilder_ = null;
      }
      if (description1Builder_ == null) {
        description1_ = null;
      } else {
        description1_ = null;
        description1Builder_ = null;
      }
      if (description2Builder_ == null) {
        description2_ = null;
      } else {
        description2_ = null;
        description2Builder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.common.AdTypeInfosProto.internal_static_google_ads_googleads_v0_common_TextAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.common.TextAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.common.TextAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.common.TextAdInfo build() {
      com.google.ads.googleads.v0.common.TextAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.common.TextAdInfo buildPartial() {
      com.google.ads.googleads.v0.common.TextAdInfo result = new com.google.ads.googleads.v0.common.TextAdInfo(this);
      if (headlineBuilder_ == null) {
        result.headline_ = headline_;
      } else {
        result.headline_ = headlineBuilder_.build();
      }
      if (description1Builder_ == null) {
        result.description1_ = description1_;
      } else {
        result.description1_ = description1Builder_.build();
      }
      if (description2Builder_ == null) {
        result.description2_ = description2_;
      } else {
        result.description2_ = description2Builder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.common.TextAdInfo) {
        return mergeFrom((com.google.ads.googleads.v0.common.TextAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.common.TextAdInfo other) {
      if (other == com.google.ads.googleads.v0.common.TextAdInfo.getDefaultInstance()) return this;
      if (other.hasHeadline()) {
        mergeHeadline(other.getHeadline());
      }
      if (other.hasDescription1()) {
        mergeDescription1(other.getDescription1());
      }
      if (other.hasDescription2()) {
        mergeDescription2(other.getDescription2());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v0.common.TextAdInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.common.TextAdInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue headline_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> headlineBuilder_;
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public boolean hasHeadline() {
      return headlineBuilder_ != null || headline_ != null;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public com.google.protobuf.StringValue getHeadline() {
      if (headlineBuilder_ == null) {
        return headline_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : headline_;
      } else {
        return headlineBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder setHeadline(com.google.protobuf.StringValue value) {
      if (headlineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        headline_ = value;
        onChanged();
      } else {
        headlineBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder setHeadline(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (headlineBuilder_ == null) {
        headline_ = builderForValue.build();
        onChanged();
      } else {
        headlineBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder mergeHeadline(com.google.protobuf.StringValue value) {
      if (headlineBuilder_ == null) {
        if (headline_ != null) {
          headline_ =
            com.google.protobuf.StringValue.newBuilder(headline_).mergeFrom(value).buildPartial();
        } else {
          headline_ = value;
        }
        onChanged();
      } else {
        headlineBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public Builder clearHeadline() {
      if (headlineBuilder_ == null) {
        headline_ = null;
        onChanged();
      } else {
        headline_ = null;
        headlineBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getHeadlineBuilder() {
      
      onChanged();
      return getHeadlineFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getHeadlineOrBuilder() {
      if (headlineBuilder_ != null) {
        return headlineBuilder_.getMessageOrBuilder();
      } else {
        return headline_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : headline_;
      }
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>.google.protobuf.StringValue headline = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getHeadlineFieldBuilder() {
      if (headlineBuilder_ == null) {
        headlineBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getHeadline(),
                getParentForChildren(),
                isClean());
        headline_ = null;
      }
      return headlineBuilder_;
    }

    private com.google.protobuf.StringValue description1_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> description1Builder_;
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 2;</code>
     */
    public boolean hasDescription1() {
      return description1Builder_ != null || description1_ != null;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 2;</code>
     */
    public com.google.protobuf.StringValue getDescription1() {
      if (description1Builder_ == null) {
        return description1_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description1_;
      } else {
        return description1Builder_.getMessage();
      }
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 2;</code>
     */
    public Builder setDescription1(com.google.protobuf.StringValue value) {
      if (description1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description1_ = value;
        onChanged();
      } else {
        description1Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 2;</code>
     */
    public Builder setDescription1(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (description1Builder_ == null) {
        description1_ = builderForValue.build();
        onChanged();
      } else {
        description1Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 2;</code>
     */
    public Builder mergeDescription1(com.google.protobuf.StringValue value) {
      if (description1Builder_ == null) {
        if (description1_ != null) {
          description1_ =
            com.google.protobuf.StringValue.newBuilder(description1_).mergeFrom(value).buildPartial();
        } else {
          description1_ = value;
        }
        onChanged();
      } else {
        description1Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 2;</code>
     */
    public Builder clearDescription1() {
      if (description1Builder_ == null) {
        description1_ = null;
        onChanged();
      } else {
        description1_ = null;
        description1Builder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getDescription1Builder() {
      
      onChanged();
      return getDescription1FieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDescription1OrBuilder() {
      if (description1Builder_ != null) {
        return description1Builder_.getMessageOrBuilder();
      } else {
        return description1_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : description1_;
      }
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDescription1FieldBuilder() {
      if (description1Builder_ == null) {
        description1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDescription1(),
                getParentForChildren(),
                isClean());
        description1_ = null;
      }
      return description1Builder_;
    }

    private com.google.protobuf.StringValue description2_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> description2Builder_;
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 3;</code>
     */
    public boolean hasDescription2() {
      return description2Builder_ != null || description2_ != null;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 3;</code>
     */
    public com.google.protobuf.StringValue getDescription2() {
      if (description2Builder_ == null) {
        return description2_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description2_;
      } else {
        return description2Builder_.getMessage();
      }
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 3;</code>
     */
    public Builder setDescription2(com.google.protobuf.StringValue value) {
      if (description2Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description2_ = value;
        onChanged();
      } else {
        description2Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 3;</code>
     */
    public Builder setDescription2(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (description2Builder_ == null) {
        description2_ = builderForValue.build();
        onChanged();
      } else {
        description2Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 3;</code>
     */
    public Builder mergeDescription2(com.google.protobuf.StringValue value) {
      if (description2Builder_ == null) {
        if (description2_ != null) {
          description2_ =
            com.google.protobuf.StringValue.newBuilder(description2_).mergeFrom(value).buildPartial();
        } else {
          description2_ = value;
        }
        onChanged();
      } else {
        description2Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 3;</code>
     */
    public Builder clearDescription2() {
      if (description2Builder_ == null) {
        description2_ = null;
        onChanged();
      } else {
        description2_ = null;
        description2Builder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getDescription2Builder() {
      
      onChanged();
      return getDescription2FieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDescription2OrBuilder() {
      if (description2Builder_ != null) {
        return description2Builder_.getMessageOrBuilder();
      } else {
        return description2_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : description2_;
      }
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDescription2FieldBuilder() {
      if (description2Builder_ == null) {
        description2Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDescription2(),
                getParentForChildren(),
                isClean());
        description2_ = null;
      }
      return description2Builder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.common.TextAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.common.TextAdInfo)
  private static final com.google.ads.googleads.v0.common.TextAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.common.TextAdInfo();
  }

  public static com.google.ads.googleads.v0.common.TextAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<TextAdInfo>() {
    @java.lang.Override
    public TextAdInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TextAdInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TextAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.common.TextAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

