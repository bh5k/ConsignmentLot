package com.lot.service;

import com.lot.model.Owner;

public interface OwnerService {

    Owner findById(long id);
    Owner save(Owner owner);

}
