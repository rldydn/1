package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminMode{
	Scanner sc = new Scanner(System.in);
	Employee[] emp=null;
	AdminMode(Employee[] emp){
		this.emp=emp;
		System.out.println();
		System.out.println("[관리자 모드]\n");
		System.out.println("1.직원계정등록");
		System.out.println("2.근태정보조회");
		System.out.println("3.급여정보조회");
		System.out.println("4.요청관리");
		System.out.println("5.인사관리");
		System.out.println("6.로그아웃");
		System.out.print("입력 > ");
		int sel = sc.nextInt();

		switch(sel) {
		case 1:
			addEmp(emp);
			break;
		case 2:
			output(emp);
			afterOutput();
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			new Main(false);
			break;
		default:
		}
	}


	public void addEmp(Employee[] emp) {
		System.out.println();
		int i =0;
		
		do {
			try {
			if(emp[i].name == null) {
				boolean idCheck = false;
				String id = "";
				while(!idCheck) {
					boolean idCheck2 = false;
					System.out.println("아이디 입력");
					id = sc.next();
					for(int j=0;j<emp.length;j++) {
						if(id.equals(emp[j].getId()) || id.equals("admin")) {
							System.out.println("동일한 id가 이미 존재합니다. 다시 입력해주세요.");
							idCheck2=true;break;
						}
					}
					if(!idCheck2) {
						idCheck=true;
					}
				}
				
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
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력값이 있습니다. 확인 후 다시 입력해주세요");
				emp[i].setName(null);
				emp[i].setId(null);
				sc.next();
			}
		} while (emp[i].name == null);
		
		afterAdd();
	}
	
	void afterAdd() {
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
		System.out.println();
		int count=0;
		for(int i=0;i<100;i++) {
			if(emp[i].getName()==null) {continue;}
			System.out.println("번호 : "+emp[i].getIndex() +"\t이름 : "+emp[i].getName()+
					"\tID : "+emp[i].id+"\tPASSWORD : "+emp[i].pwd+"\t입사일 : "+
					emp[i].enterDate+"\t직책 : "+emp[i].position +"\t직무 : "+emp[i].duty+"\t시간 당 급여 : "+emp[i].pay);
			count++;
		}
		if(count==0) {
			System.out.println("등록된 내용이 없습니다.");
		}
		
	}
	
	private void afterOutput() {
		System.out.println("1.메인으로 2.수정 3.삭제");
		System.out.print("입력 > ");
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1:
			break;
		case 2:
			fix();
			break;
		case 3:
			delete();
			break;
		default:
		}
	}


	private void delete() {
		boolean chk=false;
		System.out.println("-----------");
		System.out.println("직원 명단입니다.");
		output(emp);
		System.out.println("-----------");
		System.out.println("삭제할 직원의 id를 입력해주세요");
		String delId = sc.next();
		for(int i=0;i<emp.length;i++) {
			if(delId.equals(emp[i].id)) {
				chk=true;
				emp[i] = new Employee();
				System.out.println("삭제되었습니다.");
			}
		}
		if(!chk) {
			System.out.println("존재하지 않는 id입니다.");
			System.out.println("1.메인으로 2.재입력");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				break;
			case 2:
				delete();
				break;
			default:
			}
		}
	}


	private void fix() {
		boolean chk=false;
		System.out.println("-----------");		
		System.out.println("직원 명단입니다.");
		output(emp);
		System.out.println("-----------");
		System.out.println("수정할 직원의 id를 입력해주세요");
		String fixId = sc.next();
		for(int i=0;i<emp.length;i++) {
			if(fixId.equals(emp[i].id)) {
				chk=true;
				System.out.println("수정할 항목은 무엇입니까?");
				System.out.println("1.이름 2.번호 3.입사일 4.직책 5.직무 6.급여 7.id 8.password");
				int sel = sc.nextInt();
				switch(sel) {
				case 1:
					System.out.println("수정할 이름을 입력해주세요");
					String fixName = sc.next();
					emp[i].name = fixName;
					break;
				case 2:
					System.out.println("수정할 번호를 입력해주세요");
					int fixIndex = sc.nextInt();
					emp[i].index = fixIndex;
					break;
				case 3:
					System.out.println("수정할 입사일을 입력해주세요");
					String fixDate = sc.next();
					emp[i].enterDate = fixDate;
					break;
				case 4:
					System.out.println("수정할 직책을 입력해주세요");
					String fixPos = sc.next();
					emp[i].position = fixPos;
					break;
				case 5:
					System.out.println("수정할 직무를 입력해주세요");
					String fixDuty = sc.next();
					emp[i].duty = fixDuty;
					break;
				case 6:
					System.out.println("수정할 급여를 입력해주세요");
					int fixPay = sc.nextInt();
					emp[i].pay = fixPay;
					break;
				case 7:
					System.out.println("수정할 id를 입력해주세요");
					fixId = sc.next();
					emp[i].id = fixId;
					break;
				case 8:
					System.out.println("수정할 비밀번호를 입력해주세요");
					String fixPwd = sc.next();
					emp[i].pwd = fixPwd;
					break; 
				default:
				}
			}
		}
		if(!chk) {
			System.out.println("존재하지 않는 id입니다.");
			System.out.println("1.메인으로 2.재입력");
			int sel = sc.nextInt();
			switch(sel) {
			case 1:
				break;
			case 2:
				fix();
				break;
			default:
			}
		}
	}
}
