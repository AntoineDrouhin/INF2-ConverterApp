/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.math.BigDecimal;
import javax.ejb.Local;

/**
 *
 * @author mezdari
 */
@Local
public interface ConverterLocal {

    BigDecimal dollarToYen(BigDecimal dollars);

    BigDecimal yenToEuro(BigDecimal yen);
    
}
