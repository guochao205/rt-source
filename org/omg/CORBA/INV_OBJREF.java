package org.omg.CORBA;

public final class INV_OBJREF extends SystemException {
  public INV_OBJREF() { this(""); }
  
  public INV_OBJREF(String paramString) { this(paramString, 0, CompletionStatus.COMPLETED_NO); }
  
  public INV_OBJREF(int paramInt, CompletionStatus paramCompletionStatus) { this("", paramInt, paramCompletionStatus); }
  
  public INV_OBJREF(String paramString, int paramInt, CompletionStatus paramCompletionStatus) { super(paramString, paramInt, paramCompletionStatus); }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\org\omg\CORBA\INV_OBJREF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */