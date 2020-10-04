package br.com.seleniumeasytest.jussara.support;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author jussaragranja
 * support methods for optimizing code
 */

public abstract class Utils {


	public static Date getDataCalendar(){
		Calendar cal = Calendar.getInstance();
		return cal.getTime();
	}
	
	public static String getDataAtualFormatddMMyyyy(){
		try {
			SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
			Calendar calendar = new GregorianCalendar();
			Date data = new Date();
			calendar.setTime(data);
			return formatDate.format(data);
		} catch (Exception e){
			return null;
		}
	}
}
