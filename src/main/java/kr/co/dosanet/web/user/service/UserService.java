package kr.co.dosanet.web.user.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.co.dosanet.web.user.vo.User;

@Service
public class UserService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
		
	public List<User> getAllUsers() {
		logger.debug("getAllUsers");
		List list = new ArrayList();
		list.add(new User("1","하하"));
		
		return list;
	}

	public User getUserByUserId(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void modifyUser(String userid, User user) {
		// TODO Auto-generated method stub
		
	}

	public void removeUser(String userid) {
		// TODO Auto-generated method stub
		
	}

}
