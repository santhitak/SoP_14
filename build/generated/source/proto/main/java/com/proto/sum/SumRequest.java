// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sum/sum.proto

package com.proto.sum;

/**
 * Protobuf type {@code sum.SumRequest}
 */
public final class SumRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sum.SumRequest)
    SumRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SumRequest.newBuilder() to construct.
  private SumRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SumRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SumRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.sum.SumOuterClass.internal_static_sum_SumRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.sum.SumOuterClass.internal_static_sum_SumRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.sum.SumRequest.class, com.proto.sum.SumRequest.Builder.class);
  }

  public static final int SUM_FIELD_NUMBER = 1;
  private com.proto.sum.Sum sum_;
  /**
   * <code>.sum.Sum sum = 1;</code>
   * @return Whether the sum field is set.
   */
  @java.lang.Override
  public boolean hasSum() {
    return sum_ != null;
  }
  /**
   * <code>.sum.Sum sum = 1;</code>
   * @return The sum.
   */
  @java.lang.Override
  public com.proto.sum.Sum getSum() {
    return sum_ == null ? com.proto.sum.Sum.getDefaultInstance() : sum_;
  }
  /**
   * <code>.sum.Sum sum = 1;</code>
   */
  @java.lang.Override
  public com.proto.sum.SumOrBuilder getSumOrBuilder() {
    return getSum();
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
    if (sum_ != null) {
      output.writeMessage(1, getSum());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sum_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSum());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.sum.SumRequest)) {
      return super.equals(obj);
    }
    com.proto.sum.SumRequest other = (com.proto.sum.SumRequest) obj;

    if (hasSum() != other.hasSum()) return false;
    if (hasSum()) {
      if (!getSum()
          .equals(other.getSum())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSum()) {
      hash = (37 * hash) + SUM_FIELD_NUMBER;
      hash = (53 * hash) + getSum().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.sum.SumRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.sum.SumRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.sum.SumRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.sum.SumRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.sum.SumRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.sum.SumRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.sum.SumRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.sum.SumRequest parseFrom(
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
  public static Builder newBuilder(com.proto.sum.SumRequest prototype) {
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
   * Protobuf type {@code sum.SumRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sum.SumRequest)
      com.proto.sum.SumRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.sum.SumOuterClass.internal_static_sum_SumRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.sum.SumOuterClass.internal_static_sum_SumRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.sum.SumRequest.class, com.proto.sum.SumRequest.Builder.class);
    }

    // Construct using com.proto.sum.SumRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sumBuilder_ == null) {
        sum_ = null;
      } else {
        sum_ = null;
        sumBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.sum.SumOuterClass.internal_static_sum_SumRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.sum.SumRequest getDefaultInstanceForType() {
      return com.proto.sum.SumRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.sum.SumRequest build() {
      com.proto.sum.SumRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.sum.SumRequest buildPartial() {
      com.proto.sum.SumRequest result = new com.proto.sum.SumRequest(this);
      if (sumBuilder_ == null) {
        result.sum_ = sum_;
      } else {
        result.sum_ = sumBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.sum.SumRequest) {
        return mergeFrom((com.proto.sum.SumRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.sum.SumRequest other) {
      if (other == com.proto.sum.SumRequest.getDefaultInstance()) return this;
      if (other.hasSum()) {
        mergeSum(other.getSum());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getSumFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.proto.sum.Sum sum_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.sum.Sum, com.proto.sum.Sum.Builder, com.proto.sum.SumOrBuilder> sumBuilder_;
    /**
     * <code>.sum.Sum sum = 1;</code>
     * @return Whether the sum field is set.
     */
    public boolean hasSum() {
      return sumBuilder_ != null || sum_ != null;
    }
    /**
     * <code>.sum.Sum sum = 1;</code>
     * @return The sum.
     */
    public com.proto.sum.Sum getSum() {
      if (sumBuilder_ == null) {
        return sum_ == null ? com.proto.sum.Sum.getDefaultInstance() : sum_;
      } else {
        return sumBuilder_.getMessage();
      }
    }
    /**
     * <code>.sum.Sum sum = 1;</code>
     */
    public Builder setSum(com.proto.sum.Sum value) {
      if (sumBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sum_ = value;
        onChanged();
      } else {
        sumBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.sum.Sum sum = 1;</code>
     */
    public Builder setSum(
        com.proto.sum.Sum.Builder builderForValue) {
      if (sumBuilder_ == null) {
        sum_ = builderForValue.build();
        onChanged();
      } else {
        sumBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.sum.Sum sum = 1;</code>
     */
    public Builder mergeSum(com.proto.sum.Sum value) {
      if (sumBuilder_ == null) {
        if (sum_ != null) {
          sum_ =
            com.proto.sum.Sum.newBuilder(sum_).mergeFrom(value).buildPartial();
        } else {
          sum_ = value;
        }
        onChanged();
      } else {
        sumBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.sum.Sum sum = 1;</code>
     */
    public Builder clearSum() {
      if (sumBuilder_ == null) {
        sum_ = null;
        onChanged();
      } else {
        sum_ = null;
        sumBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.sum.Sum sum = 1;</code>
     */
    public com.proto.sum.Sum.Builder getSumBuilder() {
      
      onChanged();
      return getSumFieldBuilder().getBuilder();
    }
    /**
     * <code>.sum.Sum sum = 1;</code>
     */
    public com.proto.sum.SumOrBuilder getSumOrBuilder() {
      if (sumBuilder_ != null) {
        return sumBuilder_.getMessageOrBuilder();
      } else {
        return sum_ == null ?
            com.proto.sum.Sum.getDefaultInstance() : sum_;
      }
    }
    /**
     * <code>.sum.Sum sum = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.sum.Sum, com.proto.sum.Sum.Builder, com.proto.sum.SumOrBuilder> 
        getSumFieldBuilder() {
      if (sumBuilder_ == null) {
        sumBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.sum.Sum, com.proto.sum.Sum.Builder, com.proto.sum.SumOrBuilder>(
                getSum(),
                getParentForChildren(),
                isClean());
        sum_ = null;
      }
      return sumBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sum.SumRequest)
  }

  // @@protoc_insertion_point(class_scope:sum.SumRequest)
  private static final com.proto.sum.SumRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.sum.SumRequest();
  }

  public static com.proto.sum.SumRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SumRequest>
      PARSER = new com.google.protobuf.AbstractParser<SumRequest>() {
    @java.lang.Override
    public SumRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<SumRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SumRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.sum.SumRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

