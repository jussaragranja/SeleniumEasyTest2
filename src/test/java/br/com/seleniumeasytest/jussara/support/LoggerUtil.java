package br.com.seleniumeasytest.jussara.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jussaragranja
 * Class for log
 */

public final class LoggerUtil {

	private LoggerUtil(){ }
	
	    public static Logger getLogger(){
	        return LoggerFactory.getLogger(LoggerUtil.class);
	    }
}