package com.tcs.training.spring.services;

import com.tcs.training.spring.models.Client;

public interface ClientService {

  Iterable<Client> getClients();

  Client searchClientByLastName(String lastName);

  Client createClient(Client client);
}
