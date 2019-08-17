package com.sun.org.apache.xerces.internal.impl.dv.dtd;

import com.sun.org.apache.xerces.internal.impl.dv.DatatypeValidator;
import com.sun.org.apache.xerces.internal.impl.dv.InvalidDatatypeValueException;
import com.sun.org.apache.xerces.internal.impl.dv.ValidationContext;
import com.sun.org.apache.xerces.internal.util.XMLChar;

public class IDREFDatatypeValidator implements DatatypeValidator {
  public void validate(String paramString, ValidationContext paramValidationContext) throws InvalidDatatypeValueException {
    if (paramValidationContext.useNamespaces()) {
      if (!XMLChar.isValidNCName(paramString))
        throw new InvalidDatatypeValueException("IDREFInvalidWithNamespaces", new Object[] { paramString }); 
    } else if (!XMLChar.isValidName(paramString)) {
      throw new InvalidDatatypeValueException("IDREFInvalid", new Object[] { paramString });
    } 
    paramValidationContext.addIdRef(paramString);
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\org\apache\xerces\internal\impl\dv\dtd\IDREFDatatypeValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */