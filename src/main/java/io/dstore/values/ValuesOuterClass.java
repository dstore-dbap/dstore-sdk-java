// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dstore/values.proto

package io.dstore.values;

public final class ValuesOuterClass {
  private ValuesOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_values_IntegerValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_values_IntegerValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_values_StringValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_values_StringValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_values_BytesValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_values_BytesValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_values_DoubleValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_values_DoubleValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_values_BooleanValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_values_BooleanValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_values_DecimalValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_values_DecimalValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_values_TimestampValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_values_TimestampValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_values_LongValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_values_LongValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dstore_values_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dstore_values_Value_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023dstore/values.proto\022\rdstore.values\032\037go" +
      "ogle/protobuf/timestamp.proto\"\035\n\014Integer" +
      "Value\022\r\n\005value\030\001 \001(\005\"\034\n\013StringValue\022\r\n\005v" +
      "alue\030\001 \001(\t\"\033\n\nBytesValue\022\r\n\005value\030\001 \001(\014\"" +
      "\034\n\013DoubleValue\022\r\n\005value\030\001 \001(\001\"\035\n\014Boolean" +
      "Value\022\r\n\005value\030\001 \001(\010\"\035\n\014DecimalValue\022\r\n\005" +
      "value\030\001 \001(\t\";\n\016TimestampValue\022)\n\005value\030\001" +
      " \001(\0132\032.google.protobuf.Timestamp\"\032\n\tLong" +
      "Value\022\r\n\005value\030\001 \001(\003\"\265\003\n\005Value\0224\n\rintege" +
      "r_value\030\n \001(\0132\033.dstore.values.IntegerVal",
      "ueH\000\0222\n\014string_value\030\013 \001(\0132\032.dstore.valu" +
      "es.StringValueH\000\022/\n\nbyte_value\030\014 \001(\0132\031.d" +
      "store.values.BytesValueH\000\0222\n\014double_valu" +
      "e\030\r \001(\0132\032.dstore.values.DoubleValueH\000\0224\n" +
      "\rboolean_value\030\016 \001(\0132\033.dstore.values.Boo" +
      "leanValueH\000\0224\n\rdecimal_value\030\017 \001(\0132\033.dst" +
      "ore.values.DecimalValueH\000\0228\n\017timestamp_v" +
      "alue\030\020 \001(\0132\035.dstore.values.TimestampValu" +
      "eH\000\022.\n\nlong_value\030\021 \001(\0132\030.dstore.values." +
      "LongValueH\000B\007\n\005valueB>\n\020io.dstore.values",
      "B\020ValuesOuterClassP\001Z\026gosdk.dstore.de/va" +
      "luesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_dstore_values_IntegerValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dstore_values_IntegerValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_values_IntegerValue_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_dstore_values_StringValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dstore_values_StringValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_values_StringValue_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_dstore_values_BytesValue_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dstore_values_BytesValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_values_BytesValue_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_dstore_values_DoubleValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dstore_values_DoubleValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_values_DoubleValue_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_dstore_values_BooleanValue_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_dstore_values_BooleanValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_values_BooleanValue_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_dstore_values_DecimalValue_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_dstore_values_DecimalValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_values_DecimalValue_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_dstore_values_TimestampValue_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_dstore_values_TimestampValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_values_TimestampValue_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_dstore_values_LongValue_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_dstore_values_LongValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_values_LongValue_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_dstore_values_Value_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_dstore_values_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dstore_values_Value_descriptor,
        new java.lang.String[] { "IntegerValue", "StringValue", "ByteValue", "DoubleValue", "BooleanValue", "DecimalValue", "TimestampValue", "LongValue", "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
