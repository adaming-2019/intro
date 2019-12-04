package fr.adaming.utils;


public class DateConversion {

	public static java.sql.Date convertUtilToSql(java.util.Date date){
		java.sql.Date sDate = new java.sql.Date(date.getTime());
        return sDate;
	}
}
