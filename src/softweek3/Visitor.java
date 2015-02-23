/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softweek3;

import java.util.Date;

/**
 *
 * @author 1208257
 */
public class Visitor extends Person {
	private Date visitDate;

	public Visitor(Date visitDate, String firstName, String lastName) {
		super(firstName, lastName);
		this.visitDate = visitDate;
	}

	

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	
	
}
