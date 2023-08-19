package com.kt.sfgpetclinicj17.services.map;

import com.kt.sfgpetclinicj17.model.Owner;
import com.kt.sfgpetclinicj17.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by kontelk on 8/18/23.
 */
@Service
public class OwnerServiceMap
        extends AbstractMapService<Owner, Long>
        implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}