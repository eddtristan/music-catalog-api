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
* Nombre de archivo: Song.java
* Autor: etristan
* Fecha de creación: 24 sep. 2021
*/

package com.music.store.mx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class Song.
 */
@Entity
@Table(name = "Cancion")

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
 * Instantiates a new song.
 */
@NoArgsConstructor

/**
 * Instantiates a new song.
 *
 * @param songId the song id
 * @param title the title
 * @param albumId the album id
 * @param author the author
 * @param length the length
 */
@AllArgsConstructor
public class Song {
  
  /** The song id. */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idCancion", nullable = false, length = 11)
  private Long songId;

  /** The title. */
  @Column(name = "titulo", nullable = false, length = 45)
  private String title;

  /** The album id. */
  @Column(name = "idAlbum", nullable = false, length = 11)
  private Long albumId;

  /** The author. */
  @Column(name = "autor", nullable = true, length = 45)
  private String author;

  /** The length. */
  @Column(name = "duracion", nullable = false)
  private Float length;
}
