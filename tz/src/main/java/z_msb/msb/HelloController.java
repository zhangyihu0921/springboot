package z_msb.msb;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import z_msb.entity.User;

@RestController
public class HelloController {
	@RequestMapping(value="/hello")
	public String hello() {
		return "Hello zy8889==12312";
	}
	
	@RequestMapping(value="/hello2")
	public String hello2() {
		return "Hello zyh 16-010-222";
	}

	@RequestMapping("getUser")
	public User getUser() {
		User user = new User();
		user.setId(1);
		user.setName("lisi");
		user.setBirthday(new Date());
		user.setRemark("12312312");
		return user;
	}
}
