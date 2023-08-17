package com.kt.sfgpetclinicj17.services;

import com.kt.sfgpetclinicj17.model.Pet;

import java.util.Set;

/**
 * Created by kontelk on 8/17/23.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
