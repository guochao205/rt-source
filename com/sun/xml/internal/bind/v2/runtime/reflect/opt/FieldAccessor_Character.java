package com.sun.xml.internal.bind.v2.runtime.reflect.opt;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;

public class FieldAccessor_Character extends Accessor {
  public FieldAccessor_Character() { super(Character.class); }
  
  public Object get(Object paramObject) { return Character.valueOf(((Bean)paramObject).f_char); }
  
  public void set(Object paramObject1, Object paramObject2) { ((Bean)paramObject1).f_char = (paramObject2 == null) ? Const.default_value_char : ((Character)paramObject2).charValue(); }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\xml\internal\bind\v2\runtime\reflect\opt\FieldAccessor_Character.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */