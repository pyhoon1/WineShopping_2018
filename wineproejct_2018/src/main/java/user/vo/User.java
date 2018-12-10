package user.vo;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class User {
	private int userId;
	private String loginId;
	private String password;
	private String userName;
	private String email; 
	private String emailAuthCode;
	private String address;
	private String phone;
	private String birth;
	private String rating;
	private int totalAmount;
	private LocalDateTime wdate;
	private Boolean userState;

	public User() {
 
	}

	public User(int userId, String loginId, String password, String userName, String email, String emailAuthCode,
			String address, String phone, String birth, String rating, int totalAmount, LocalDateTime wdate,
			Boolean userState) {

		this.userId = userId;
		this.loginId = loginId;
		this.password = password;
		this.userName = userName;
		this.email = email;
		this.emailAuthCode = emailAuthCode;
		this.address = address;
		this.phone = phone;
		this.birth = birth;
		this.rating = rating;
		this.totalAmount = totalAmount;
		this.wdate = wdate;
		this.userState = userState;
	}

	public User(String loginId, String password, String userName, String email, String address, String phone,
			String birth) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.userName = userName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.birth = birth;
	}

	public User(int userId, String loginId, String password, String userName, String email, String address,
			String phone, String birth) {
		this.loginId = loginId;
		this.password = password;
		this.userName = userName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.birth = birth;
	}

	public User(int userId, int totalAmount) {
		this.userId = userId;
		this.totalAmount = totalAmount;
	}

	public User(int userId, String rating) {
		super();
		this.userId = userId;
		this.rating = rating;
	}

	public User(int userId, String password, String address) {
		this.userId = userId;
		this.password = password;
		this.address = address;
	}

	public User(String loginId, String password) {
		this.loginId = loginId;
		this.password = password;
	}

	public User(String email, Boolean userState) {
		this.email = email;
		this.userState = userState;
	}

	public User(String loginId, String userName, String email) {
		this.loginId = loginId;
		this.userName = userName;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailAuthCode() {
		return emailAuthCode;
	}

	public void setEmailAuthCode(String emailAuthCode) {
		this.emailAuthCode = emailAuthCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDateTime getWdate() {
		return wdate;
	}

	public void setWdate(LocalDateTime wdate) {
		this.wdate = wdate;
	}

	public Boolean getUserState() {
		return userState;
	}

	public void setUserState(Boolean userState) {
		this.userState = userState;
	}

}
