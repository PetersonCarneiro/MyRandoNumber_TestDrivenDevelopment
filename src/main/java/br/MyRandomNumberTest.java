package br;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class MyRandomNumberTest {

   private MyRandomNumber myRandomNumber;

   @Before
   public void start(){
       myRandomNumber = new MyRandomNumber();
   }
   @Test
   public void numeroValido() throws IntervaloInvalidoException{
       int begin = 1;
       int end = 10;

       int random = myRandomNumber.nextRandomNumber(begin,end);

       assertTrue(random>= begin && random <= end);
   }

   @Test
   public void numeroInvalido(){
       int begin = 10;
       int end = 1;

       assertThrows(IntervaloInvalidoException.class, () -> myRandomNumber.nextRandomNumber(begin, end));
   }


    @Test
    public void testNumeroNegativo(){
        int begin = -8;
        int end = 10;

        assertThrows(IntervaloInvalidoException.class, () -> myRandomNumber.nextRandomNumber(begin, end));
    }
    @Test
    public void testNumeroNegativo2(){
        int begin = -8;
        int end = -10;

        assertThrows(IntervaloInvalidoException.class, () -> myRandomNumber.nextRandomNumber(begin, end));
    }

    @Test
    void testDiferenteDoAnterior() throws IntervaloInvalidoException {
        int begin = 1;
        int end = 10;

        int number = myRandomNumber.nextRandomNumber(begin, end);
        for (int i = 0; i < 100; i++) {
            int randomNumber = myRandomNumber.nextRandomNumber(begin, end);
            assertNotEquals(number, randomNumber);
            number = randomNumber;
        }
    }






}
