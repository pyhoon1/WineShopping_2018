package user.dao;

import user.vo.User;

public interface UserDao {
	// 유저를 DB에 추가하는 메소드
 
	// 유저정보를 가져오는 메소드
	public User selectByUserId(int userId);

	public User selectByLoginId(String loginId);

	public User selectByEmail(String email);

	public User userLoginIdFind(User User);

	public User userPasswordFind(User user);
 
	public User loginUser(User user);

	public void insertUser(User user);

	// 유저정보를 삭제하는 메소드
	public void deleteUser(int userId);

	// 유저정보를 수정하는 메소드
	public void updateUser(User user);

	// 유저 등급을 수정하는 메소드
	public void RatingUpdate(User user);

	// 유저가 구매한 상품들의 총액
	public void totalAmountUpdate(User user);

	// 이메일로 아이디를 찾음

	public void userStateUpdate(String email);

	public void createAuthKey(User user, String emailAuthCode);

}
