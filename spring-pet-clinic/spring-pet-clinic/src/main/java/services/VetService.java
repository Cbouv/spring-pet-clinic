package services;

import java.util.Set;

import charles.udemy.springpetclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);
	
	Vet save(Vet owner);
	
	Set<Vet> findAll();
}
