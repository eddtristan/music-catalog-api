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
* Nombre de archivo: AlbumDto.java
* Autor: etristan
* Fecha de creación: 24 sep. 2021
*/

package com.music.store.mx.application.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Gets the coverage.
 *
 * @return the coverage
 */
@Getter

/**
 * Sets the coverage.
 *
 * @param coverage the new coverage
 */
@Setter

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder

/**
 * Instantiates a new album dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new album dto.
 *
 * @param albumId the album id
 * @param title the title
 * @param release the release
 * @param recordLabel the record label
 * @param singer the singer
 * @param gender the gender
 * @param coverage the coverage
 */
@AllArgsConstructor
public class AlbumDto {
  
  /** The album id. */
  private Long albumId;

  /** The title. */
  private String title;

  /** The release. */
  private LocalDateTime release;

  /** The record label. */
  private String recordLabel;

  /** The singer. */
  private String singer;

  /** The gender. */
  private String gender;

  /** The coverage. */
  private String coverage;
}
