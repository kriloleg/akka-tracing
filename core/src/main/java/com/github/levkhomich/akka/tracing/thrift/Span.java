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

public class Span implements org.apache.thrift.TBase<Span, Span._Fields>, java.io.Serializable, Cloneable, Comparable<Span> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Span");

  private static final org.apache.thrift.protocol.TField TRACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("trace_id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField PARENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parent_id", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField ANNOTATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("annotations", org.apache.thrift.protocol.TType.LIST, (short)6);
  private static final org.apache.thrift.protocol.TField BINARY_ANNOTATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("binary_annotations", org.apache.thrift.protocol.TType.LIST, (short)8);
  private static final org.apache.thrift.protocol.TField DEBUG_FIELD_DESC = new org.apache.thrift.protocol.TField("debug", org.apache.thrift.protocol.TType.BOOL, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SpanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SpanTupleSchemeFactory());
  }

  public long trace_id; // required
  public String name; // required
  public long id; // required
  public long parent_id; // optional
  public List<Annotation> annotations; // required
  public List<BinaryAnnotation> binary_annotations; // required
  public boolean debug; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRACE_ID((short)1, "trace_id"),
    NAME((short)3, "name"),
    ID((short)4, "id"),
    PARENT_ID((short)5, "parent_id"),
    ANNOTATIONS((short)6, "annotations"),
    BINARY_ANNOTATIONS((short)8, "binary_annotations"),
    DEBUG((short)9, "debug");

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
        case 1: // TRACE_ID
          return TRACE_ID;
        case 3: // NAME
          return NAME;
        case 4: // ID
          return ID;
        case 5: // PARENT_ID
          return PARENT_ID;
        case 6: // ANNOTATIONS
          return ANNOTATIONS;
        case 8: // BINARY_ANNOTATIONS
          return BINARY_ANNOTATIONS;
        case 9: // DEBUG
          return DEBUG;
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
  private static final int __TRACE_ID_ISSET_ID = 0;
  private static final int __ID_ISSET_ID = 1;
  private static final int __PARENT_ID_ISSET_ID = 2;
  private static final int __DEBUG_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.PARENT_ID,_Fields.DEBUG};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRACE_ID, new org.apache.thrift.meta_data.FieldMetaData("trace_id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PARENT_ID, new org.apache.thrift.meta_data.FieldMetaData("parent_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ANNOTATIONS, new org.apache.thrift.meta_data.FieldMetaData("annotations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Annotation.class))));
    tmpMap.put(_Fields.BINARY_ANNOTATIONS, new org.apache.thrift.meta_data.FieldMetaData("binary_annotations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BinaryAnnotation.class))));
    tmpMap.put(_Fields.DEBUG, new org.apache.thrift.meta_data.FieldMetaData("debug", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Span.class, metaDataMap);
  }

  public Span() {
    this.debug = false;

  }

  public Span(
    long trace_id,
    String name,
    long id,
    List<Annotation> annotations,
    List<BinaryAnnotation> binary_annotations)
  {
    this();
    this.trace_id = trace_id;
    set_trace_id_isSet(true);
    this.name = name;
    this.id = id;
    set_id_isSet(true);
    this.annotations = annotations;
    this.binary_annotations = binary_annotations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Span(Span other) {
    __isset_bitfield = other.__isset_bitfield;
    this.trace_id = other.trace_id;
    if (other.is_set_name()) {
      this.name = other.name;
    }
    this.id = other.id;
    this.parent_id = other.parent_id;
    if (other.is_set_annotations()) {
      List<Annotation> __this__annotations = new ArrayList<Annotation>(other.annotations.size());
      for (Annotation other_element : other.annotations) {
        __this__annotations.add(new Annotation(other_element));
      }
      this.annotations = __this__annotations;
    }
    if (other.is_set_binary_annotations()) {
      List<BinaryAnnotation> __this__binary_annotations = new ArrayList<BinaryAnnotation>(other.binary_annotations.size());
      for (BinaryAnnotation other_element : other.binary_annotations) {
        __this__binary_annotations.add(new BinaryAnnotation(other_element));
      }
      this.binary_annotations = __this__binary_annotations;
    }
    this.debug = other.debug;
  }

  public Span deepCopy() {
    return new Span(this);
  }

  @Override
  public void clear() {
    set_trace_id_isSet(false);
    this.trace_id = 0;
    this.name = null;
    set_id_isSet(false);
    this.id = 0;
    set_parent_id_isSet(false);
    this.parent_id = 0;
    this.annotations = null;
    this.binary_annotations = null;
    this.debug = false;

  }

  public long get_trace_id() {
    return this.trace_id;
  }

  public Span set_trace_id(long trace_id) {
    this.trace_id = trace_id;
    set_trace_id_isSet(true);
    return this;
  }

  public void unset_trace_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TRACE_ID_ISSET_ID);
  }

  /** Returns true if field trace_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_trace_id() {
    return EncodingUtils.testBit(__isset_bitfield, __TRACE_ID_ISSET_ID);
  }

  public void set_trace_id_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TRACE_ID_ISSET_ID, value);
  }

  public String get_name() {
    return this.name;
  }

  public Span set_name(String name) {
    this.name = name;
    return this;
  }

  public void unset_name() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean is_set_name() {
    return this.name != null;
  }

  public void set_name_isSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public long get_id() {
    return this.id;
  }

  public Span set_id(long id) {
    this.id = id;
    set_id_isSet(true);
    return this;
  }

  public void unset_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean is_set_id() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void set_id_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public long get_parent_id() {
    return this.parent_id;
  }

  public Span set_parent_id(long parent_id) {
    this.parent_id = parent_id;
    set_parent_id_isSet(true);
    return this;
  }

  public void unset_parent_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARENT_ID_ISSET_ID);
  }

  /** Returns true if field parent_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_parent_id() {
    return EncodingUtils.testBit(__isset_bitfield, __PARENT_ID_ISSET_ID);
  }

  public void set_parent_id_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARENT_ID_ISSET_ID, value);
  }

  public int get_annotations_size() {
    return (this.annotations == null) ? 0 : this.annotations.size();
  }

  public java.util.Iterator<Annotation> get_annotations_iterator() {
    return (this.annotations == null) ? null : this.annotations.iterator();
  }

  public void add_to_annotations(Annotation elem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<Annotation>();
    }
    this.annotations.add(elem);
  }

  public List<Annotation> get_annotations() {
    return this.annotations;
  }

  public Span set_annotations(List<Annotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public void unset_annotations() {
    this.annotations = null;
  }

  /** Returns true if field annotations is set (has been assigned a value) and false otherwise */
  public boolean is_set_annotations() {
    return this.annotations != null;
  }

  public void set_annotations_isSet(boolean value) {
    if (!value) {
      this.annotations = null;
    }
  }

  public int get_binary_annotations_size() {
    return (this.binary_annotations == null) ? 0 : this.binary_annotations.size();
  }

  public java.util.Iterator<BinaryAnnotation> get_binary_annotations_iterator() {
    return (this.binary_annotations == null) ? null : this.binary_annotations.iterator();
  }

  public void add_to_binary_annotations(BinaryAnnotation elem) {
    if (this.binary_annotations == null) {
      this.binary_annotations = new ArrayList<BinaryAnnotation>();
    }
    this.binary_annotations.add(elem);
  }

  public List<BinaryAnnotation> get_binary_annotations() {
    return this.binary_annotations;
  }

  public Span set_binary_annotations(List<BinaryAnnotation> binary_annotations) {
    this.binary_annotations = binary_annotations;
    return this;
  }

  public void unset_binary_annotations() {
    this.binary_annotations = null;
  }

  /** Returns true if field binary_annotations is set (has been assigned a value) and false otherwise */
  public boolean is_set_binary_annotations() {
    return this.binary_annotations != null;
  }

  public void set_binary_annotations_isSet(boolean value) {
    if (!value) {
      this.binary_annotations = null;
    }
  }

  public boolean is_debug() {
    return this.debug;
  }

  public Span set_debug(boolean debug) {
    this.debug = debug;
    set_debug_isSet(true);
    return this;
  }

  public void unset_debug() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DEBUG_ISSET_ID);
  }

  /** Returns true if field debug is set (has been assigned a value) and false otherwise */
  public boolean is_set_debug() {
    return EncodingUtils.testBit(__isset_bitfield, __DEBUG_ISSET_ID);
  }

  public void set_debug_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DEBUG_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRACE_ID:
      if (value == null) {
        unset_trace_id();
      } else {
        set_trace_id((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unset_name();
      } else {
        set_name((String)value);
      }
      break;

    case ID:
      if (value == null) {
        unset_id();
      } else {
        set_id((Long)value);
      }
      break;

    case PARENT_ID:
      if (value == null) {
        unset_parent_id();
      } else {
        set_parent_id((Long)value);
      }
      break;

    case ANNOTATIONS:
      if (value == null) {
        unset_annotations();
      } else {
        set_annotations((List<Annotation>)value);
      }
      break;

    case BINARY_ANNOTATIONS:
      if (value == null) {
        unset_binary_annotations();
      } else {
        set_binary_annotations((List<BinaryAnnotation>)value);
      }
      break;

    case DEBUG:
      if (value == null) {
        unset_debug();
      } else {
        set_debug((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRACE_ID:
      return Long.valueOf(get_trace_id());

    case NAME:
      return get_name();

    case ID:
      return Long.valueOf(get_id());

    case PARENT_ID:
      return Long.valueOf(get_parent_id());

    case ANNOTATIONS:
      return get_annotations();

    case BINARY_ANNOTATIONS:
      return get_binary_annotations();

    case DEBUG:
      return Boolean.valueOf(is_debug());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRACE_ID:
      return is_set_trace_id();
    case NAME:
      return is_set_name();
    case ID:
      return is_set_id();
    case PARENT_ID:
      return is_set_parent_id();
    case ANNOTATIONS:
      return is_set_annotations();
    case BINARY_ANNOTATIONS:
      return is_set_binary_annotations();
    case DEBUG:
      return is_set_debug();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Span)
      return this.equals((Span)that);
    return false;
  }

  public boolean equals(Span that) {
    if (that == null)
      return false;

    boolean this_present_trace_id = true;
    boolean that_present_trace_id = true;
    if (this_present_trace_id || that_present_trace_id) {
      if (!(this_present_trace_id && that_present_trace_id))
        return false;
      if (this.trace_id != that.trace_id)
        return false;
    }

    boolean this_present_name = true && this.is_set_name();
    boolean that_present_name = true && that.is_set_name();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_parent_id = true && this.is_set_parent_id();
    boolean that_present_parent_id = true && that.is_set_parent_id();
    if (this_present_parent_id || that_present_parent_id) {
      if (!(this_present_parent_id && that_present_parent_id))
        return false;
      if (this.parent_id != that.parent_id)
        return false;
    }

    boolean this_present_annotations = true && this.is_set_annotations();
    boolean that_present_annotations = true && that.is_set_annotations();
    if (this_present_annotations || that_present_annotations) {
      if (!(this_present_annotations && that_present_annotations))
        return false;
      if (!this.annotations.equals(that.annotations))
        return false;
    }

    boolean this_present_binary_annotations = true && this.is_set_binary_annotations();
    boolean that_present_binary_annotations = true && that.is_set_binary_annotations();
    if (this_present_binary_annotations || that_present_binary_annotations) {
      if (!(this_present_binary_annotations && that_present_binary_annotations))
        return false;
      if (!this.binary_annotations.equals(that.binary_annotations))
        return false;
    }

    boolean this_present_debug = true && this.is_set_debug();
    boolean that_present_debug = true && that.is_set_debug();
    if (this_present_debug || that_present_debug) {
      if (!(this_present_debug && that_present_debug))
        return false;
      if (this.debug != that.debug)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Span other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_trace_id()).compareTo(other.is_set_trace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_trace_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.trace_id, other.trace_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_name()).compareTo(other.is_set_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_id()).compareTo(other.is_set_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_parent_id()).compareTo(other.is_set_parent_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_parent_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parent_id, other.parent_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_annotations()).compareTo(other.is_set_annotations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_annotations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.annotations, other.annotations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_binary_annotations()).compareTo(other.is_set_binary_annotations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_binary_annotations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.binary_annotations, other.binary_annotations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_debug()).compareTo(other.is_set_debug());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_debug()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debug, other.debug);
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
    StringBuilder sb = new StringBuilder("Span(");
    boolean first = true;

    sb.append("trace_id:");
    sb.append(this.trace_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (is_set_parent_id()) {
      if (!first) sb.append(", ");
      sb.append("parent_id:");
      sb.append(this.parent_id);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("annotations:");
    if (this.annotations == null) {
      sb.append("null");
    } else {
      sb.append(this.annotations);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("binary_annotations:");
    if (this.binary_annotations == null) {
      sb.append("null");
    } else {
      sb.append(this.binary_annotations);
    }
    first = false;
    if (is_set_debug()) {
      if (!first) sb.append(", ");
      sb.append("debug:");
      sb.append(this.debug);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class SpanStandardSchemeFactory implements SchemeFactory {
    public SpanStandardScheme getScheme() {
      return new SpanStandardScheme();
    }
  }

  private static class SpanStandardScheme extends StandardScheme<Span> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Span struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.trace_id = iprot.readI64();
              struct.set_trace_id_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.set_name_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.set_id_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PARENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.parent_id = iprot.readI64();
              struct.set_parent_id_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ANNOTATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.annotations = new ArrayList<Annotation>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  Annotation _elem2;
                  _elem2 = new Annotation();
                  _elem2.read(iprot);
                  struct.annotations.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.set_annotations_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // BINARY_ANNOTATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.binary_annotations = new ArrayList<BinaryAnnotation>(_list3.size);
                for (int _i4 = 0; _i4 < _list3.size; ++_i4)
                {
                  BinaryAnnotation _elem5;
                  _elem5 = new BinaryAnnotation();
                  _elem5.read(iprot);
                  struct.binary_annotations.add(_elem5);
                }
                iprot.readListEnd();
              }
              struct.set_binary_annotations_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // DEBUG
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.debug = iprot.readBool();
              struct.set_debug_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Span struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TRACE_ID_FIELD_DESC);
      oprot.writeI64(struct.trace_id);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.is_set_parent_id()) {
        oprot.writeFieldBegin(PARENT_ID_FIELD_DESC);
        oprot.writeI64(struct.parent_id);
        oprot.writeFieldEnd();
      }
      if (struct.annotations != null) {
        oprot.writeFieldBegin(ANNOTATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.annotations.size()));
          for (Annotation _iter6 : struct.annotations)
          {
            _iter6.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.binary_annotations != null) {
        oprot.writeFieldBegin(BINARY_ANNOTATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.binary_annotations.size()));
          for (BinaryAnnotation _iter7 : struct.binary_annotations)
          {
            _iter7.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.is_set_debug()) {
        oprot.writeFieldBegin(DEBUG_FIELD_DESC);
        oprot.writeBool(struct.debug);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SpanTupleSchemeFactory implements SchemeFactory {
    public SpanTupleScheme getScheme() {
      return new SpanTupleScheme();
    }
  }

  private static class SpanTupleScheme extends TupleScheme<Span> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Span struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.is_set_trace_id()) {
        optionals.set(0);
      }
      if (struct.is_set_name()) {
        optionals.set(1);
      }
      if (struct.is_set_id()) {
        optionals.set(2);
      }
      if (struct.is_set_parent_id()) {
        optionals.set(3);
      }
      if (struct.is_set_annotations()) {
        optionals.set(4);
      }
      if (struct.is_set_binary_annotations()) {
        optionals.set(5);
      }
      if (struct.is_set_debug()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.is_set_trace_id()) {
        oprot.writeI64(struct.trace_id);
      }
      if (struct.is_set_name()) {
        oprot.writeString(struct.name);
      }
      if (struct.is_set_id()) {
        oprot.writeI64(struct.id);
      }
      if (struct.is_set_parent_id()) {
        oprot.writeI64(struct.parent_id);
      }
      if (struct.is_set_annotations()) {
        {
          oprot.writeI32(struct.annotations.size());
          for (Annotation _iter8 : struct.annotations)
          {
            _iter8.write(oprot);
          }
        }
      }
      if (struct.is_set_binary_annotations()) {
        {
          oprot.writeI32(struct.binary_annotations.size());
          for (BinaryAnnotation _iter9 : struct.binary_annotations)
          {
            _iter9.write(oprot);
          }
        }
      }
      if (struct.is_set_debug()) {
        oprot.writeBool(struct.debug);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Span struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.trace_id = iprot.readI64();
        struct.set_trace_id_isSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.set_name_isSet(true);
      }
      if (incoming.get(2)) {
        struct.id = iprot.readI64();
        struct.set_id_isSet(true);
      }
      if (incoming.get(3)) {
        struct.parent_id = iprot.readI64();
        struct.set_parent_id_isSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.annotations = new ArrayList<Annotation>(_list10.size);
          for (int _i11 = 0; _i11 < _list10.size; ++_i11)
          {
            Annotation _elem12;
            _elem12 = new Annotation();
            _elem12.read(iprot);
            struct.annotations.add(_elem12);
          }
        }
        struct.set_annotations_isSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.binary_annotations = new ArrayList<BinaryAnnotation>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            BinaryAnnotation _elem15;
            _elem15 = new BinaryAnnotation();
            _elem15.read(iprot);
            struct.binary_annotations.add(_elem15);
          }
        }
        struct.set_binary_annotations_isSet(true);
      }
      if (incoming.get(6)) {
        struct.debug = iprot.readBool();
        struct.set_debug_isSet(true);
      }
    }
  }

}

