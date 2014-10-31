/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.ecommerce.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author Alejandro
 */
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
@Entity
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Producto {
   @Id
   long id;
   String nombre;
   private double precio;

    public Producto() {
        this(0,"",0);
    }

    public Producto(long id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
   
}
