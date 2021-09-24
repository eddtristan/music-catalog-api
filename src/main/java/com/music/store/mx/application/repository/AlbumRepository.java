/* 
* This program is free software: you can redistribute it and/or modify  
* it under the terms of the GNU General Public License as published by  
* the Free Software Foundation, version 3.
*
* This program is distributed in the hope that it will be useful, but 
* WITHOUT ANY WARRANTY; without even the implied warranty of 
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
* General Public License for more details.
*
* Nombre de archivo: AlbumRepository.java
* Autor: etristan
* Fecha de creación: 24 sep. 2021
*/

package com.music.store.mx.application.repository;

import com.music.store.mx.model.Album;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The Interface AlbumRepository.
 */
public interface AlbumRepository extends JpaRepository<Album, Long> {

  /**
   * Find all.
   *
   * @return the list
   */
  public List<Album> findAll();

  /**
   * Find by album id.
   *
   * @param albumId the album id
   * @return the album
   */
  public Album findByAlbumId(Long albumId);

}
