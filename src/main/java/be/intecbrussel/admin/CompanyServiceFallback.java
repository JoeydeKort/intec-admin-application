package be.intecbrussel.admin;

import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceFallback implements CompanyService {

    @Override
    public CollectionModel<Company> findAll() {
        return null;
    }

    @Override
    public Company add(Company company) {
        return null;
    }

    @Override
    public Company update(Long id, Company company) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }

}
