
package co.com.maveninventario.dao;

import co.com.maveninventario.Model.Producto;
import java.util.List;


public interface IProductoDao {
    
    List<Producto> obtenerProductos();
    Producto obtenerProducto (String codigo);
    void crearProducto (Producto producto);
    void eliminarProducto(String codigo);
    void actualizarProducto(Producto producto);
    
    
}
