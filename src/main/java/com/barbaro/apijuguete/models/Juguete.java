package com.barbaro.apijuguete.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

// Esto es una entidad
// Clase - Tabla
@Entity
public class Juguete {

	// Es la llave primaria
	@Id
	// Generar automaticamente
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	// Una columna de la tabla
	@Column(name = "nombre")
	private String nombre;
	
	@Column
	private String descripcion;
	
	@Column
	private float precio;
	
	@JsonFormat
	(shape = Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@Column
	private Date fecha;
	
	// Este es para JPA
	public Juguete() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
