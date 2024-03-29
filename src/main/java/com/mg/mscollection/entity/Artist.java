
/*
 * **********************************************************************
 * 2019 - DEVTRISKEL
 * Music Collection API
 * **********************************************************************
 */
package com.mg.mscollection.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artists")
public class Artist {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "year")
  private Integer year;
  
  @OneToMany(
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
      fetch = FetchType.LAZY,
      mappedBy = "artist")
  private Set<People> members = new HashSet<>();
  
  @ManyToMany(
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
      fetch = FetchType.LAZY)
  @JoinTable(
      name = "artists_styles",
      joinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "style_id", referencedColumnName = "id"))
  private Set<Style> styles = new HashSet<>();  
  
  @ManyToMany(
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
      fetch = FetchType.LAZY)
  @JoinTable(
      name = "related_artists", 
      joinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"), 
      inverseJoinColumns = @JoinColumn(name = "related_artist_id", referencedColumnName = "id"))
  private Set<Artist> relatedToArtists = new HashSet<>();
  
  @ManyToMany(
      cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
      fetch = FetchType.LAZY)
  @JoinTable(
      name = "related_artists",
      joinColumns = @JoinColumn(name = "related_artist_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"))
  private Set<Artist> relatedFromArtists = new HashSet<>();
  
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

  public Set<People> getMembers() {
    return members;
  }

  public void setMembers(Set<People> members) {
    this.members = members;
  }

  public Set<Style> getStyles() {
    return styles;
  }

  public void setStyles(Set<Style> styles) {
    this.styles = styles;
  }

  public Set<Artist> getRelatedToArtists() {
    return relatedToArtists;
  }

  public void setRelatedToArtists(Set<Artist> relatedToArtists) {
    this.relatedToArtists = relatedToArtists;
  }

  public Set<Artist> getRelatedFromArtists() {
    return relatedFromArtists;
  }

  public void setRelatedFromArtists(Set<Artist> relatedFromArtists) {
    this.relatedFromArtists = relatedFromArtists;
  }

  @Override
  public String toString() {
    return "Artist [id=" + id + ", name=" + name + ", year=" + year + ", members=" + members + ", styles=" + styles
        + ", relatedToArtists=" + relatedToArtists + ", relatedFromArtists=" + relatedFromArtists + "]";
  }

}
