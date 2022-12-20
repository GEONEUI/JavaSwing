package BusApp;


public class Users {
	private String name;
	private String birth;
	private String userid;
	private String password;
	
	public Users() {
		
	}
	
	public Users(String name, String birth, String userid, String password) {
		this.name = name;
		this.birth = birth;
		this.userid = userid;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
