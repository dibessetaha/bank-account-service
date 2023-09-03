package org.sid.bankaccountservice.enteties;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {

    public String getId() ;
    public Double getBalance() ;
}
