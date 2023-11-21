package com.lot.repository;

import com.lot.model.Owner;
import com.lot.service.OwnerService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
