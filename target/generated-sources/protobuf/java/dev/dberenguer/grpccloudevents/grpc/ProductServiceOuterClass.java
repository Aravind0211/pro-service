// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProductService.proto

package dev.dberenguer.grpccloudevents.grpc;

public final class ProductServiceOuterClass {
  private ProductServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dev_dberenguer_grpccloudevents_grpc_ProductDtoGrpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dev_dberenguer_grpccloudevents_grpc_ProductDtoGrpc_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ProductService.proto\022#dev.dberenguer.g" +
      "rpccloudevents.grpc\032\033google/protobuf/emp" +
      "ty.proto\";\n\016ProductDtoGrpc\022\014\n\004code\030\001 \001(\t" +
      "\022\014\n\004name\030\002 \001(\t\022\r\n\005price\030\003 \001(\0012r\n\016Product" +
      "Service\022`\n\017findAllProducts\022\026.google.prot" +
      "obuf.Empty\0323.dev.dberenguer.grpccloudeve" +
      "nts.grpc.ProductDtoGrpc0\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_dev_dberenguer_grpccloudevents_grpc_ProductDtoGrpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dev_dberenguer_grpccloudevents_grpc_ProductDtoGrpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dev_dberenguer_grpccloudevents_grpc_ProductDtoGrpc_descriptor,
        new java.lang.String[] { "Code", "Name", "Price", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}