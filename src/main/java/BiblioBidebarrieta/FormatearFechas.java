package BiblioBidebarrieta;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.spi.CalendarDataProvider;

public class FormatearFechas {
	
	public FormatearFechas() {
		
	}
	
	public Calendar Formatear(String fechaRecibida)
	{
		fechaRecibida = fechaRecibida.replaceAll(" ", "");
		int dia = 0;
		int mes = 0;
		int ano = 0;//	String pattern = "^(\d{1,2})[-*\/=]?([a-zA-Z]+|\d{1,2})[-*\/=]?(\d{2,4})";
		String patron = "^(\\d{1,2})[-*\\/=]?([a-zA-Z]+|\\d{1,2})[-*\\/=]?(\\d{2,4})";
		Pattern pattern = Pattern.compile(patron);
	    Matcher matcher = pattern.matcher(fechaRecibida);
	    if (matcher.find( )) {
	    	 dia = Integer.parseInt(matcher.group(1));
	    	 ano = Integer.parseInt(matcher.group(3));
	    	 if (ano<100)
	    	 {
	    		 ano = ano+1900;
	    	 }
	     	switch (matcher.group(2))
			{
				case "Enero":
					mes = 1;
				case "Febrero":
					mes = 2;
				case "Marzo":
					mes = 3;
				case "Abril":
					mes = 4;
				case "Mayo":
					mes = 5;
				case "Junio":
					mes = 6;
				case "Julio":
					mes = 7;
				case "Agosto":
					mes = 8;
				case "Septiembre":
					mes = 9;
				case "Octubre":
					mes = 10;
				case "Noviembre":
					mes = 11;
				case "Diciembre":
					mes = 12;
				default :
					mes = 1;
			}
	
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");	
			Calendar calendar = new GregorianCalendar(ano,mes,dia);	
			return calendar;
	     }else {
	        System.out.println("Fecha Incorrecta, aplicando default");
	        Calendar calendar = new GregorianCalendar();	
	        return calendar;
	       
	     }
		
	}
	
}
