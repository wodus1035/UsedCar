import java.util.Scanner;

public class Admin_interface {
	public Admin_interface() {
		Scanner scanner = new Scanner(System.in);
		int menu;
		do {
			System.out.println("1.Vehicle 2.Order 3.Admin Function 4.Exit");
			System.out.print("Select Menu>");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				new View_vehicle();
				break;
			case 2:
				new Admin_order();
				break;
			case 3:
				new Admin_function();
				break;
			case 4:
			default:
			}
		} while (menu != 4);
	}
	
}
