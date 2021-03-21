package project;

import java.util.Scanner;

public class AdminMode{
	Scanner sc = new Scanner(System.in);
	AdminMode(Employee[] emp){
		System.out.println("1.직원계정등록");
		System.out.println("2.근태정보조회");
		System.out.println("3.급여정보조회");
		System.out.println("4.요청관리");
		System.out.println("5.인사관리");
		System.out.print("입력 > ");
		int sel = sc.nextInt();

		switch(sel) {
		case 1:
			addEmp(emp);
			break;
		case 2:
			output(emp);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
		}
	}


	public void addEmp(Employee[] emp) {
		int i =0;

		do {
			if(emp[i].name == null) {
				System.out.println("아이디 입력");
				String id = sc.next();
				System.out.println("비밀번호 입력");
				String pwd = sc.next();
				System.out.println("직원이름 입력");
				String name = sc.next();
				System.out.println("입사일 입력");
				String date = sc.next();
				System.out.println("직책 입력");
				String position = sc.next();
				System.out.println("직무 입력");
				String duty = sc.next();
				System.out.println("시간 당 급여 입력");
				int pay = sc.nextInt();
				
				emp[i].setId(id);
				emp[i].setPwd(pwd);
				emp[i].setName(name);
				emp[i].setIndex(i+1);
				emp[i].setEnterDate(date);
				emp[i].setPosition(position);
				emp[i].setDuty(duty);
				emp[i].setPay(pay);
				break;
			}else {
				i++;
			}
		} while (emp[i].name == null);
		System.out.println("1.메인으로 2.추가입력");
		System.out.print("입력 > ");
		int sel = sc.nextInt();
		switch(sel) {
		case 1:
			break;
		case 2:
			addEmp(emp);
		}

	}


	public void output(Employee[] emp) {
		for(int i=0;i<100;i++) {
			if(emp[i].getName()==null)break;
			System.out.println("번호 : "+emp[i].getIndex() +"\t이름 : "+emp[i].getName()+"\t입사일 : "+
			emp[i].enterDate+"\t직책 : "+emp[i].position +"\t직무 : "+emp[i].duty+"\t시간 당 급여 : "+emp[i].pay);
		}

	}
}
