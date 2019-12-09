package poor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import poor.repository.UserRepository;
import poor.model.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Qualifier("userRepository")
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public boolean saveUser(User user) {

		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.saveAndFlush(user);
		return true;
	}

	@Override
	public User findUserByEmail(String email) {

		return userRepository.findUserByEmail(email);
	}

}
