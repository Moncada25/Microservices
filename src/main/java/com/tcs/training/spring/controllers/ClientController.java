package com.tcs.training.spring.controllers;

import com.tcs.training.spring.models.Client;
import com.tcs.training.spring.services.ClientService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @PostMapping(path = "/createClient")
  public ResponseEntity createClient(@Valid @RequestBody Client client) {

    client = service.createClient(client);

    return new ResponseEntity<>(client, HttpStatus.OK);
  }
}
