import java.util.Scanner;

public class Admin_order {
	public Admin_order() {
		Scanner scanner = new Scanner(System.in);
		int menu;
		do {
			System.out.println("1.View All Order 2.View Income 3.Exit");
			System.out.print("Select Menu>");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				View_all_order();
				break;
			case 2:
				new View_income();
				break;
			case 3:
			default:
			}
		} while (menu != 3);
	}

	private void View_all_order() {
		//SELECT * FROM ORDER;
	}
}
