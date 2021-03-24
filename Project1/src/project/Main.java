package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		String pwd;
		boolean mainRun=true;
		Id admin = new Id("admin","1111");	//관리자 계정
		Employee[] emp = new Employee[100];
		for(int i =0;i<emp.length;i++) {
			emp[i] = new Employee();
		}
		
		while(mainRun) {
			System.out.println("-----------");
			System.out.println("근태관리 프로그램");
			System.out.print("ID : ");
			id = sc.next();
			System.out.print("PASSWORD : ");
			pwd = sc.next();
		
			if(id.equals(admin.id) && pwd.equals(admin.pwd)) {
				new AdminMode(emp);
			}
		
		}
		
		
		
		
	}

}
