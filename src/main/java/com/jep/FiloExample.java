package com.jep;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FiloExample {
	public static void main(String[] args) throws FilloException {
		Fillo fo= new Fillo();
		String query="select * from Employ";
		Connection con= fo.getConnection("D:\\Selenium_Training\\Jep00\\AutomationExample.xlsx");
		Recordset rs=con.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getField("test1").toString());
		}
	}

}
