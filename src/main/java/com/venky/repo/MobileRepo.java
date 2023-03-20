package com.venky.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.venky.model.Mobile;
@Repository
public interface MobileRepo extends CrudRepository<Mobile, Integer> {

}
