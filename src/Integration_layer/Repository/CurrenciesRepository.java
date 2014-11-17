package Integration_layer.Repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

import Integration_layer.Entitys.Currencies;

public interface CurrenciesRepository{
    Collection<Currencies> findByName(String name) throws DataAccessException;
    Currencies findById(long id) throws DataAccessException;
    void save(Currencies currencies) throws DataAccessException;		
}