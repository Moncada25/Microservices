package com.tcs.training.spring.model;

import static com.tcs.training.spring.Constants.CLIENT_COLUMN_DATE_OF_BIRTH;
import static com.tcs.training.spring.Constants.CLIENT_COLUMN_DOCUMENT;
import static com.tcs.training.spring.Constants.CLIENT_COLUMN_EMAIL;
import static com.tcs.training.spring.Constants.CLIENT_COLUMN_LASTNAME;
import static com.tcs.training.spring.Constants.CLIENT_COLUMN_NAME;
import static com.tcs.training.spring.Constants.CLIENT_TABLE_NAME;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = CLIENT_TABLE_NAME)
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = CLIENT_COLUMN_NAME)
  private String name;

  @Column(name = CLIENT_COLUMN_LASTNAME)
  private String lastName;

  @Column(name = CLIENT_COLUMN_EMAIL)
  private String email;

  @Column(name = CLIENT_COLUMN_DOCUMENT)
  private Long document;

  @Column(name = CLIENT_COLUMN_DATE_OF_BIRTH)
  private Date dateOfBirth;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getDocument() {
    return document;
  }

  public void setDocument(Long document) {
    this.document = document;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}
