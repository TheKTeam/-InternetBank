package Integration_layer.Repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import Enums.AccountType;
import Integration_layer.Entitys.Account;

public interface AccountRepository {	
    Collection<Account> findByUser(long id) throws DataAccessException;
    Collection<Account> findByType(AccountType type) throws DataAccessException;    
    Account findById(long id) throws DataAccessException;
    void save(Account account) throws DataAccessException;	
}