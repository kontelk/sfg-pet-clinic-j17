package com.kt.sfgpetclinicj17.services;

import com.kt.sfgpetclinicj17.model.Vet;

import java.util.Set;

/**
 * Created by kontelk on 8/17/23.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}