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
* Nombre de archivo: SongRepository.java
* Autor: etristan
* Fecha de creación: 24 sep. 2021
*/

package com.music.store.mx.application.repository;

import com.music.store.mx.model.Song;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The Interface SongRepository.
 */
public interface SongRepository extends JpaRepository<Song, Long> {

  /**
   * Find all.
   *
   * @return the list
   */
  public List<Song> findAll();

  /**
   * Find by album id.
   *
   * @param albumId the album id
   * @return the list
   */
  public List<Song> findByAlbumId(Long albumId);

  /**
   * Find by song id.
   *
   * @param songId the song id
   * @return the song
   */
  public Song findBySongId(Long songId);

}
