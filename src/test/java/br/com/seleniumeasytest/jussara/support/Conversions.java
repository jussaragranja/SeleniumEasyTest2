package br.com.seleniumeasytest.jussara.support;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author jussaragranja
 * Conversions
 */

public class Conversions {

	/**
	 * Verifica se string eh nao-nula e nao-vazia
	 */
	public static boolean checkStringNotNullByte(String string){
		return (string != null) && (!string.equals(""));
	}
	
	/**
	 * Verifica se a string eh nao-nula e nao-vazia
	 */
	public static boolean checkStringNotNullComTrim(String string){
		return (string != null) && (!string.trim().equals(""));
	}

	/**
	 * Verifica se o array de bytes eh nao-nulo e nao-vazio
	 */
	public static boolean checkStringNotNullByte(byte[] s){
		return (s != null) && (s.length != 0);
	}

	/**
	 * Verifica se a string pode ser convertida em um inteiro
	 */
	public static boolean isInteger(String string){
		try {
			Integer.parseInt(string);
			return true;
		} catch (NumberFormatException error) {
			return false;
		}
	}

	/**
	 * Verifica se a string pode ser convertida em um long
	 */
	public static boolean isLong(String string){
		try {
			if(string == null)
				return false;
			Long.parseLong(string);
			return true;
		} catch (NumberFormatException error) {
			return false;
		}
	}

	/**
	 * Verifica se a string pode ser convertida em um double
	 */
	public static boolean isDoubleNumberFormat(String string){
		try {
			if(string == null)
				return false;
			Double.parseDouble(string);
			return true;
		} catch (NumberFormatException error) {
			return false;
		}
	}

	/**
	 * Verifica se a string pode ser convertida em um double
	 */
	public static boolean isDoubleNumberFormat(String string, NumberFormat numberFormat){
		try {
			if(string == null)
				return false;
			numberFormat.parse(string);
			return true;
		} catch (ParseException error) {
			return false;
		}
	}

	/**
	 * Verifica se a data eh valida
	 */
	public static boolean isDate(String s, SimpleDateFormat simpleDateFormat){
		try {
			if(s != null) {
				if(simpleDateFormat.toPattern().trim().length() == s.trim().length()){
					simpleDateFormat.setLenient(false);
					simpleDateFormat.parse(s);
					return true;
				}
			}
			return false;
		} catch (ParseException error) {
			return false;
		}
	}

	/**
	 * Verifica se a hora eh valida
	 */
	public static boolean isHour(String s, SimpleDateFormat simpleDateFormat){
		try {
			simpleDateFormat.parse(s);
			return true;
		} catch (ParseException error) {
			return false;
		}
	}

	public static String intToString(int number){
		String numberString = Integer.toString(number);

		return numberString;
	}

	public static int stringToInt(String string){
		int numberString = Integer.parseInt(string);

		return numberString;
	}

}
