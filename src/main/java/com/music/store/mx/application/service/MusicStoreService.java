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
* Nombre de archivo: MusicStoreService.java
* Autor: etristan
* Fecha de creación: 24 sep. 2021
*/

package com.music.store.mx.application.service;

import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import java.util.List;

/**
 * The Interface MusicStoreService.
 */
public interface MusicStoreService {

  /**
   * Retrieve albums.
   *
   * @return the list
   */
  List<AlbumDto> retrieveAlbums();

  /**
   * Save album.
   *
   * @param albumDto the album dto
   */
  void saveAlbum(AlbumDto albumDto);

  /**
   * Update albums.
   *
   * @param recordLabel the record label
   */
  void updateAlbums(String recordLabel);

  /**
   * Delete albums.
   */
  void deleteAlbums();

  /**
   * Retrieve album.
   *
   * @param albumId the album id
   * @return the album dto
   */
  AlbumDto retrieveAlbum(Long albumId);

  /**
   * Update album by album id.
   *
   * @param albumId the album id
   * @param albumDto the album dto
   */
  void updateAlbumByAlbumId(Long albumId, AlbumDto albumDto);

  /**
   * Delete album.
   *
   * @param albumId the album id
   */
  void deleteAlbum(Long albumId);

  /**
   * Retrieve songs.
   *
   * @param albumId the album id
   * @return the list
   */
  List<SongDto> retrieveSongs(Long albumId);

  /**
   * Save song of album.
   *
   * @param albumId the album id
   * @param songDto the song dto
   */
  void saveSongOfAlbum(Long albumId, SongDto songDto);

  /**
   * Update songs of album.
   *
   * @param albumId the album id
   * @param length the length
   */
  void updateSongsOfAlbum(Long albumId, Float length);

  /**
   * Delete songs of album.
   *
   * @param albumId the album id
   */
  void deleteSongsOfAlbum(Long albumId);

  /**
   * Retrieve song.
   *
   * @param songId the song id
   * @return the song dto
   */
  SongDto retrieveSong(Long songId);

  /**
   * Update song of album.
   *
   * @param songId the song id
   * @param length the length
   */
  void updateSongOfAlbum(Long songId, Float length);

  /**
   * Delete song of album.
   *
   * @param albumId the album id
   * @param songId the song id
   */
  // Delete de una cancion de un album
  void deleteSongOfAlbum(Long albumId, Long songId);

  /**
   * Retrieve songs.
   *
   * @return the list
   */
  List<SongDto> retrieveSongs();

}
