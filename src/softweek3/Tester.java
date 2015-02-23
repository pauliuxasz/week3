/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softweek3;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author 1208257
 */
public class Tester {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		
		Date date1 = new Date();
		Customer customer = new Customer(200, "Julian", "Bass");
		System.out.println(customer);
		
		
	}
	
}
