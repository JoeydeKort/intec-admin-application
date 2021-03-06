package be.intecbrussel.admin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${business.name:null}", url = "${business.url:}", fallback = CompanyServiceFallback.class)
@Primary
public interface CompanyService {

    @RequestMapping("/companies")
    CollectionModel<Company> findAll();

    @RequestMapping(value = "/companies", method = RequestMethod.POST)
    Company add(@RequestBody Company company);

    @RequestMapping(value = "/companies/{id}", method = RequestMethod.PUT)
    Company update(@PathVariable("id") Long id, @RequestBody Company company);

    @RequestMapping(value = "/companies/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable("id") Long id);

}
