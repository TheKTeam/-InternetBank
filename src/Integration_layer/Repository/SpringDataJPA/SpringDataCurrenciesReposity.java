package Integration_layer.Repository.SpringDataJPA;

import org.springframework.data.repository.Repository;

import Integration_layer.Entitys.Currencies;
import Integration_layer.Repository.CurrenciesRepository;

public interface SpringDataCurrenciesReposity extends CurrenciesRepository, Repository<Currencies, Long> {

}
