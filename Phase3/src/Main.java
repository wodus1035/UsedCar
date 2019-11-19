
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Main_option mopt = new Main_option();
		
		Member m  = new Member();
		MemberDAO mDAO = new MemberDAO();
		
		
		while(true) {
			//Main menu print
			System.out.println("----------------------------- Welcome to Last_Eat Used Car! ------------------------------");
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("1. Sign up  2. Login  3. exit");
			System.out.print("select : ");
			
			int menu = sc.nextInt();
			
			if(menu == 3) {
				System.out.println("---------------------------------- Come Again! ------------------------------------------");
				break;
			}
			
			switch(menu) {
				
				case 1:
					m = mopt.Sign_up(sc);
					mDAO.Insert_member(m);
					break;
				
				case 2:
					mopt.Login(sc);
					break;
				
				default:
					System.out.println("Try Again!");
					break;
			
			}
			
		}
		sc.close();

	}
	
	

}
