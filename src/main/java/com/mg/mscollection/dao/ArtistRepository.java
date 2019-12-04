
/*
 * **********************************************************************
 * 2019 - DEVTRISKEL
 * Music Collection API
 * **********************************************************************
 */
package com.mg.mscollection.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mg.mscollection.entity.Artist;

@CrossOrigin
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
