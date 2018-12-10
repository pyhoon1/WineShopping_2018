package user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import user.service.UserService;
import user.vo.User;

@Controller
public class UserConroller {

	@Autowired
	private UserService userService;

	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "loginForm";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginUser(HttpServletRequest req, Model model, @RequestParam("loginId") String loginId,
			@RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		model.addAttribute("errors", errors);
		User user = userService.selectByLoginId(loginId);
		if (user == null) {
			errors.put("noLoginId", true);
			return "loginForm";
		}
		User user1 = userService.loginUser(new User(loginId, password));
		if (user1 == null) {
			errors.put("wrongPassword", true);
			return "loginForm";
		}
		if (user.getUserState() == false) {
			errors.put("noConfirm", true);
			return "loginForm";
		}
		if (!errors.isEmpty()) {
			return "loginForm";
		}
		req.getSession().setAttribute("user", user);
		return "main";
	}

	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "joinForm";
	}

	@RequestMapping("/main.do")
	public String main() {
		return "main";
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String insertUser(Model model, @RequestParam("loginId") String loginId,
			@RequestParam("password") String password, @RequestParam("userName") String userName,
			@RequestParam("email") String email, @RequestParam("address") String address,
			@RequestParam("phone") String phone, @RequestParam("birth") String birth) throws Exception {

		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		model.addAttribute("errors", errors);
		User user = userService.selectByLoginId(loginId);
		if (user != null) {
			errors.put("duplicateLoginId", true);
			return "joinForm";
		}
		user = userService.selectByEmail(email);
		if (user != null) {
			errors.put("duplicateEmail", true);

			return "joinForm";
		}
		if (!errors.isEmpty()) {
			return "joinForm";
		}
		userService.inserUser(new User(loginId, password, userName, email, address, phone, birth));
		return "redirect:/main.do";
	}

	@RequestMapping(value = "/updateForm.do", method = RequestMethod.POST)
	public String updateForm() {
		return "updateForm";
	}

	@RequestMapping(value = "/updateUser.do", method = RequestMethod.POST)
	public void updateUser(@RequestParam("userId") int userId, @RequestParam("password") String password,
			@RequestParam("address") String address) {
		userService.updateUser(new User(userId, password, address));

	}

	@RequestMapping(value = "/RatingUpdate.do", method = RequestMethod.POST)
	public void RatingUpdate(@RequestParam("userId") int userId, @RequestParam("rating") String rating) {
		userService.RatingUpdate(new User(userId, rating));
	}

	@RequestMapping(value = "/totalAmountUpdate.do", method = RequestMethod.POST)
	public void totalAmountUpdate(@RequestParam("userId") int userId, @RequestParam("totalAmount") int totalAmount) {
		userService.totalAmountUpdate(new User(userId, totalAmount));
	}

	// 회원 탈퇴 수정해야됨!!!!!
	@RequestMapping(value = "/deleteUser.do", method = RequestMethod.POST)
	public String deleteUser(int userId) {
		userService.deleteUser(userId);
		return "redirect:main";
		// 탈퇴하면 어디론가 감
	}

	@RequestMapping("/myPage.do")
	public User selectByUserId(@RequestParam("userId") int userId) {
		User user = userService.selectByUserId(userId);
		return user;

	}

	@RequestMapping("/userLoginIdFindForm.do")
	public String userLoginIdFindForm() {
		return "userLoginIdFindForm";
	}

	@RequestMapping("/userLoginIdFind.do")
	public String userLoginIdFind(Model model, @RequestParam("userName") String name,
			@RequestParam("email") String email) throws Exception {
		User user = new User();
		user.setUserName(name);
		user.setEmail(email);
		User user1 = userService.userLoginIdFind(user);
		User user2 = userService.selectByEmail(email);
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		model.addAttribute("errors", errors);
		if (user1 == null) {
			errors.put("noUserInformation", true);
			return "userLoginIdFindForm";
		}
		if (user2 == null) {
			errors.put("noEmail", true);
			return "userLoginIdFindForm";
		}
		if (!errors.isEmpty()) {
			return "userLoginIdFindForm";
		}
		userService.sendLoginId(user1);
		return "loginForm";

	}

	@RequestMapping("/userPasswordFindForm.do")
	public String userPasswordFindForm() {

		return "userPasswordFindForm";
	}

	@RequestMapping("userPasswordFind.do")
	public String userPasswordFind(Model model, @RequestParam("loginId") String loginId,
			@RequestParam("userName") String name, @RequestParam("email") String email) throws Exception {

		User user = userService.userPasswordFind(new User(loginId, name, email));
		User user1 = userService.selectByEmail(email);
		Map<String, Boolean> errors = new HashMap<String, Boolean>();
		model.addAttribute("errors", errors);

		if (user1 == null) {
			errors.put("noEmail", true);
			return "userPasswordFindForm";
		}
		if (user == null) {
			errors.put("noUserInformation", true);
			return "userPasswordFindForm";
		}
		if (!errors.isEmpty()) {
			return "userPasswordFindForm";
		}
		userService.sendPassword(user);
		return "loginForm";

	}

	@RequestMapping(value = "/emailConfirm.do", method = RequestMethod.GET)
	public String emailConfirm(Model model, @RequestParam("email") String email) throws Exception { // 이메일인증
		userService.userStateUpdate(email);
		model.addAttribute("userEmail", email);

		return "emailConfirm";
	}

}
