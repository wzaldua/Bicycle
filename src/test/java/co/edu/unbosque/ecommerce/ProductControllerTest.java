/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.ecommerce;

import co.edu.unbosque.ecommerce.ecommerce.controller.InicializadorRest;
import co.edu.unbosque.ecommerce.ecommerce.controller.ProductController;
import co.edu.unbosque.ecommerce.ecommerce.entities.Producto;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Alejandro
 */
public class ProductControllerTest {
   
    @Test
    public void retornaElListadoDeProductos(){
        ProductController pc=new ProductController();
        List<Producto> lista=pc.listarProductos();
        Assert.assertEquals(1, lista.size());
    }
    

}
