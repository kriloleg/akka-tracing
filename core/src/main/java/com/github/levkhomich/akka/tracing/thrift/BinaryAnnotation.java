/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.github.levkhomich.akka.tracing.thrift;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import java.nio.ByteBuffer;
import java.util.*;

public class BinaryAnnotation implements org.apache.thrift.TBase<BinaryAnnotation, BinaryAnnotation._Fields>, java.io.Serializable, Cloneable, Comparable<BinaryAnnotation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BinaryAnnotation");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ANNOTATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("annotation_type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BinaryAnnotationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BinaryAnnotationTupleSchemeFactory());
  }

  public String key; // required
  public ByteBuffer value; // required
  /**
   * 
   * @see AnnotationType
   */
  public AnnotationType annotation_type; // required
  public Endpoint host; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY((short)1, "key"),
    VALUE((short)2, "value"),
    /**
     * 
     * @see AnnotationType
     */
    ANNOTATION_TYPE((short)3, "annotation_type"),
    HOST((short)4, "host");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEY
          return KEY;
        case 2: // VALUE
          return VALUE;
        case 3: // ANNOTATION_TYPE
          return ANNOTATION_TYPE;
        case 4: // HOST
          return HOST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.HOST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.ANNOTATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("annotation_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, AnnotationType.class)));
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Endpoint.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BinaryAnnotation.class, metaDataMap);
  }

  public BinaryAnnotation() {
  }

  public BinaryAnnotation(
    String key,
    ByteBuffer value,
    AnnotationType annotation_type)
  {
    this();
    this.key = key;
    this.value = value;
    this.annotation_type = annotation_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BinaryAnnotation(BinaryAnnotation other) {
    if (other.is_set_key()) {
      this.key = other.key;
    }
    if (other.is_set_value()) {
      this.value = org.apache.thrift.TBaseHelper.copyBinary(other.value);
;
    }
    if (other.is_set_annotation_type()) {
      this.annotation_type = other.annotation_type;
    }
    if (other.is_set_host()) {
      this.host = new Endpoint(other.host);
    }
  }

  public BinaryAnnotation deepCopy() {
    return new BinaryAnnotation(this);
  }

  @Override
  public void clear() {
    this.key = null;
    this.value = null;
    this.annotation_type = null;
    this.host = null;
  }

  public String get_key() {
    return this.key;
  }

  public BinaryAnnotation set_key(String key) {
    this.key = key;
    return this;
  }

  public void unset_key() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean is_set_key() {
    return this.key != null;
  }

  public void set_key_isSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public byte[] get_value() {
    set_value(org.apache.thrift.TBaseHelper.rightSize(value));
    return value == null ? null : value.array();
  }

  public ByteBuffer buffer_for_value() {
    return value;
  }

  public BinaryAnnotation set_value(byte[] value) {
    set_value(value == null ? (ByteBuffer)null : ByteBuffer.wrap(value));
    return this;
  }

  public BinaryAnnotation set_value(ByteBuffer value) {
    this.value = value;
    return this;
  }

  public void unset_value() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean is_set_value() {
    return this.value != null;
  }

  public void set_value_isSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  /**
   * 
   * @see AnnotationType
   */
  public AnnotationType get_annotation_type() {
    return this.annotation_type;
  }

  /**
   * 
   * @see AnnotationType
   */
  public BinaryAnnotation set_annotation_type(AnnotationType annotation_type) {
    this.annotation_type = annotation_type;
    return this;
  }

  public void unset_annotation_type() {
    this.annotation_type = null;
  }

  /** Returns true if field annotation_type is set (has been assigned a value) and false otherwise */
  public boolean is_set_annotation_type() {
    return this.annotation_type != null;
  }

  public void set_annotation_type_isSet(boolean value) {
    if (!value) {
      this.annotation_type = null;
    }
  }

  public Endpoint get_host() {
    return this.host;
  }

  public BinaryAnnotation set_host(Endpoint host) {
    this.host = host;
    return this;
  }

  public void unset_host() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean is_set_host() {
    return this.host != null;
  }

  public void set_host_isSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unset_key();
      } else {
        set_key((String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unset_value();
      } else {
        set_value((ByteBuffer)value);
      }
      break;

    case ANNOTATION_TYPE:
      if (value == null) {
        unset_annotation_type();
      } else {
        set_annotation_type((AnnotationType)value);
      }
      break;

    case HOST:
      if (value == null) {
        unset_host();
      } else {
        set_host((Endpoint)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return get_key();

    case VALUE:
      return get_value();

    case ANNOTATION_TYPE:
      return get_annotation_type();

    case HOST:
      return get_host();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return is_set_key();
    case VALUE:
      return is_set_value();
    case ANNOTATION_TYPE:
      return is_set_annotation_type();
    case HOST:
      return is_set_host();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BinaryAnnotation)
      return this.equals((BinaryAnnotation)that);
    return false;
  }

  public boolean equals(BinaryAnnotation that) {
    if (that == null)
      return false;

    boolean this_present_key = true && this.is_set_key();
    boolean that_present_key = true && that.is_set_key();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_value = true && this.is_set_value();
    boolean that_present_value = true && that.is_set_value();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_annotation_type = true && this.is_set_annotation_type();
    boolean that_present_annotation_type = true && that.is_set_annotation_type();
    if (this_present_annotation_type || that_present_annotation_type) {
      if (!(this_present_annotation_type && that_present_annotation_type))
        return false;
      if (!this.annotation_type.equals(that.annotation_type))
        return false;
    }

    boolean this_present_host = true && this.is_set_host();
    boolean that_present_host = true && that.is_set_host();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(BinaryAnnotation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_key()).compareTo(other.is_set_key());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_key()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_value()).compareTo(other.is_set_value());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_value()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_annotation_type()).compareTo(other.is_set_annotation_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_annotation_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.annotation_type, other.annotation_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_host()).compareTo(other.is_set_host());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_host()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BinaryAnnotation(");
    boolean first = true;

    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      sb.append(this.key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.value, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("annotation_type:");
    if (this.annotation_type == null) {
      sb.append("null");
    } else {
      sb.append(this.annotation_type);
    }
    first = false;
    if (is_set_host()) {
      if (!first) sb.append(", ");
      sb.append("host:");
      if (this.host == null) {
        sb.append("null");
      } else {
        sb.append(this.host);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (host != null) {
      host.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BinaryAnnotationStandardSchemeFactory implements SchemeFactory {
    public BinaryAnnotationStandardScheme getScheme() {
      return new BinaryAnnotationStandardScheme();
    }
  }

  private static class BinaryAnnotationStandardScheme extends StandardScheme<BinaryAnnotation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BinaryAnnotation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readString();
              struct.set_key_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readBinary();
              struct.set_value_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ANNOTATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.annotation_type = AnnotationType.findByValue(iprot.readI32());
              struct.set_annotation_type_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.host = new Endpoint();
              struct.host.read(iprot);
              struct.set_host_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BinaryAnnotation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeString(struct.key);
        oprot.writeFieldEnd();
      }
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeBinary(struct.value);
        oprot.writeFieldEnd();
      }
      if (struct.annotation_type != null) {
        oprot.writeFieldBegin(ANNOTATION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.annotation_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.host != null) {
        if (struct.is_set_host()) {
          oprot.writeFieldBegin(HOST_FIELD_DESC);
          struct.host.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BinaryAnnotationTupleSchemeFactory implements SchemeFactory {
    public BinaryAnnotationTupleScheme getScheme() {
      return new BinaryAnnotationTupleScheme();
    }
  }

  private static class BinaryAnnotationTupleScheme extends TupleScheme<BinaryAnnotation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BinaryAnnotation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.is_set_key()) {
        optionals.set(0);
      }
      if (struct.is_set_value()) {
        optionals.set(1);
      }
      if (struct.is_set_annotation_type()) {
        optionals.set(2);
      }
      if (struct.is_set_host()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.is_set_key()) {
        oprot.writeString(struct.key);
      }
      if (struct.is_set_value()) {
        oprot.writeBinary(struct.value);
      }
      if (struct.is_set_annotation_type()) {
        oprot.writeI32(struct.annotation_type.getValue());
      }
      if (struct.is_set_host()) {
        struct.host.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BinaryAnnotation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.key = iprot.readString();
        struct.set_key_isSet(true);
      }
      if (incoming.get(1)) {
        struct.value = iprot.readBinary();
        struct.set_value_isSet(true);
      }
      if (incoming.get(2)) {
        struct.annotation_type = AnnotationType.findByValue(iprot.readI32());
        struct.set_annotation_type_isSet(true);
      }
      if (incoming.get(3)) {
        struct.host = new Endpoint();
        struct.host.read(iprot);
        struct.set_host_isSet(true);
      }
    }
  }

}

