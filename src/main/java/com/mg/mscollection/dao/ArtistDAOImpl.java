
/*
 * **********************************************************************
 * 2019 - DEVTRISKEL
 * Music Collection API
 * **********************************************************************
 */
package com.mg.mscollection.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mg.mscollection.entity.Artist;

@Repository
public class ArtistDAOImpl implements ArtistDAO {

  private EntityManager entityManager;
  
  @Autowired
  public ArtistDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }
  
  @Override
  @Transactional
  public List<Artist> findAll() {
    Session session = entityManager.unwrap(Session.class);
    
    Query<Artist> query = session.createQuery("from Artist", Artist.class);
    
    return query.getResultList();
  }

}
