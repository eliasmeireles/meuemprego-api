package br.com.systemplus.meuemprego.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCoverter {
	
	public static String converter(Date date) {
		DateFormat formatedDate = new SimpleDateFormat("dd/MM/yyyy");
		
		return formatedDate.format(date);
	}
}
