package Integration_layer.Repository.SpringDataJPA;

import org.springframework.data.repository.Repository;

import Integration_layer.Entitys.Account;
import Integration_layer.Repository.AccountRepository;

public interface SpringDataAccountRepository extends AccountRepository, Repository<Account, Long> {

}