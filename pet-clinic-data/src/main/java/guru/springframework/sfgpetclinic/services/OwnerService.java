package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastname);

    Owner  findById(Long id);

    Owner Save(Owner owner);

    Set<Owner> findAll();
}
