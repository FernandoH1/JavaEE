/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boutique.io;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class CombosProductosProductos {
    CombosProducto combosProducto;
    private ArrayList<Producto> productos; 

    public CombosProductosProductos(CombosProducto combosProducto, ArrayList<Producto> productos) {
        this.combosProducto= combosProducto;
        this.productos= productos;
    }

    public CombosProducto getCombosProducto() {
        return combosProducto;
    }

    public void setCombosProducto(CombosProducto combosProducto) {
        this.combosProducto = combosProducto;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
}
