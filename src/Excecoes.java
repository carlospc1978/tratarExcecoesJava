
public class Excecoes {

    public static void main(String[] args) {

        //TODO - VERIFICAR ESSE COD

        /*
         * No código abaixo a exceção irá ocorrer
         * pelo fato de dividirmos um número
         * por zero.
         * */
        int valor1 = 10;
        int valor2 = 0;
//        System.out.println(valor1/valor2);

        /*
         * Você também pode optar por lançar uma
         * exceção por conta própria.
         * Veja um exemplo abaixo
         * */

        if (valor1  > valor2){
            throw new ArithmeticException
                    ("O valor 1 não pode ser maior que o valor 2");
        }
        System.out.println("***************** ultima linha");

    }

}

