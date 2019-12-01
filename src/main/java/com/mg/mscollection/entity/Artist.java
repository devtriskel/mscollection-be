
/*
 * **********************************************************************
 * 2019 - DEVTRISKEL
 * Music Collection API
 * **********************************************************************
 */
package com.mg.mscollection.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="artists")
public class Artist {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id")
  private Long id;
  
  @Column(name="name")
  private String name;
  
  @Column(name="year")
  private Integer year;
  
  // Public constructors
  public Artist() {
  
  }
  
  public Artist(String name, Integer year) {
    this.name = name;
    this.year = year;
  }

  // Getters, Setters & ToString
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

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "Artist [id=" + id + ", name=" + name + ", year=" + year + "]";
  }  
  
}
