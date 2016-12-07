/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 *
 * @author mezdari
 */
@Remote
public interface ConverterRemoteInterfaceRemote {

    BigDecimal dollarToYen(java.math.BigDecimal dollars);

    BigDecimal yenToEuro(java.math.BigDecimal yen);
    
}
