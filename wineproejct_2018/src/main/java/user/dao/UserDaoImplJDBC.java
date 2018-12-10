package user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import user.vo.User;

@Repository("userDao")
public class UserDaoImplJDBC implements UserDao {

	@Autowired
	private UserMapper userMapper;

	 

	public User selectByLoginId(String loginId) {
		return userMapper.selectByLoginId(loginId);
	}
 
	 
	public User userPasswordFind(User user) {
		return userMapper.userPasswordFind(user);
	}

	 
	public User selectByUserId(int userId) {
		return userMapper.selectByUserId(userId);
	}

	 
	public User selectByEmail(String email) {
		return userMapper.selectByEmail(email);
	}

	 
	public void deleteUser(int userId) {
		userMapper.deleteUser(userId);
	}

	 
	public User loginUser(User user) {
		return userMapper.loginUser(user);
	}

	 
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	 
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	 
	public User userLoginIdFind(User user) {
		return userMapper.userLoginIdFind(user);
	}

	 
	public void createAuthKey(User user, String emailAuthCode) {
		// TODO Auto-generated method stub
		user.setEmailAuthCode(emailAuthCode);
		userMapper.createAuthKey(user);

	}

	 
	public void userStateUpdate(String email) {
		userMapper.userStateUpdate(email);
	}

	public void insert(User user) {
		userMapper.insertUser(user);
 
	}

	 
	public void RatingUpdate(User user) {
		userMapper.RatingUpdate(user);

	}

	 
	public void totalAmountUpdate(User user) {
		userMapper.totalAmountUpdate(user);

	}

}
