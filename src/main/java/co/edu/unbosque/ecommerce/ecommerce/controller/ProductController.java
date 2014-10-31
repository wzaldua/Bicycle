/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.ecommerce.ecommerce.controller;

import co.edu.unbosque.ecommerce.ecommerce.entities.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alejandro
 */
@RestController
@RequestMapping(value = "/api/v1/producto" )
public class ProductController {
    
    @RequestMapping(value = "/listar", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON})
    public List<Producto> listarProductos(){
        ArrayList<Producto> lista=new ArrayList<Producto>();
        lista.add(new Producto(10, "TestP", 225.68));
        return lista;
    }
    
}
