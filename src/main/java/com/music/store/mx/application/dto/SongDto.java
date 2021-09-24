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
* Nombre de archivo: SongDto.java
* Autor: etristan
* Fecha de creación: 24 sep. 2021
*/

package com.music.store.mx.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Gets the length.
 *
 * @return the length
 */
@Getter

/**
 * Sets the length.
 *
 * @param length the new length
 */
@Setter

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder

/**
 * Instantiates a new song dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new song dto.
 *
 * @param songId the song id
 * @param title the title
 * @param albumId the album id
 * @param author the author
 * @param length the length
 */
@AllArgsConstructor
public class SongDto {
  
  /** The song id. */
  private Long songId;

  /** The title. */
  private String title;

  /** The album id. */
  private Long albumId;

  /** The author. */
  private String author;

  /** The length. */
  private Float length;
}
