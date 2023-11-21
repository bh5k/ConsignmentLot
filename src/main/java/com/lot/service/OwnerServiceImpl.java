package com.lot.service;

import com.lot.model.Owner;
import com.lot.repository.OwnerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private OwnerRepository ownerRepository;

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

}
