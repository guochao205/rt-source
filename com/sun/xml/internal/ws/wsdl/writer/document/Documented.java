package com.sun.xml.internal.ws.wsdl.writer.document;

import com.sun.xml.internal.txw2.TypedXmlWriter;
import com.sun.xml.internal.txw2.annotation.XmlElement;

public interface Documented extends TypedXmlWriter {
  @XmlElement
  Documented documentation(String paramString);
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\xml\internal\ws\wsdl\writer\document\Documented.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */