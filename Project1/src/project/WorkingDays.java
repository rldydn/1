package project;

public class WorkingDays {
	String date;	//날짜
	String startTime; //출근시간
	String endTime;	//퇴근시간
	boolean isLate;	//지각여부
	boolean isAbsent;	//결근여부
	boolean isVacation;	//휴가여부
	boolean isAppli;	//휴가신청여부
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public boolean isLate() {
		return isLate;
	}
	public void setLate(boolean isLate) {
		this.isLate = isLate;
	}
	public boolean isAbsent() {
		return isAbsent;
	}
	public void setAbsent(boolean isAbsent) {
		this.isAbsent = isAbsent;
	}
	public boolean isVacation() {
		return isVacation;
	}
	public void setVacation(boolean isVacation) {
		this.isVacation = isVacation;
	}
	public boolean isAppli() {
		return isAppli;
	}
	public void setAppli(boolean isAppli) {
		this.isAppli = isAppli;
	}
	
	
}
