package Integration_layer.Repository.SpringDataJPA;

import org.springframework.data.repository.Repository;

import Integration_layer.Entitys.User;
import Integration_layer.Repository.UserRepository;

public interface SpringDataUserReposity extends UserRepository, Repository<User, Long> {

}
