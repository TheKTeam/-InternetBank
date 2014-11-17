package Integration_layer.Repository;

import java.sql.Date;
import java.util.Collection;

import org.springframework.dao.DataAccessException;

import Enums.UserType;
import Integration_layer.Entitys.Transaction;

public interface UserRepository{
    Collection<Transaction> findByFirstName(String name) throws DataAccessException;
    Collection<Transaction> findByLastName(String name) throws DataAccessException;
    Collection<Transaction> findBySurname(String name) throws DataAccessException;
    Collection<Transaction> findBySex(boolean sex) throws DataAccessException;
    Collection<Transaction> findByPassword(String password) throws DataAccessException;
    Collection<Transaction> findByRole(UserType role) throws DataAccessException;
    Collection<Transaction> findByEmail(String email) throws DataAccessException;
    Collection<Transaction> findByBirthday(Date birthday) throws DataAccessException;
    Transaction findById(long id) throws DataAccessException;
    void save(Transaction transaction) throws DataAccessException;
}