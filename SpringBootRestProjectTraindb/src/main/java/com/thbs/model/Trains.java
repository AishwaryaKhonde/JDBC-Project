package com.thbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Trains {
	@Id
	private int trainno;
	private String trainname;
	private String source;
	private String destination;
	private int ticketprice;
	
	public Trains() {
		super();
	}
	
	public Trains(int trainno, String trainname, String source, String destination, int ticketprice) {
		super();
		this.trainno = trainno;
		this.trainname = trainname;
		this.source = source;
		this.destination = destination;
		this.ticketprice = ticketprice;
	}

	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public String getTrainname() {
		return trainname;
	}
	public void setTrainname(String trainname) {
		this.trainname = trainname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}
	@Override
	public String toString() {
		return "Trains [trainno=" + trainno + ", trainname=" + trainname + ", source=" + source + ", destination="
				+ destination + ", ticketprice=" + ticketprice + "]";
	}
	
	

}
