
/*
 * **********************************************************************
 * 2019 - DEVTRISKEL
 * Music Collection API
 * **********************************************************************
 */
package com.mg.mscollection.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mg.mscollection.entity.People;

@CrossOrigin
@RepositoryRestResource(path="members")
public interface PeopleRepository extends JpaRepository<People, Long> {

}
