// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dstore/engine/engine.proto

package io.dstore.engine;

public final class EngineOuterClass {
  private EngineOuterClass() {}
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
      "\n\032dstore/engine/engine.proto\022\rdstore.eng" +
      "ine\032\035dstore/engine/procedure.proto\032\023dsto" +
      "re/values.proto2\316\002\n\006Engine\022U\n\rexecProced" +
      "ure\022\035.dstore.engine.procedure.Call\032!.dst" +
      "ore.engine.procedure.Response\"\0000\001\022S\n\texe" +
      "cBatch\022\035.dstore.engine.procedure.Call\032!." +
      "dstore.engine.procedure.Response\"\000(\0010\001\022J" +
      "\n\016createUniqueID\022\032.dstore.values.stringV" +
      "alue\032\032.dstore.values.stringValue\"\000\022L\n\017is" +
      "ValidUniqueID\022\032.dstore.values.stringValu",
      "e\032\033.dstore.values.booleanValue\"\000B*\n\020io.d" +
      "store.engineZ\026gosdk.dstore.de/engineb\006pr" +
      "oto3"
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
          io.dstore.Values.getDescriptor(),
        }, assigner);
    io.dstore.engine.Procedure.getDescriptor();
    io.dstore.Values.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
