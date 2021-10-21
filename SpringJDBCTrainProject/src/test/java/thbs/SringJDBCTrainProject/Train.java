package thbs.SringJDBCTrainProject;

public class Train {
	
	private int train_no,ticket_price;
	private String train_name;
	private String source_name,destination;
	
	
	
	

	
//	public Book(int train_no, int ticket_price, String train_name, String source_name, String destination) {
//		
//		this.train_no = train_no;
//		this.ticket_price = ticket_price;
//		this.train_name = train_name;
//		this.source_name = source_name;
//		this.destination = destination;
//	}
	

	public int getTrain_no() {
		return train_no;
	}
	
	public int getTicket_price() {
		return ticket_price;
	}
	
	public String getTrain_name() {
		return train_name;
	}
	
	public String getSource_name() {
		return source_name;
	}
	
	public String getdestination() {
		return destination;
	}
	
	public void setTrain_no(int train_no) {
		this.train_no=train_no;
	}
	
	public void setTicket_price(int ticket_price) {
		this.ticket_price=ticket_price;
	}
	
	public void setTrain_name(String train_name) {
         this.train_name=train_name;	}
	
	public void setSource_name(String source) {
		this.source_name=source;
	}
	
	public void setdestination(String destination) {
		this.destination=destination;
	}
	
	
	
	@Override
	public String toString() {
		return "Train [train_no=" + train_no + ", ticket_price=" + ticket_price + ", train_name=" + train_name
				+ ", source_name=" + source_name + ", destination=" + destination + "]";
	}	

}


