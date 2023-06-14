package br;


import java.util.Random;

public class MyRandomNumber {
    Random random = new Random();
    int number;
    /*
     *
     * @param begin inicio do intervalo
     * @param end fim do intervalo
     * @return retornar um numero aleatorio entre [begin, end]
     * o numero aleatorio retornado nao pode ser igual ao anterior
     * @throws IntervaloInvalidoException
     * essa excecao eh lancada quando begin >= end ou (begin<0 || end<0)
     *
     */

    public int nextRandomNumber(int begin, int end) throws IntervaloInvalidoException {

        if(begin >= end) {
            throw new IntervaloInvalidoException("begin é maior ou igual a end");
        }
        if(begin<0){
            throw new IntervaloInvalidoException("begin eh menor que zero");
        }
        if (end<0){
            throw new IntervaloInvalidoException("End é menor que zero");
        }


        int randomNumber;
        do {
            randomNumber = random.nextInt(end - begin+1)+begin;
        }while (randomNumber == number);
            return number = randomNumber;

    }
}
