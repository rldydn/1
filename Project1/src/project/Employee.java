package project;

public class Employee extends Id{
	String name;	//�̸�
	int index=0;	//��ȣ
	String enterDate;	//�Ի���
	String position;	//��å
	String duty;	//����
	int pay;	//�޿�
	int workDay; //�ٹ��ϼ�
	int lateDay; //�����ϼ�
	int absentDay;	//����ϼ�
	
	
	public String getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(String enterDate) {
		this.enterDate = enterDate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getWorkDay() {
		return workDay;
	}
	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}
	public int getLateDay() {
		return lateDay;
	}
	public void setLateDay(int lateDay) {
		this.lateDay = lateDay;
	}
	public int getAbsentDay() {
		return absentDay;
	}
	public void setAbsentDay(int absentDay) {
		this.absentDay = absentDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	Employee(String name, int index){
		this.name = name;
		this.index = index;
	}
	Employee(){
		
	}
}
