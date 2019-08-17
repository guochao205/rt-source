package com.sun.org.omg.SendingContext;

import org.omg.CORBA.Any;
import org.omg.CORBA.BAD_PARAM;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.portable.Delegate;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.ObjectImpl;
import org.omg.CORBA.portable.OutputStream;

public final class CodeBaseHelper {
  private static String _id = "IDL:omg.org/SendingContext/CodeBase:1.0";
  
  private static TypeCode __typeCode = null;
  
  public static void insert(Any paramAny, CodeBase paramCodeBase) {
    OutputStream outputStream = paramAny.create_output_stream();
    paramAny.type(type());
    write(outputStream, paramCodeBase);
    paramAny.read_value(outputStream.create_input_stream(), type());
  }
  
  public static CodeBase extract(Any paramAny) { return read(paramAny.create_input_stream()); }
  
  public static TypeCode type() {
    if (__typeCode == null)
      __typeCode = ORB.init().create_interface_tc(id(), "CodeBase"); 
    return __typeCode;
  }
  
  public static String id() { return _id; }
  
  public static CodeBase read(InputStream paramInputStream) { return narrow(paramInputStream.read_Object(_CodeBaseStub.class)); }
  
  public static void write(OutputStream paramOutputStream, CodeBase paramCodeBase) { paramOutputStream.write_Object(paramCodeBase); }
  
  public static CodeBase narrow(Object paramObject) {
    if (paramObject == null)
      return null; 
    if (paramObject instanceof CodeBase)
      return (CodeBase)paramObject; 
    if (!paramObject._is_a(id()))
      throw new BAD_PARAM(); 
    Delegate delegate = ((ObjectImpl)paramObject)._get_delegate();
    return new _CodeBaseStub(delegate);
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\org\omg\SendingContext\CodeBaseHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */