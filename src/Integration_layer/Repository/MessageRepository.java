package Integration_layer.Repository;

import java.sql.Date;
import java.util.Collection;

import org.springframework.dao.DataAccessException;

import Integration_layer.Entitys.Message;

public interface MessageRepository{
    Collection<Message> findBySender(long id) throws DataAccessException;
    Collection<Message> findByResiver(long id) throws DataAccessException;    
    Collection<Message> findByDataOfCreating(Date dataOfCreating) throws DataAccessException;
    Collection<Message> findByTopic(String topic) throws DataAccessException;
    Message findById(long id) throws DataAccessException;
    void save(Message message) throws DataAccessException;
}
