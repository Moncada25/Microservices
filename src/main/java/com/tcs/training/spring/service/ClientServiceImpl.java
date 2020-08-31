package com.tcs.training.spring.service;

import com.tcs.training.spring.model.Client;
import com.tcs.training.spring.repository.ClientRepository;
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
}
