// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compte.proto

package ma.projet.grpc.stubs;

public interface CompteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Compte)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Changez de string à int32
   * </pre>
   *
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>float solde = 2;</code>
   * @return The solde.
   */
  float getSolde();

  /**
   * <code>string dateCreation = 3;</code>
   * @return The dateCreation.
   */
  java.lang.String getDateCreation();
  /**
   * <code>string dateCreation = 3;</code>
   * @return The bytes for dateCreation.
   */
  com.google.protobuf.ByteString
      getDateCreationBytes();

  /**
   * <code>.TypeCompte type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.TypeCompte type = 4;</code>
   * @return The type.
   */
  ma.projet.grpc.stubs.TypeCompte getType();
}