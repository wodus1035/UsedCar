import java.util.Scanner;

public class View_vehicle {
	public View_vehicle() {
		Scanner scanner = new Scanner(System.in);
		int menu;
		do {
			System.out.println("1.Vehicle 2.Order 3.Admin Function 4.Exit");
			System.out.print("Select Menu>");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				View_saleing_vehicle();
				break;
			case 2:
				View_maker_vehicle();
				break;
			case 3:
				//new Find_vehicle();
				break;
			case 4:
			default:
			}
		} while (menu != 4);
	}


	private void View_saleing_vehicle() {
		//SELECT * FROM vehicle WHERE vehicle_number not in (SELECT * FROM invisible);
	}
	private void View_maker_vehicle() {
		int make;
		//Show 1.Hundye 2.KIA ... in 
		//SELECT * FROM MAKER; 
		
		//SELECT * FROM vehicle WHERE get_make = $make ;
		
	}
}
