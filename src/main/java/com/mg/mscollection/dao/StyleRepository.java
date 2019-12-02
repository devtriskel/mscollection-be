
/*
 * **********************************************************************
 * 2019 - DEVTRISKEL
 * Music Collection API
 * **********************************************************************
 */
package com.mg.mscollection.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mg.mscollection.entity.Style;

public interface StyleRepository extends JpaRepository<Style, Long> {

}
