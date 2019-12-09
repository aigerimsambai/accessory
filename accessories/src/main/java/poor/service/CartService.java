package poor.service;

import poor.model.Cart;

public interface CartService {
	
	boolean saveCart(Cart cart);
	boolean updateCart(Cart cart);
	
	Cart findCart();

}
