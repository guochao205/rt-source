package org.omg.DynamicAny;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Properties;
import org.omg.CORBA.Any;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.portable.Delegate;
import org.omg.CORBA.portable.ObjectImpl;
import org.omg.CORBA.portable.ServantObject;
import org.omg.DynamicAny.DynAnyPackage.InvalidValue;
import org.omg.DynamicAny.DynAnyPackage.TypeMismatch;

public class _DynArrayStub extends ObjectImpl implements DynArray {
  public static final Class _opsClass = DynArrayOperations.class;
  
  private static String[] __ids = { "IDL:omg.org/DynamicAny/DynArray:1.0", "IDL:omg.org/DynamicAny/DynAny:1.0" };
  
  public Any[] get_elements() {
    servantObject = _servant_preinvoke("get_elements", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_elements();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void set_elements(Any[] paramArrayOfAny) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("set_elements", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.set_elements(paramArrayOfAny);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public DynAny[] get_elements_as_dyn_any() {
    servantObject = _servant_preinvoke("get_elements_as_dyn_any", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_elements_as_dyn_any();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void set_elements_as_dyn_any(DynAny[] paramArrayOfDynAny) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("set_elements_as_dyn_any", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.set_elements_as_dyn_any(paramArrayOfDynAny);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public TypeCode type() {
    servantObject = _servant_preinvoke("type", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.type();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void assign(DynAny paramDynAny) throws TypeMismatch {
    servantObject = _servant_preinvoke("assign", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.assign(paramDynAny);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void from_any(Any paramAny) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("from_any", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.from_any(paramAny);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public Any to_any() {
    servantObject = _servant_preinvoke("to_any", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.to_any();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public boolean equal(DynAny paramDynAny) {
    servantObject = _servant_preinvoke("equal", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.equal(paramDynAny);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void destroy() {
    servantObject = _servant_preinvoke("destroy", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.destroy();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public DynAny copy() {
    servantObject = _servant_preinvoke("copy", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.copy();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_boolean(boolean paramBoolean) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_boolean", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_boolean(paramBoolean);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_octet(byte paramByte) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_octet", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_octet(paramByte);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_char(char paramChar) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_char", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_char(paramChar);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_short(short paramShort) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_short", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_short(paramShort);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_ushort(short paramShort) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_ushort", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_ushort(paramShort);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_long(int paramInt) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_long", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_long(paramInt);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_ulong(int paramInt) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_ulong", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_ulong(paramInt);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_float(float paramFloat) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_float", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_float(paramFloat);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_double(double paramDouble) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_double", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_double(paramDouble);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_string(String paramString) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_string", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_string(paramString);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_reference(Object paramObject) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_reference", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_reference(paramObject);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_typecode(TypeCode paramTypeCode) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_typecode", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_typecode(paramTypeCode);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_longlong(long paramLong) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_longlong", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_longlong(paramLong);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_ulonglong(long paramLong) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_ulonglong", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_ulonglong(paramLong);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_wchar(char paramChar) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_wchar", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_wchar(paramChar);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_wstring(String paramString) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_wstring", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_wstring(paramString);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_any(Any paramAny) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_any", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_any(paramAny);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_dyn_any(DynAny paramDynAny) throws TypeMismatch {
    servantObject = _servant_preinvoke("insert_dyn_any", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_dyn_any(paramDynAny);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void insert_val(Serializable paramSerializable) throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("insert_val", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.insert_val(paramSerializable);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public boolean get_boolean() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_boolean", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_boolean();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public byte get_octet() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_octet", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_octet();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public char get_char() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_char", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_char();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public short get_short() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_short", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_short();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public short get_ushort() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_ushort", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_ushort();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public int get_long() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_long", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_long();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public int get_ulong() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_ulong", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_ulong();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public float get_float() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_float", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_float();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public double get_double() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_double", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_double();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public String get_string() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_string", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_string();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public Object get_reference() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_reference", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_reference();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public TypeCode get_typecode() {
    servantObject = _servant_preinvoke("get_typecode", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_typecode();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public long get_longlong() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_longlong", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_longlong();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public long get_ulonglong() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_ulonglong", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_ulonglong();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public char get_wchar() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_wchar", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_wchar();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public String get_wstring() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_wstring", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_wstring();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public Any get_any() {
    servantObject = _servant_preinvoke("get_any", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_any();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public DynAny get_dyn_any() {
    servantObject = _servant_preinvoke("get_dyn_any", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_dyn_any();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public Serializable get_val() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("get_val", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.get_val();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public boolean seek(int paramInt) {
    servantObject = _servant_preinvoke("seek", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.seek(paramInt);
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public void rewind() {
    servantObject = _servant_preinvoke("rewind", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      dynArrayOperations.rewind();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public boolean next() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("next", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.next();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public int component_count() throws TypeMismatch, InvalidValue {
    servantObject = _servant_preinvoke("component_count", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.component_count();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public DynAny current_component() {
    servantObject = _servant_preinvoke("current_component", _opsClass);
    DynArrayOperations dynArrayOperations = (DynArrayOperations)servantObject.servant;
    try {
      return dynArrayOperations.current_component();
    } finally {
      _servant_postinvoke(servantObject);
    } 
  }
  
  public String[] _ids() { return (String[])__ids.clone(); }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException {
    String str = paramObjectInputStream.readUTF();
    String[] arrayOfString = null;
    Properties properties = null;
    oRB = ORB.init(arrayOfString, properties);
    try {
      Object object = oRB.string_to_object(str);
      Delegate delegate = ((ObjectImpl)object)._get_delegate();
      _set_delegate(delegate);
    } finally {
      oRB.destroy();
    } 
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    String[] arrayOfString = null;
    Properties properties = null;
    oRB = ORB.init(arrayOfString, properties);
    try {
      String str = oRB.object_to_string(this);
      paramObjectOutputStream.writeUTF(str);
    } finally {
      oRB.destroy();
    } 
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\org\omg\DynamicAny\_DynArrayStub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */