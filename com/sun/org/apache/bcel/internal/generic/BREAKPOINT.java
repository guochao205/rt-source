package com.sun.org.apache.bcel.internal.generic;

public class BREAKPOINT extends Instruction {
  public BREAKPOINT() { super((short)202, (short)1); }
  
  public void accept(Visitor paramVisitor) { paramVisitor.visitBREAKPOINT(this); }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\org\apache\bcel\internal\generic\BREAKPOINT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */