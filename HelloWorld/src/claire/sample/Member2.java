package claire.sample;

public class Member2 {
	private String userId;
	private String passwd;
	private String name;
	private String email;
	private String addr;

	public Member2() {
	}

	public Member2(String userId, String passwd, String name, String email, String addr) {
		super();
		this.userId = userId;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.addr = addr;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
