package project;

public class Id {
	String id;
	String pwd;
	boolean isAdmin = false;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	Id(String id, String pwd, boolean isAdmin){
		this.id = id;
		this.pwd = pwd;
		this.isAdmin = isAdmin;
	}
	Id(){
		
	}
}
