/**
 * 
 */
package de.hannit.fsch.soa.osecm;

import java.util.List;

/**
 * @author fsch
 *
 */
public interface IAZVClient
{
public static final String JOB_GETSERVERINFO = "krn.GetServerInfo";
public static final String PARAMETER_INTEGER_FLAGS = "Flags";	
public static final String PARAMETER_INTEGER_INFO = "Info";
public static final String PARAMETER_STZRING_ENCODING = "Encoding";	
	
public String getServiceInfo();
public String getServerInfo();
public List<?> getResultList();
}
