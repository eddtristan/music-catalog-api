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
* Nombre de archivo: MusicStoreServiceImpl.java
* Autor: etristan
* Fecha de creación: 24 sep. 2021
*/

package com.music.store.mx.application.service.impl;

import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.mapper.AlbumMapper;
import com.music.store.mx.application.mapper.SongMapper;
import com.music.store.mx.application.repository.AlbumRepository;
import com.music.store.mx.application.repository.SongRepository;
import com.music.store.mx.application.service.MusicStoreService;
import com.music.store.mx.model.Album;
import com.music.store.mx.model.Song;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * The Class MusicStoreServiceImpl.
 */
@Service
public class MusicStoreServiceImpl implements MusicStoreService {

  /** The album repository. */
  private AlbumRepository albumRepository;
  
  /** The song repository. */
  private SongRepository songRepository;

  /**
   * Instantiates a new music store service impl.
   *
   * @param albumRepository the album repository
   * @param songRepository the song repository
   */
  public MusicStoreServiceImpl(AlbumRepository albumRepository, SongRepository songRepository) {
    this.albumRepository = albumRepository;
    this.songRepository = songRepository;
  }

  /**
   * Retrieve albums.
   *
   * @return the list
   */
  @Override
  public List<AlbumDto> retrieveAlbums() {
    return this.albumRepository.findAll().stream().map(AlbumMapper::toDto)
        .collect(Collectors.toList());

  }

  /**
   * Save album.
   *
   * @param albumDto the album dto
   */
  @Override
  public void saveAlbum(AlbumDto albumDto) {
    this.albumRepository.save(AlbumMapper.toModel(albumDto));
  }

  /**
   * Update albums.
   *
   * @param recordLabel the record label
   */
  @Override
  public void updateAlbums(String recordLabel) {
    List<Album> albums = albumRepository.findAll();
    for (Album album : albums) {
      album.setRecordLabel(recordLabel);
      this.albumRepository.save(album);
    }
  }

  /**
   * Delete albums.
   */
  @Override
  public void deleteAlbums() {
    this.albumRepository.deleteAll();
  }

  /**
   * Retrieve album.
   *
   * @param albumId the album id
   * @return the album dto
   */
  @Override
  public AlbumDto retrieveAlbum(Long albumId) { 
    return AlbumMapper.toDto(albumRepository.getOne(albumId));
  }

  /**
   * Update album by album id.
   *
   * @param albumId the album id
   * @param albumDto the album dto
   */
  @Override
  public void updateAlbumByAlbumId(Long albumId, AlbumDto albumDto) {
    this.albumRepository.saveAndFlush(AlbumMapper.toModel(albumDto));
  }

  /**
   * Delete album.
   *
   * @param albumId the album id
   */
  @Override
  public void deleteAlbum(Long albumId) {
    this.albumRepository.delete(albumRepository.findByAlbumId(albumId));
  }

  /**
   * Retrieve songs.
   *
   * @param albumId the album id
   * @return the list
   */
  @Override
  public List<SongDto> retrieveSongs(Long albumId) {
    return this.songRepository.findByAlbumId(albumId).stream().map(SongMapper::toDto)
        .collect(Collectors.toList());
  }

  /**
   * Save song of album.
   *
   * @param albumId the album id
   * @param songDto the song dto
   */
  @Override
  public void saveSongOfAlbum(Long albumId, SongDto songDto) {
    songDto.setAlbumId(albumId);
    this.songRepository.save(SongMapper.toModel(songDto));
  }

  /**
   * Update songs of album.
   *
   * @param albumId the album id
   * @param length the length
   */
  @Override
  public void updateSongsOfAlbum(Long albumId, Float length) {
    List<Song> songs = this.songRepository.findByAlbumId(albumId);
    for (Song song : songs) {
      song.setLength(length);
      this.songRepository.saveAndFlush(song);
    }
  }

  /**
   * Delete songs of album.
   *
   * @param albumId the album id
   */
  @Override
  public void deleteSongsOfAlbum(Long albumId) {
    List<Song> songs = this.songRepository.findByAlbumId(albumId);
    for (Song song : songs) {
      this.songRepository.delete(song);
    }
  }

  /**
   * Retrieve song.
   *
   * @param songId the song id
   * @return the song dto
   */
  @Override
  public SongDto retrieveSong(Long songId) {
    return SongMapper.toDto(this.songRepository.getOne(songId));
  }

  /**
   * Update song of album.
   *
   * @param songId the song id
   * @param length the length
   */
  @Override
  public void updateSongOfAlbum(Long songId, Float length) {
    Song song = this.songRepository.getOne(songId);
    song.setLength(length);
    this.songRepository.saveAndFlush(song);
  }

  /**
   * Delete song of album.
   *
   * @param albumId the album id
   * @param songId the song id
   */
  @Override
  public void deleteSongOfAlbum(Long albumId, Long songId) {
    this.songRepository.delete(songRepository.findBySongId(songId));
  }

  /**
   * Retrieve songs.
   *
   * @return the list
   */
  @Override
  public List<SongDto> retrieveSongs() {
    return this.songRepository.findAll().stream().map(SongMapper::toDto)
        .collect(Collectors.toList());
  }

}
