package project;

import java.util.Scanner;

public class AdminMode{
	Scanner sc = new Scanner(System.in);
	AdminMode(Employee[] emp){
		System.out.println("1.�����������");
		System.out.println("2.����������ȸ");
		System.out.println("3.�޿�������ȸ");
		System.out.println("4.��û����");
		System.out.println("5.�λ����");
		System.out.print("�Է� > ");
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
				System.out.println("���̵� �Է�");
				String id = sc.next();
				System.out.println("��й�ȣ �Է�");
				String pwd = sc.next();
				System.out.println("�����̸� �Է�");
				String name = sc.next();
				System.out.println("�Ի��� �Է�");
				String date = sc.next();
				System.out.println("��å �Է�");
				String position = sc.next();
				System.out.println("���� �Է�");
				String duty = sc.next();
				System.out.println("�ð� �� �޿� �Է�");
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
		System.out.println("1.�������� 2.�߰��Է�");
		System.out.print("�Է� > ");
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
			System.out.println("��ȣ : "+emp[i].getIndex() +"\t�̸� : "+emp[i].getName()+"\t�Ի��� : "+
			emp[i].enterDate+"\t��å : "+emp[i].position +"\t���� : "+emp[i].duty+"\t�ð� �� �޿� : "+emp[i].pay);
		}

	}
}
