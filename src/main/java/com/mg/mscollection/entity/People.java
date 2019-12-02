
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
@Table(name="people")
public class People {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="id")
  private Long id;
  
  @Column(name="name")
  private String name;
  
  @Column(name="years")
  private Integer years;
  
  //Public constructors
  public People() {

  }
 
  public People(String name, Integer years) {
    this.name = name;
    this.years = years;
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

  public Integer getYears() {
    return years;
  }

  public void setYears(Integer years) {
    this.years = years;
  }

  @Override
  public String toString() {
    return "People [id=" + id + ", name=" + name + ", years=" + years + "]";
  }

}
