package services;

import java.util.Set;

import charles.udemy.springpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);

	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
