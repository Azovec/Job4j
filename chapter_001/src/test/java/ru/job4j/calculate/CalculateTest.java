package ru.job4j.calculate

import org.junit.Test;
import static org.hamcreast.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 *@author Roman Bogdan (romabogdan@mail.ru).
 *@version $Id$.
 *@since 0.1.
 */
 
 


public class CalculateTest{
	/**
	* Test echo.
	*/
	
@Test
   public void whenTakeNameThenThreeEchoPlusName() {
	   String input = "Roman Bogdan";
	   String expect = "Echo, echo, echo : Roman Bogdan";
	   Calculate calc = new Calculate();
	   String result = calc.echo(imput);
	   assertThat(result, is(expect));
	   
   }

}