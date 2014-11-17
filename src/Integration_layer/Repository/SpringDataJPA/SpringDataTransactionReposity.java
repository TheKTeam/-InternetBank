package Integration_layer.Repository.SpringDataJPA;

import org.springframework.data.repository.Repository;

import Integration_layer.Entitys.Transaction;
import Integration_layer.Repository.TransactionRepository;

public interface SpringDataTransactionReposity extends TransactionRepository, Repository<Transaction, Long> {

}