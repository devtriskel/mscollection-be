
/*
 * **********************************************************************
 * 2019 - DEVTRISKEL
 * Music Collection API
 * **********************************************************************
 */
package com.mg.mscollection.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mg.mscollection.dao.ArtistDAO;
import com.mg.mscollection.entity.Artist;

@RestController
@RequestMapping("/api")
public class ArtistRestController {
  
  private ArtistDAO artistDAO;
  
  @Autowired
  public ArtistRestController(ArtistDAO artistDAO) {
    this.artistDAO = artistDAO;
  }

  @GetMapping("/artists")
  public List<Artist> findAll() {
    return artistDAO.findAll();
  }

}
