package poor.service;

import poor.model.User;

public interface UserService {

	boolean saveUser(User user);

	User findUserByEmail(String email);

}
