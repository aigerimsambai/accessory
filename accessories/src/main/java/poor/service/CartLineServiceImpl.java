package poor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poor.repository.CartLineRepository;
import poor.model.Cart;
import poor.model.CartLine;

@Service("cartLineService")
public class CartLineServiceImpl implements CartLineService {

	@Autowired
	private CartService cartService;

	@Autowired
	private CartLineRepository cartLineRepository;

	@Override
	public CartLine findCartLineById(int id) {

		return cartLineRepository.findOne(id);
	}

	@Override
	public boolean saveCartLine(CartLine cartLine) {

		 cartLineRepository.saveAndFlush(cartLine);
		 return true;
	}

	@Override
	public boolean updateCartLine(CartLine cartLine) {

		cartLineRepository.saveAndFlush(cartLine);
		return true;
	}

	@Override
	public boolean deleteCartLine(CartLine cartLine) {

		cartLineRepository.delete(cartLine);
		return false;
	}

	@Override
	public List<CartLine> findAllCartLine(int cartId) {

		return cartLineRepository.findAll();
	}

	@Override
	public List<CartLine> findCartLines() {
		Cart cart = cartService.findCart();
		return cartLineRepository.findCartLineByCartId(cart.getId());
	}

	@Override
	public CartLine findCartLineByCartIdAndProductId(int cartId, int id) {

		return cartLineRepository.findCartLineByCartIdAndProductId(cartId, id);
	}

}
