package br.com.systemplus.meuemprego;

import java.util.Calendar;
import java.util.Date;

import br.com.systemplus.meuemprego.date.DateCoverter;

public class TestaDateConverter {
	
	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		
		System.out.println(DateCoverter.converter(date));
	}
}
