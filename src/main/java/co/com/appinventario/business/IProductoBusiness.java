
package co.com.appinventario.business;

import co.com.maveninventario.Model.Producto;
import java.util.List;


public interface IProductoBusiness {
 
    List<Producto> obtenerProductos();
    Producto obtenerProducto (String codigo);
    String crearProducto (Producto producto);
    String eliminarProducto(String codigo);
    String actualizarProducto(Producto producto);
    
    
    
    
}
