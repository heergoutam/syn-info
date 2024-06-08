package com.synpulse.synformation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synpulse.synformation.entity.Address;
import com.synpulse.synformation.repository.AddressRepository;

@Service
public class AddressService{
	
	@Autowired
	private AddressRepository addressRepository;
	List<String> combinedAddress = new ArrayList<String>();
	
	public Address saveAddress(List<Address> address) {
		return addressRepository.save(address.get(0));
		
	}
	
	public String deleteAddress(Integer id) {
		addressRepository.deleteById(id);
		return "Address removed for :"+ id;
	}
@SuppressWarnings("null")
public List<String>  getEmployeeAddress(String empId) {
	Address address =addressRepository.findByEmpId(empId);
	combinedAddress.add(address.getAddressLine1()+" ");
	combinedAddress.add(address.getAddressLine2()+" ");
	combinedAddress.add(address.getAddressLine3());
	return combinedAddress;
}




}
