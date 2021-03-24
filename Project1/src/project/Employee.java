package project;

public class Employee extends Id{
	String name;	//이름
	int index=0;	//번호
	String enterDate;	//입사일
	String position;	//직책
	String duty;	//직무
	int pay;	//급여
	int workDay; //근무일수
	int lateDay; //지각일수
	int absentDay;	//결근일수
	WorkingDays workingDays = new WorkingDays();
	
	
	public WorkingDays getWorkingDays() {
		return workingDays;
	}
	public void setWorkingDays(WorkingDays workingDays) {
		this.workingDays = workingDays;
	}
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
