package Week9.Customer;

public class Invoice {
	
	private int id;
	private Customer customer;
	private double amount;
	
	public Invoice(int id , Customer customer , double amount) {
		this.id=id;
		this.customer = customer;
		this.amount=amount;
	}
	
	public int getID() {
		return this.id;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer =customer;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount =amount;
	}
	
	public int getCustomerID() {
		return customer.getID();	
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return amount - (amount *(getCustomerDiscount()/100));
	}
	public String toString() {
		return "Invoice[id="+id+",customer="+getCustomer().getName()+"("+id+")"+"("+getCustomer().getDiscount()+"%)"+",amount="+String.format("%.2f",amount)+"]";
				//String.format("Invoice[id=%d,customer=%s(%d)(%d%),amount=%.2f]",id,getCustomer().getName(),id,getCustomer().getDiscount(),amount);
				
	}
}

