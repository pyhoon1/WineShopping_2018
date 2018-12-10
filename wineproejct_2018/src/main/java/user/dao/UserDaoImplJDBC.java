package user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import user.vo.User;

@Repository("userDao")
public class UserDaoImplJDBC implements UserDao {

	@Autowired
	private UserMapper userMapper;

	@Override

	public User selectByLoginId(String loginId) {
		return userMapper.selectByLoginId(loginId);
	}
 
	@Override
	public User userPasswordFind(User user) {
		return userMapper.userPasswordFind(user);
	}

	@Override
	public User selectByUserId(int userId) {
		return userMapper.selectByUserId(userId);
	}

	@Override
	public User selectByEmail(String email) {
		return userMapper.selectByEmail(email);
	}

	@Override
	public void deleteUser(int userId) {
		userMapper.deleteUser(userId);
	}

	@Override
	public User loginUser(User user) {
		return userMapper.loginUser(user);
	}

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}

	@Override
	public User userLoginIdFind(User user) {
		return userMapper.userLoginIdFind(user);
	}

	@Override
	public void createAuthKey(User user, String emailAuthCode) {
		// TODO Auto-generated method stub
		user.setEmailAuthCode(emailAuthCode);
		userMapper.createAuthKey(user);

	}

	@Override
	public void userStateUpdate(String email) {
		userMapper.userStateUpdate(email);
	}

	public void insert(User user) {
		userMapper.insertUser(user);

	}

	@Override
	public void RatingUpdate(User user) {
		userMapper.RatingUpdate(user);

	}

	@Override
	public void totalAmountUpdate(User user) {
		userMapper.totalAmountUpdate(user);

	}

}
