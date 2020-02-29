package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastname);
}
