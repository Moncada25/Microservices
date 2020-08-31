package com.tcs.training.spring.repository;

import static com.tcs.training.spring.Constants.CLIENT_TABLE_NAME;

import com.tcs.training.spring.model.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

  //@Query(value = "SELECT * FROM " + CLIENT_TABLE_NAME + " WHERE lastName = ?1", nativeQuery = true)
  @Query("SELECT c FROM " + CLIENT_TABLE_NAME + " c WHERE c.lastName = ?1")
  Client searchClientByLastName(String lastName);
}
