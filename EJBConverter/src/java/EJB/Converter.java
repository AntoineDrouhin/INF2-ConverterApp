/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import java.math.BigDecimal;
import javax.ejb.Stateless;

/**
 *
 * @author mezdari
 */
@Stateless
public class Converter implements ConverterLocal {

    
    
    @Override
    public BigDecimal dollarToYen(BigDecimal dollars) {
        BigDecimal yenRate = new java.math.BigDecimal("121.6000");
        BigDecimal result = dollars.multiply(yenRate);
        return result.setScale(2, BigDecimal.ROUND_UP);
    }

    @Override
    public BigDecimal yenToEuro(BigDecimal yen) {
        BigDecimal euroRate = new BigDecimal("0.0077");
        BigDecimal result = yen.multiply(euroRate);
        return result.setScale(2, BigDecimal.ROUND_UP);
    }

    
    
}
