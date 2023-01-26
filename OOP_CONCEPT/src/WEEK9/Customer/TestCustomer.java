package Week9.Customer;

public class TestCustomer {
	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		System.out.println(c1);
		c1.setDiscount(5);
		System.out.println(c1);
		Line();
		System.out.print("id is ");
		System.out.println(c1.getID());
		System.out.print("name is ");
		System.out.println(c1.getName());
		System.out.print("discount is ");
		System.out.println(c1.getDiscount());
		Line();
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
		System.out.println(inv1);
		inv1.setAmount(10000);
		System.out.println(inv1);
		Line();
		System.out.println(inv1.getID());
		System.out.println(inv1.getCustomer());
		System.out.println(inv1.getAmount());
		Line();
		System.out.println("customer's id is:"+inv1.getCustomer().getID());
		System.out.println("customer's name is:"+inv1.getCustomer().getName());		
		System.out.println("customer's discount is: "+inv1.getCustomer().getDiscount());		
		System.out.println("amount after discount is:"+inv1.getAmountAfterDiscount());		
	} // end of main method()

	public static void Line() {
		for (int i = 1; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
	} // end of class()
}
