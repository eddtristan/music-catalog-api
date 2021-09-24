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
* Nombre de archivo: MusicStoreController.java
* Autor: etristan
* Fecha de creación: 24 sep. 2021
*/

package com.music.store.mx.application.controller;

import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.service.MusicStoreService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class MusicStoreController.
 */
@RestController
public class MusicStoreController {

  /** The music store service. */
  private MusicStoreService musicStoreService;

  /**
   * Instantiates a new music store controller.
   *
   * @param musicStoreService the music store service
   */
  public MusicStoreController(MusicStoreService musicStoreService) {
    this.musicStoreService = musicStoreService;
  }

  /**
   * Gets the albums.
   *
   * @return the albums
   */
  @GetMapping(value = "/api/v1/albums", produces = "application/json")
  public ResponseEntity<List<AlbumDto>> getAlbums() {
    return new ResponseEntity<>(musicStoreService.retrieveAlbums(), HttpStatus.OK);
  }

  /**
   * Creates the album.
   *
   * @param albumDto the album dto
   * @return the response entity
   */
  @PostMapping(value = "/api/v1/albums")
  public ResponseEntity<Void> createAlbum(@RequestBody AlbumDto albumDto) {
    musicStoreService.saveAlbum(albumDto);
    return ResponseEntity.ok(null);
  }

  /**
   * Update albums.
   *
   * @param recordLabel the record label
   * @return the response entity
   */
  @PutMapping(value = "/api/v1/albums/updateRL/{recordLabel}")
  public ResponseEntity<Void> updateAlbums(@PathVariable("recordLabel") String recordLabel) {
    musicStoreService.updateAlbums(recordLabel);
    return ResponseEntity.ok(null);
  }

  /**
   * Delete albums.
   *
   * @return the response entity
   */
  @DeleteMapping(value = "/api/v1/albums")
  public ResponseEntity<Void> deleteAlbums() {
    musicStoreService.deleteAlbums();
    return ResponseEntity.ok(null);
  }

  /**
   * Gets the album by album id.
   *
   * @param albumId the album id
   * @return the album by album id
   */
  @GetMapping(value = "/api/v1/albums/{albumId}", produces = "application/json")
  public ResponseEntity<AlbumDto> getAlbumByAlbumId(@PathVariable("albumId") Long albumId) {
    return new ResponseEntity<>(musicStoreService.retrieveAlbum(albumId), HttpStatus.OK);
  }

  /**
   * Update album.
   *
   * @param albumId the album id
   * @param albumDto the album dto
   * @return the response entity
   */
  @PutMapping(value = "/api/v1/albums/{albumId}")
  public ResponseEntity<Void> updateAlbum(@PathVariable("albumId") Long albumId,
      @RequestBody AlbumDto albumDto) {
    musicStoreService.updateAlbumByAlbumId(albumId, albumDto);
    return ResponseEntity.ok(null);
  }

  /**
   * Delete album.
   *
   * @param albumId the album id
   * @return the response entity
   */
  @DeleteMapping(value = "/api/v1/albums/{albumId}")
  public ResponseEntity<Void> deleteAlbum(@PathVariable("albumId") Long albumId) {
    musicStoreService.deleteAlbum(albumId);
    return ResponseEntity.ok(null);
  }

  /**
   * Gets the songs by album id.
   *
   * @param albumId the album id
   * @return the songs by album id
   */
  @GetMapping(value = "/api/v1/albums/{albumId}/songs", produces = "application/json")
  public ResponseEntity<List<SongDto>> getSongsByAlbumId(@PathVariable("albumId") Long albumId) {
    return new ResponseEntity<>(musicStoreService.retrieveSongs(albumId), HttpStatus.OK);
  }

  /**
   * Creates the song of album.
   *
   * @param albumId the album id
   * @param songDto the song dto
   * @return the response entity
   */
  @PostMapping(value = "/api/v1/albums/{albumId}/songs")
  public ResponseEntity<Void> createSongOfAlbum(@PathVariable("albumId") Long albumId,
      @RequestBody SongDto songDto) {
    musicStoreService.saveSongOfAlbum(albumId, songDto);
    return ResponseEntity.ok(null);
  }

  /**
   * Update songsof album.
   *
   * @param albumId the album id
   * @param length the length
   * @return the response entity
   */
  @PutMapping(value = "/api/v1/albums/{albumId}/songs/{length}")
  public ResponseEntity<Void> updateSongsofAlbum(@PathVariable("albumId") Long albumId,
      @PathVariable("length") Float length) {
    musicStoreService.updateSongsOfAlbum(albumId, length);
    return ResponseEntity.ok(null);
  }

  /**
   * Delete sonfs of album.
   *
   * @param albumId the album id
   * @return the response entity
   */
  @DeleteMapping(value = "/api/v1/albums/{albumId}/songs")
  public ResponseEntity<Void> deleteSonfsOfAlbum(@PathVariable("albumId") Long albumId) {
    musicStoreService.deleteSongsOfAlbum(albumId);
    return ResponseEntity.ok(null);
  }

  /**
   * Gets the song by song id.
   *
   * @param albumId the album id
   * @param songId the song id
   * @return the song by song id
   */
  @GetMapping(value = "/api/v1/albums/{albumId}/songs/{songId}", produces = "application/json")
  public ResponseEntity<SongDto> getSongBySongId(@PathVariable("albumId") Long albumId,
      @PathVariable("songId") Long songId) {
    return new ResponseEntity<>(musicStoreService.retrieveSong(songId), HttpStatus.OK);
  }

  /**
   * Update song of album.
   *
   * @param songId the song id
   * @param length the length
   * @return the response entity
   */
  @PutMapping(value = "/api/v1/albums/{albumId}/songs/{songId}/{length}")
  public ResponseEntity<Void> updateSongOfAlbum(@PathVariable("songId") Long songId,
      @PathVariable("length") Float length) {
    musicStoreService.updateSongOfAlbum(songId, length);
    return ResponseEntity.ok(null);
  }

  /**
   * Delete song of album.
   *
   * @param albumId the album id
   * @param songId the song id
   * @return the response entity
   */
  @DeleteMapping(value = "/api/v1/albums/{albumId}/songs/{songId}")
  public ResponseEntity<Void> deleteSongOfAlbum(@PathVariable("albumId") Long albumId,
      @PathVariable("songId") Long songId) {
    musicStoreService.deleteSongOfAlbum(albumId, songId);
    return ResponseEntity.ok(null);
  }

  /**
   * Gets the songs.
   *
   * @return the songs
   */
  @GetMapping(value = "/api/v1/songs", produces = "application/json")
  public ResponseEntity<List<SongDto>> getSongs() {
    return new ResponseEntity<>(musicStoreService.retrieveSongs(), HttpStatus.OK);
  }



}
