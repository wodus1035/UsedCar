import java.util.Scanner;

public class Main_option {
	
	Member m = new Member();
	MemberDAO mDAO = new MemberDAO();
	int cnt;
	
	public Member Sign_up(Scanner sc) {
		
		while(true) {
		System.out.print("(*Required fields*) ID: ");
		String id = sc.next();
		m.setId(id);
		cnt = mDAO.id_check(m);
		if(cnt==0) break;
		else System.out.println("     ID Duplication");
		
		}
		
		System.out.print("(*Required fields*) Password: ");
		String pwd = sc.next();
		System.out.print("(*Required fields*) Tel: ");
		String tel = sc.next();
		System.out.print("                    Address: ");
		String address = sc.next();
		System.out.print("(*Required fields*) Fname: ");
		String fname = sc.next();
		System.out.print("(*Required fields*) Lname: ");
		String lname = sc.next();
		System.out.print("                    Sex: ");
		String sex = sc.next();
		System.out.print("                    Birth_Day: ");
		String birth_D = sc.next();
		System.out.print("                    Job: ");
		String job = sc.next();
		System.out.print("                    Administor: ");
		int permission = sc.nextInt();
		
		try {
				
				m.setPwd(pwd);
				m.setTel(tel);
				m.setAddress(address);
				m.setFname(fname);
				m.setLname(lname);
				m.setSex(sex);
				m.setBirth_D(birth_D);
				m.setJob(job);
				m.setPermission(permission);
				
		}catch(Exception e) {
			e.getMessage();
		}
		
		return m;
	}
<<<<<<< HEAD
	public void Login(Scanner sc) {
		
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("1. Edit member information  2. Edit Password  3. Secession  4. exit");
		System.out.print("select : ");
		
		int select = sc.nextInt();
		
		switch(select) {
		
		case 1:
			Edit_inform(sc);
			break;
			
		case 2:
			Edit_Pwd(sc);
			break;
		
		case 3:
			Secession(sc);
			break;
		
		case 4:
			break;
		
		
		}
		
		
	}
	public void Edit_inform(Scanner sc) {
		
		System.out.println("Tel : ");
		String e_tel = sc.next();
		System.out.println("Fname : ");
		String e_fname = sc.next();
		System.out.println("Lname : ");
		String e_lname = sc.next();
		System.out.println("Sex : ");
		String e_sex = sc.next();
		System.out.println("Birth_D : ");
		String e_birth_d = sc.next();
		System.out.println("Address : ");
		String e_address = sc.next();
		System.out.println("Job : ");
		String e_job = sc.next();
=======
	
	public void Login(Scanner sc) {
		
		MemberDAO mDAO = new MemberDAO();
		Member m = new Member();
	
			while(true) {
				
				System.out.print("ID : ");
				String id = sc.next();
				m.setId(id);
				
				System.out.print("Password : ");
				String pwd = sc.next();	
				m.setPwd(pwd);
				
				if(mDAO.id_check(m)>0) {	
					if(mDAO.Login_check(m) == 1) {
						System.out.println("Success");
						break;
					}
					else {
						System.out.println("Failed");
					}
				}else {
					System.out.println("Not Exist ID");
					continue;
				}
	
			}
			
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("1. Edit member information  2. Edit Password  3. Secession  4. exit");
			System.out.print("select : ");
			
			int select = sc.nextInt();
			
			switch(select) {
			
			case 1:
				Edit_inform(sc);
				break;
				
			case 2:
				Edit_Pwd(sc);
				break;
			
			case 3:
				Secession(sc);
				break;
			
			case 4:
				break;
			
			
			}
		}
		
	
	public void Edit_inform(Scanner sc) {
		
		System.out.print("Tel : ");
		String tel = sc.next();
		System.out.print("Fname : ");
		String fname = sc.next();
		System.out.print("Lname : ");
		String lname = sc.next();
		System.out.print("Sex : ");
		String sex = sc.next();
		System.out.print("Birth_D : ");
		String birth_d = sc.next();
		System.out.print("Address : ");
		String address = sc.next();
		System.out.print("Job : ");
		String job = sc.next();
>>>>>>> branch 'master' of https://github.com/wodus1035/UsedCar.git
		
	}
	
	public void Edit_Pwd(Scanner sc) {
		
	}
	public void Secession(Scanner sc) {
		
	}
	

}
