package poor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poor.model.Cart;

@Repository("cartRepository")
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
