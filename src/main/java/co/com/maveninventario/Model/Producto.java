
package co.com.maveninventario.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Producto {
 
  
  @NonNull private String codigo;
  @EqualsAndHashCode.Exclude private String descri;
  @EqualsAndHashCode.Exclude private double stock,cantidad;
   
    
    
    
    
}
