package co.com.appinventario.business.Impl;

import co.com.appinventario.business.IProductoBusiness;
import co.com.maveninventario.Model.Producto;
import co.com.maveninventario.dao.impl.ProductoDaoImplList;
import java.util.List;

public class ProductoBusinessImpl implements IProductoBusiness {

    private ProductoDaoImplList productoDao = new ProductoDaoImplList();

    @Override
    public List<Producto> obtenerProductos() {
        return ProductoDaoImplList();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        List<Producto> lista = obtenerProductos();
        Producto buscar = new producto(codigo);
        if (lista.contains(buscar)) {
            return productoDao.obtenerProducto(codigo);
        }
        return null;
    }

    @Override
    public String crearProducto(Producto producto) {
        String resp = "Producto ya existe";
        if (obtenerProducto(producto.getCodigo()) == null) {
            if(producto.getStock()<5){
                return "El Stock debe ser mayor/igual a cinco";
                
            }
            if (producto.getCantidad()<=0) {
                return "La cantidad debe ser mayor a cero";
            }
            productoDao.crearProducto(producto);
            resp = "Producto Creado";
        }
        return resp;

    }

    @Override
    public String eliminarProducto(String codigo) {
       String resp = "Producto no existe";
        if (obtenerProducto(codigo) != null) {
            productoDao.eliminarProducto(codigo);
            resp = "Producto Eliminado";
        }
        return resp;  
    }

    @Override
    public String actualizarProducto(Producto producto) {
      String resp = "Producto no existe";
        if (obtenerProducto(producto.getCodigo()) != null) {
            productoDao.actualizarProducto(producto);
            resp = "Producto Actualizado";
        }
        return resp;   
    }

    private List<Producto> ProductoDaoImplList() {
       
    }

}
