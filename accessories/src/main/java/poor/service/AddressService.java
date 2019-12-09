package poor.service;

import poor.model.Address;

public interface AddressService {

	boolean saveAddress(Address address);
	Address findAddressByBilling(boolean billing);

}
