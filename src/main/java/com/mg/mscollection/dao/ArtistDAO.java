
/*
 * **********************************************************************
 * 2019 - DEVTRISKEL
 * Music Collection API
 * **********************************************************************
 */
package com.mg.mscollection.dao;

import java.util.List;

import com.mg.mscollection.entity.Artist;

public interface ArtistDAO {

  public List<Artist> findAll();
  
}
