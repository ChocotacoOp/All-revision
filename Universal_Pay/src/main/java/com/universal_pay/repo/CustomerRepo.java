package com.universal_pay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.universal_pay.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,String> {

	public Customer findBymobileNumber(String mobileNumber);
	
	

//	@Query("from Customer where wallet = from Wallet where walletId = ?1")
//	public Customer getByWallet(Integer walletId);

	
}
