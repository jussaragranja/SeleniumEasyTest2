package br.com.seleniumeasytest.jussara.support;

import org.slf4j.Logger;

/**
 * @author jussaragranja
 * Class for log
 */

public class Log {
	
	private static final Logger logger = LoggerUtil.getLogger();
	
	
	public static void erro(String pMensagem){
		try {
			String vMensagemFinal = pMensagem;
			logger.error(vMensagemFinal);
		} catch (Exception e) {

		}
	}

	public static void debug(String pMensagem){
		try {
			String vMensagemFinal = pMensagem;
			logger.debug(vMensagemFinal);
		} catch (Exception e) {
			
		}
	}
	
	public static void info(String pMensagem){
		try {
			logger.info(pMensagem);
		} catch (Exception e) {
			
		}
	}
	
	public static void erro(String string, Exception e){
		logger.error(string,e);
	}
	
	public static void excecao(Exception vExcecao){
		if(vExcecao != null) {
			StringBuilder vBuilder = new StringBuilder();
		
			vBuilder.append("[EXCEÇÃO OCORRIDA]: " + vExcecao.getMessage());
			vBuilder.append('\n');
			vBuilder.append('\n');
			vBuilder.append('\n' + extrairStackTrace(vExcecao));
			vBuilder.append('\n');
			erro(vBuilder.toString(),vExcecao);
		}
	}
	
	private static String extrairStackTrace(Exception e){
		StackTraceElement[] stack = e.getStackTrace();
		String exception = "";
		for (StackTraceElement s : stack) {
			exception = exception + s.toString() + "\n\t\t";
		}
		return exception;
	}
}