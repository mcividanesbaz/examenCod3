/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencod3;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class CalculoParametricTest {

    private int result;
  Calculo cal= new Calculo();
    
    
   @Before
   public void initialize() {
   
   
   }

  public CalculoParametricTest(Calculo cal, int result) {
      this.cal = cal;
      this.result = result;
 
    }

@Parameterized.Parameters
    public static Collection MCDnumbers() {
        return Arrays.asList(new Object[][]{
            {new Calculo(2, 2), 2},
            {new Calculo(2, 5), 1},
            {new Calculo(2, 2), 2},
            {new Calculo(2, 1),1}

        });
   }
     @Test
   public void testMCDnumbersChecker() {
      System.out.println("Parameterized  is : " +result);
      assertEquals(result, cal.obtenerMCD(cal.getNumero1(), cal.getNumero2()));
   }
}    

