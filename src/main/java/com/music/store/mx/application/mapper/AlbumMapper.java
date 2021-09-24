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
* Nombre de archivo: AlbumMapper.java
* Autor: etristan
* Fecha de creación: 24 sep. 2021
*/

package com.music.store.mx.application.mapper;

import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.model.Album;

/**
 * The Class AlbumMapper.
 */
public class AlbumMapper {

  /**
   * Instantiates a new album mapper.
   */
  private AlbumMapper() {
    super();
  }

  /**
   * To model.
   *
   * @param albumDto the album dto
   * @return the album
   */
  public static Album toModel(AlbumDto albumDto) {
    return Album.builder().albumId(albumDto.getAlbumId()).title(albumDto.getTitle())
        .release(albumDto.getRelease()).recordLabel(albumDto.getRecordLabel())
        .singer(albumDto.getSinger()).gender(albumDto.getGender()).coverage(albumDto.getCoverage())
        .build();
  }

  /**
   * To dto.
   *
   * @param album the album
   * @return the album dto
   */
  public static AlbumDto toDto(Album album) {
    return AlbumDto.builder().albumId(album.getAlbumId()).title(album.getTitle())
        .release(album.getRelease()).recordLabel(album.getRecordLabel()).singer(album.getSinger())
        .gender(album.getGender()).coverage(album.getCoverage()).build();
  }

}
