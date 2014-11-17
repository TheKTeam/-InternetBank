package Integration_layer.Repository;

import java.sql.Date;
import java.util.Collection;

import org.springframework.dao.DataAccessException;

import Enums.TransactionsType;
import Integration_layer.Entitys.Transaction;

public interface TransactionRepository {
    Collection<Transaction> findByUser1(long id) throws DataAccessException;
    Collection<Transaction> findByUSer2(long id) throws DataAccessException;    
    Collection<Transaction> findByData(Date data) throws DataAccessException;
    Collection<Transaction> findByType(TransactionsType type) throws DataAccessException;
    Transaction findById(long id) throws DataAccessException;
    void save(Transaction transaction) throws DataAccessException;
}