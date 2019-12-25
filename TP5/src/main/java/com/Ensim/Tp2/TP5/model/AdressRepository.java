package com.Ensim.Tp2.TP5.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdressRepository extends CrudRepository<Adress, Long>{

}
