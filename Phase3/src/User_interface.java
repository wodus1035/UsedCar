
import java.util.Scanner;

public class User_interface {
	public User_interface() {
		Scanner scanner = new Scanner(System.in);
		int menu;

		do {
			System.out.println("1.Vehicle 2.Order 3.Exit");
			System.out.print("Select Menu>");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				new View_vehicle();
				break;
			case 2:
				break;
			case 3:
				break;
			default:
			}
		} while (menu != 3);
	}

	private void view_Order() {

	}
}
