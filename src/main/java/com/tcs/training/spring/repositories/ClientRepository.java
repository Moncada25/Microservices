package com.tcs.training.spring.repositories;

import static com.tcs.training.spring.utils.DatabaseConstants.CLIENT_TABLE_NAME;

import com.tcs.training.spring.models.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

  //@Query(value = "SELECT * FROM " + CLIENT_TABLE_NAME + " WHERE lastName = ?1", nativeQuery = true)
  @Query("SELECT c FROM " + CLIENT_TABLE_NAME + " c WHERE c.lastName = ?1")
  Client searchClientByLastName(String lastName);
}
