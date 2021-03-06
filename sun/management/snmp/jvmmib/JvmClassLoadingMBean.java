package sun.management.snmp.jvmmib;

import com.sun.jmx.snmp.SnmpStatusException;

public interface JvmClassLoadingMBean {
  EnumJvmClassesVerboseLevel getJvmClassesVerboseLevel() throws SnmpStatusException;
  
  void setJvmClassesVerboseLevel(EnumJvmClassesVerboseLevel paramEnumJvmClassesVerboseLevel) throws SnmpStatusException;
  
  void checkJvmClassesVerboseLevel(EnumJvmClassesVerboseLevel paramEnumJvmClassesVerboseLevel) throws SnmpStatusException;
  
  Long getJvmClassesUnloadedCount() throws SnmpStatusException;
  
  Long getJvmClassesTotalLoadedCount() throws SnmpStatusException;
  
  Long getJvmClassesLoadedCount() throws SnmpStatusException;
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\sun\management\snmp\jvmmib\JvmClassLoadingMBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */