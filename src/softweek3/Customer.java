/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softweek3;

/**
 *
 * @author 1208257
 */
public class Customer extends Person {
	private int customerID;

	public Customer(int customerID, String firstName, String lastName) {
		super(firstName, lastName);
		this.customerID = customerID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	
}
