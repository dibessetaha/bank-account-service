package org.sid.bankaccountservice.repositories;

import org.sid.bankaccountservice.enteties.BankAccount;
import org.sid.bankaccountservice.enteties.Customer;
import org.sid.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
