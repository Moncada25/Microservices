package com.tcs.training.spring.controller;

import com.tcs.training.spring.model.Client;
import com.tcs.training.spring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

  @Autowired
  private ClientService service;

  @GetMapping(path = "/consultClients")
  public ResponseEntity consultClient() {

    Iterable<Client> clients = service.getClients();

    return new ResponseEntity<>(clients, HttpStatus.OK);
  }

  @GetMapping(path = "/consultClientByLastName/{lastName}")
  public ResponseEntity consultClientByLastName(@PathVariable String lastName) {

    Client client = service.searchClientByLastName(lastName);

    return new ResponseEntity<>(client, HttpStatus.OK);
  }
}
