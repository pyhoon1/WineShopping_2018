package user.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import user.dao.UserDao;
import user.mail.MailHandler;
import user.mail.TempKey;
import user.vo.User;

@Service("userService")
public class UserServiceImplJDBC implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private JavaMailSender mailSender;

	 
	public User loginUser(User user) {

		return userDao.loginUser(user);
	}

	 
	public void inserUser(User user) throws Exception {
		userDao.insertUser(user);
		String key = new TempKey().getKey(50, false); // 인증키 생성
		userDao.createAuthKey(user, key); // 인증키 DB저장
		MailHandler sendMail = new MailHandler(mailSender);
		sendMail.setSubject("[ALMOM 서비스 이메일 인증]");
		sendMail.setText(new StringBuffer().append("<h1>메일인증</h1>")
				.append("<a href='http://localhost:8080/WineProject/emailConfirm.do?email=").append(user.getEmail())
				.append("' target='_blank'>이메일 인증 확인</a>").toString());
		sendMail.setFrom("rldh111122223333@gmail.com", "권기오");
		sendMail.setTo(user.getEmail());
		sendMail.send();
	}

	 
	public void updateUser(User user) {
		userDao.updateUser(user);

	}

	 
	public void RatingUpdate(User user) {
		userDao.RatingUpdate(user);
	}

	 
	public void totalAmountUpdate(User user) {
		userDao.totalAmountUpdate(user);

	}

	 
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}

	 
	public User selectByEmail(String email) {
		User user = userDao.selectByEmail(email);
		return user;
	}

	 
	public User selectByLoginId(String loginId) {
		User user = userDao.selectByLoginId(loginId);
		return user;
	}

	 
	public User selectByUserId(int userId) {
		User user = userDao.selectByUserId(userId);
		return user;
	}

	 
	public User userLoginIdFind(User user) {
		return userDao.userLoginIdFind(user);

	}

	 
	public User userPasswordFind(User user) {

		return userDao.userPasswordFind(user);
	}

	 
	public void userStateUpdate(String email) {
		userDao.userStateUpdate(email);

	}

	 
	public void sendLoginId(User user) throws Exception {
		MailHandler sendMail = new MailHandler(mailSender);
		sendMail.setSubject("[ALMOM 서비스 이메일 인증]");
		sendMail.setText(new StringBuffer().append("<h1>아이디입니다</h1>").append(user.getLoginId()).toString());

		sendMail.setFrom("rldh111122223333@gmail.com", "권기오");
		sendMail.setTo(user.getEmail());
		sendMail.send();
	}

	 
	public void sendPassword(User user) throws Exception {
		String password = "";
		Random rnd = new Random();
		for (int i = 0; i < 6; i++) {
			int rIndex = rnd.nextInt(2);
			switch (rIndex) {

			case 0:
				// A-Z
				password += ((char) ((rnd.nextInt(26)) + 65));
				break;
			case 1:
				// 0-9 
				password += ((rnd.nextInt(10)));
				break;
			}
		}
		user.setPassword(password);
		userDao.updateUser(user);
		MailHandler sendMail = new MailHandler(mailSender);
		sendMail.setSubject("[ALMOM 서비스 이메일 인증]");
		sendMail.setText(new StringBuffer().append("<h1>임시 비밀번호 입니다</h1>").append(password).toString());
		sendMail.setFrom("rldh111122223333@gmail.com", "권기오");
		sendMail.setTo(user.getEmail());
		sendMail.send();
	}

}
