/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.github.levkhomich.akka.tracing.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Annotation implements org.apache.thrift.TBase<Annotation, Annotation._Fields>, java.io.Serializable, Cloneable, Comparable<Annotation> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Annotation");

  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField HOST_FIELD_DESC = new org.apache.thrift.protocol.TField("host", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField DURATION_FIELD_DESC = new org.apache.thrift.protocol.TField("duration", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnnotationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnnotationTupleSchemeFactory());
  }

  public long timestamp; // required
  public String value; // required
  public Endpoint host; // optional
  public int duration; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIMESTAMP((short)1, "timestamp"),
    VALUE((short)2, "value"),
    HOST((short)3, "host"),
    DURATION((short)4, "duration");

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
        case 1: // TIMESTAMP
          return TIMESTAMP;
        case 2: // VALUE
          return VALUE;
        case 3: // HOST
          return HOST;
        case 4: // DURATION
          return DURATION;
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
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private static final int __DURATION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.HOST,_Fields.DURATION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOST, new org.apache.thrift.meta_data.FieldMetaData("host", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Endpoint.class)));
    tmpMap.put(_Fields.DURATION, new org.apache.thrift.meta_data.FieldMetaData("duration", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Annotation.class, metaDataMap);
  }

  public Annotation() {
  }

  public Annotation(
    long timestamp,
    String value)
  {
    this();
    this.timestamp = timestamp;
    set_timestamp_isSet(true);
    this.value = value;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Annotation(Annotation other) {
    __isset_bitfield = other.__isset_bitfield;
    this.timestamp = other.timestamp;
    if (other.is_set_value()) {
      this.value = other.value;
    }
    if (other.is_set_host()) {
      this.host = new Endpoint(other.host);
    }
    this.duration = other.duration;
  }

  public Annotation deepCopy() {
    return new Annotation(this);
  }

  @Override
  public void clear() {
    set_timestamp_isSet(false);
    this.timestamp = 0;
    this.value = null;
    this.host = null;
    set_duration_isSet(false);
    this.duration = 0;
  }

  public long get_timestamp() {
    return this.timestamp;
  }

  public Annotation set_timestamp(long timestamp) {
    this.timestamp = timestamp;
    set_timestamp_isSet(true);
    return this;
  }

  public void unset_timestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean is_set_timestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void set_timestamp_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public String get_value() {
    return this.value;
  }

  public Annotation set_value(String value) {
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

  public Endpoint get_host() {
    return this.host;
  }

  public Annotation set_host(Endpoint host) {
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

  public int get_duration() {
    return this.duration;
  }

  public Annotation set_duration(int duration) {
    this.duration = duration;
    set_duration_isSet(true);
    return this;
  }

  public void unset_duration() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DURATION_ISSET_ID);
  }

  /** Returns true if field duration is set (has been assigned a value) and false otherwise */
  public boolean is_set_duration() {
    return EncodingUtils.testBit(__isset_bitfield, __DURATION_ISSET_ID);
  }

  public void set_duration_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DURATION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMESTAMP:
      if (value == null) {
        unset_timestamp();
      } else {
        set_timestamp((Long)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unset_value();
      } else {
        set_value((String)value);
      }
      break;

    case HOST:
      if (value == null) {
        unset_host();
      } else {
        set_host((Endpoint)value);
      }
      break;

    case DURATION:
      if (value == null) {
        unset_duration();
      } else {
        set_duration((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMESTAMP:
      return Long.valueOf(get_timestamp());

    case VALUE:
      return get_value();

    case HOST:
      return get_host();

    case DURATION:
      return Integer.valueOf(get_duration());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIMESTAMP:
      return is_set_timestamp();
    case VALUE:
      return is_set_value();
    case HOST:
      return is_set_host();
    case DURATION:
      return is_set_duration();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Annotation)
      return this.equals((Annotation)that);
    return false;
  }

  public boolean equals(Annotation that) {
    if (that == null)
      return false;

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
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

    boolean this_present_host = true && this.is_set_host();
    boolean that_present_host = true && that.is_set_host();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_duration = true && this.is_set_duration();
    boolean that_present_duration = true && that.is_set_duration();
    if (this_present_duration || that_present_duration) {
      if (!(this_present_duration && that_present_duration))
        return false;
      if (this.duration != that.duration)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Annotation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_timestamp()).compareTo(other.is_set_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_timestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
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
    lastComparison = Boolean.valueOf(is_set_duration()).compareTo(other.is_set_duration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_duration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.duration, other.duration);
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
    StringBuilder sb = new StringBuilder("Annotation(");
    boolean first = true;

    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
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
    if (is_set_duration()) {
      if (!first) sb.append(", ");
      sb.append("duration:");
      sb.append(this.duration);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AnnotationStandardSchemeFactory implements SchemeFactory {
    public AnnotationStandardScheme getScheme() {
      return new AnnotationStandardScheme();
    }
  }

  private static class AnnotationStandardScheme extends StandardScheme<Annotation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Annotation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.set_timestamp_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.value = iprot.readString();
              struct.set_value_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HOST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.host = new Endpoint();
              struct.host.read(iprot);
              struct.set_host_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DURATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.duration = iprot.readI32();
              struct.set_duration_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Annotation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeString(struct.value);
        oprot.writeFieldEnd();
      }
      if (struct.host != null) {
        if (struct.is_set_host()) {
          oprot.writeFieldBegin(HOST_FIELD_DESC);
          struct.host.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.is_set_duration()) {
        oprot.writeFieldBegin(DURATION_FIELD_DESC);
        oprot.writeI32(struct.duration);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnnotationTupleSchemeFactory implements SchemeFactory {
    public AnnotationTupleScheme getScheme() {
      return new AnnotationTupleScheme();
    }
  }

  private static class AnnotationTupleScheme extends TupleScheme<Annotation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Annotation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.is_set_timestamp()) {
        optionals.set(0);
      }
      if (struct.is_set_value()) {
        optionals.set(1);
      }
      if (struct.is_set_host()) {
        optionals.set(2);
      }
      if (struct.is_set_duration()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.is_set_timestamp()) {
        oprot.writeI64(struct.timestamp);
      }
      if (struct.is_set_value()) {
        oprot.writeString(struct.value);
      }
      if (struct.is_set_host()) {
        struct.host.write(oprot);
      }
      if (struct.is_set_duration()) {
        oprot.writeI32(struct.duration);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Annotation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.timestamp = iprot.readI64();
        struct.set_timestamp_isSet(true);
      }
      if (incoming.get(1)) {
        struct.value = iprot.readString();
        struct.set_value_isSet(true);
      }
      if (incoming.get(2)) {
        struct.host = new Endpoint();
        struct.host.read(iprot);
        struct.set_host_isSet(true);
      }
      if (incoming.get(3)) {
        struct.duration = iprot.readI32();
        struct.set_duration_isSet(true);
      }
    }
  }

}

