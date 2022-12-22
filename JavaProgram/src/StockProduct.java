import java.util.*;
import java.text.*;

public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat frm = new DecimalFormat("#,###.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] productList = new Product[4];

		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();

			System.out.print("Input product Id    : ");
			productList[i].setId(scan.nextLine());

			System.out.print("Input product unit  : ");
			productList[i].setUnit(scan.nextInt());
			while (!(productList[i].getUnit() > 0)) {
				System.out.print("Input product unit, again  : ");
				productList[i].setUnit(scan.nextInt());
			}

			System.out.print("Input product Price : ");
			productList[i].setPrice(scan.nextDouble());
			while (!(productList[i].getPrice() > 0)) {
				System.out.print("Input product price, again  : ");
				productList[i].setPrice(scan.nextInt());
			}

			System.out.println();
		}
		double sum = 0;
		System.out.println("-----------------------------------------------------");
		for (Product product : productList) {
			System.out.println("Product ID : " + product.getId() + ", Total price = "
					+ frm.format(product.calculate() + " baht."));
			sum += product.calculate();
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Total price of all products is " + frm.format(sum) + " baht.");
	}

}
