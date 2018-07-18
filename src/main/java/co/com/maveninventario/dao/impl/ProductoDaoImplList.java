/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.maveninventario.dao.impl;

import co.com.maveninventario.Model.Producto;
import co.com.maveninventario.dao.IProductoDao;
import co.com.maveninventario.data.ProductoData;
import java.util.List;


public class ProductoDaoImplList implements IProductoDao{

    @Override
    public List<Producto> obtenerProductos() {
       return ProductoData.getListado();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        List<Producto> listado = ProductoData.getListado();
        /*otra forma 
        for(Producto p: listado){
            if (p.getCodigo().equals(codigo)){
            return p;
             }
        }
        
        */
        
        Producto producto = new Producto(codigo);        
        return listado.get(listado.indexOf(producto));
        
        
        
        
    }

    @Override
    public void crearProducto(Producto producto) {
       List<Producto> listado = ProductoData.getListado();
       listado.add(producto);
       ProductoData.setListado(listado);
    }

    @Override
    public void eliminarProducto(String codigo) {
        List<Producto> listado = ProductoData.getListado();
       listado.remove(obtenerProducto(codigo));
       ProductoData.setListado(listado);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        List<Producto> listado = ProductoData.getListado();
        listado.set(listado.indexOf(producto), producto);
        ProductoData.setListado(listado);
    }
    
}
