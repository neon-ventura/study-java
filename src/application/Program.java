package application;

<<<<<<< HEAD
import java.util.Scanner;

import model.entities.CreditCard;
import model.entities.DebitCard;
import model.entities.FormaDePagamento;
import model.entities.Pix;
=======
>>>>>>> 5ffe563dc68efba87b594f766c3c0eefa287d4e1

public class Program {
	
	static FormaDePagamento pagamento;

	public static void main(String[] args) {
<<<<<<< HEAD

		Scanner in = new Scanner(System.in);

		System.out.println("Payment method:");

		System.out.println("1 - Pix");
		System.out.println("2 - Credit Card");
		System.out.println("3 - Debit Card");

		int method = in.nextInt();
		if (method != 1 && method != 2 && method != 3) {
			System.out.println("Invalid option. Please choose a valid payment method.");
			in.close();
			return;
		}

		System.out.print("Quantity: ");

		double quantity = in.nextDouble();

		if (method == 1) {
			pagamento = new Pix();
		} else if (method == 2) {
			pagamento = new CreditCard();
		} else if (method == 3) {
			pagamento = new DebitCard();
		}else {
			System.out.println("Error in input!");
		}
		pagamento.pagar(quantity);

		in.close();
=======
		System.out.println("new commit in neon-notebook now really!");
>>>>>>> 5ffe563dc68efba87b594f766c3c0eefa287d4e1
	}

}
