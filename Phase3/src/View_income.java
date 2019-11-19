import java.util.Scanner;

public class View_income {
	public View_income() {
		Scanner scanner = new Scanner(System.in);
		int menu;
		do {
			System.out.println("1.Monthly sales 2.Sales by Manufacturer 3.Set Invisible 4.Exit");
			System.out.print("Select Menu>");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				Monthly_sales();
				break;
			case 2:
				Yearly_sales();
				break;
			case 3:
				Sales_by_manufacturer();
				break;
			case 4:
				Set_invisible();
				break;
			case 5:
			default:
			}
		} while (menu != 4);
	}

	private void Monthly_sales() { 
		/*
		select TO_CHAR(sold_date,'YYYY_MM'),sum(price),count(*)
		from "ORDER" join VEHICLE on Enroll_number = vehicle_number
		group by TO_CHAR(sold_date,'YYYY_MM')
		order by TO_CHAR(sold_date,'YYYY_MM')
		 */
	}

	private void Yearly_sales() {
		/*
		select TO_CHAR(sold_date,'YYYY'),sum(price),count(*)
		from "ORDER" join VEHICLE on Enroll_number = vehicle_number
		group by TO_CHAR(sold_date,'YYYY')
		order by TO_CHAR(sold_date,'YYYY')
		 */
	}
	
	private void Sales_by_manufacturer() {
		/*
	 	WITH Sumary(numbers,sums,counts) as (	select GET_MAKE, sum(price), count(*)
					from "ORDER" join VEHICLE on Enroll_number = vehicle_number
					group by GET_MAKE)
		SELECT MAKE_NAME, SUMS
		FROM sumary join make on numbers = make_number
		*/
	}
	private void Set_invisible() {
		
	}

	
}
