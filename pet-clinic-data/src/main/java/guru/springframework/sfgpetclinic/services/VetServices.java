package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetServices {

    Vet findById(Long id);

    Vet Save(Vet vet);

    Set<Vet> findAll();
}
