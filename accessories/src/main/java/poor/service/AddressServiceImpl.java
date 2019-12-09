package poor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import poor.repository.AddressRepository;
import poor.model.Address;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

	@Qualifier("addressRepository")
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public boolean saveAddress(Address address) {

		addressRepository.saveAndFlush(address);
		return true;
	}

	@Override
	public Address findAddressByBilling(boolean billing) {

		return addressRepository.findAddressByBilling(billing);
	}

}
