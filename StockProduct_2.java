import java.util.*;

public class StockProduct_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many product list in stock : ");
		int size = scan.nextInt();

		Product[] stockproduct = new Product[size];

		for (int i = 0; i < stockproduct.length; i++) {
			stockproduct[i] = new Product();
			System.out.println();
			System.out.print("Input product Id    : ");
			stockproduct[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			stockproduct[i].setUnit(scan.nextInt());
			while (stockproduct[i].getUnit() < 0) {
				System.out.print("Input product Unit, again : ");
				stockproduct[i].setUnit(scan.nextInt());
			}
		}

		display("LOW", stockproduct);
		display("NORMAL", stockproduct);
		display("HIGH", stockproduct);

	}

	public static void display(String message, Product[] stockproduct) {

		System.out.println("-------------------------------------------------");
		System.out.println("LIST OF PRODUCT IN '" + message + "' status.");
		System.out.println("-------------------------------------------------");

		for (Product product : stockproduct) {
			if (product.checkProduct().equals("LOW") && message.equalsIgnoreCase("LOW")) {
				System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units.");

			} else if (product.checkProduct().equals("NORMAL") && message.equalsIgnoreCase("NORMAL")) {
				System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units.");

			} else if (product.checkProduct().equals("HIGH") && message.equalsIgnoreCase("HIGH")) {
				System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units.");

			}
		}
	}
}