import java.util.Scanner;

public class Admin_function {
	public Admin_function() {
		Scanner scanner = new Scanner(System.in);
		int menu;

		do {
			System.out.println("1.Enroll Vehicle 2.Edit Vehicle 3.Set Invisible 4.Exit");
			System.out.print("Select Menu>");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				Enroll_vehicle();
				break;
			case 2:
				Edit_vehicle();
				break;
			case 3:
				Set_invisible();
				break;
			case 4:
			default:
			}
		} while (menu != 4);
	}

	public void Enroll_vehicle() {
		
	}

	public void Edit_vehicle() {

	}

	public void Set_invisible() {

	}

}
