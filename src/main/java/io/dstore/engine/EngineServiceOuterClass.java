// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dstore/engine/engine_service.proto

package io.dstore.engine;

public final class EngineServiceOuterClass {
  private EngineServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"dstore/engine/engine_service.proto\022\rds" +
      "tore.engine\032\035dstore/engine/procedure.pro" +
      "to\032\023dstore/values.proto2\316\002\n\006Engine\022U\n\rEx" +
      "ecProcedure\022\035.dstore.engine.procedure.Ca" +
      "ll\032!.dstore.engine.procedure.Response\"\0000" +
      "\001\022S\n\tExecBatch\022\035.dstore.engine.procedure" +
      ".Call\032!.dstore.engine.procedure.Response" +
      "\"\000(\0010\001\022J\n\016CreateUniqueID\022\032.dstore.values" +
      ".StringValue\032\032.dstore.values.StringValue" +
      "\"\000\022L\n\017IsValidUniqueID\022\032.dstore.values.St",
      "ringValue\032\033.dstore.values.BooleanValue\"\000" +
      "BC\n\020io.dstore.engineB\027EngineServiceOuter" +
      "ClassZ\026gosdk.dstore.de/engineb\006proto3"
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
          io.dstore.engine.Procedure.getDescriptor(),
          io.dstore.values.ValuesOuterClass.getDescriptor(),
        }, assigner);
    io.dstore.engine.Procedure.getDescriptor();
    io.dstore.values.ValuesOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
