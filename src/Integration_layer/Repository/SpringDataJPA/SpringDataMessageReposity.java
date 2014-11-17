package Integration_layer.Repository.SpringDataJPA;

import org.springframework.data.repository.Repository;

import Integration_layer.Entitys.Message;
import Integration_layer.Repository.MessageRepository;

public interface SpringDataMessageReposity extends MessageRepository, Repository<Message, Long> {
	
}