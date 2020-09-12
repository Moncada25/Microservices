package com.tcs.training.spring.services;

import com.tcs.training.spring.models.Client;
import com.tcs.training.spring.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

  @Autowired
  private ClientRepository repository;

  @Override
  public Iterable<Client> getClients() {
    return repository.findAll();
  }

  @Override
  public Client searchClientByLastName(String lastName) {
    return repository.searchClientByLastName(lastName);
  }

  @Override
  public Client createClient(Client client) {
    return repository.save(client);
  }
}
