package com.tcs.training.spring.service;

import com.tcs.training.spring.model.Client;

public interface ClientService {

  Iterable<Client> getClients();

  Client searchClientByLastName(String lastName);
}
