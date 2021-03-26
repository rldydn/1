package project;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static String id;
	static String pwd;
	static boolean mainLogin=false;
	static boolean mainRun=true;
	final static Id admin = new Id("admin","1111");	//관리자 계정


	public static void main(String[] args) {
		Employee[] emp = new Employee[100];	
		for(int i =0;i<emp.length;i++) {
			emp[i] = new Employee();
		}

		while(mainRun) {
			if(!mainLogin) {
				login(emp);
			}else {
				new AdminMode(emp);
			}
			
		}


	}
	private static void login(Employee[] emp) {
		System.out.println("-----------");
		System.out.println("근태관리 프로그램");
		System.out.print("ID : ");
		id = sc.next();
		System.out.print("PASSWORD : ");
		pwd = sc.next();

		if(id.equals(admin.id) && pwd.equals(admin.pwd)) {
			mainLogin=true;
			new AdminMode(emp);
		}

	}
	Main(boolean mainLogin){
		this.mainLogin = mainLogin;
	}

	Main(){}

}
