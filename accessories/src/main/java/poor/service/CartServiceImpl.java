package poor.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import poor.repository.CartRepository;
import poor.model.Cart;
import poor.model.UserModel;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Qualifier("cartRepository")
	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private HttpSession httpSession;

	@Override
	public boolean saveCart(Cart cart) {

		cartRepository.saveAndFlush(cart);
		return true;
	}

	@Override
	public boolean updateCart(Cart cart) {

		cartRepository.saveAndFlush(cart);
		return true;
	}

	@Override
	public Cart findCart() {

		return ((UserModel) httpSession.getAttribute("userModel")).getCart();
	}

}
