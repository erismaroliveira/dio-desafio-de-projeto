package exemplo.arrays;

public class Exemplo01 {

    public static void main(String[] args) {

        //dataType[] arrayName = new dataType[arraySize];
        // Forma de criar array
        int[] meuArray = new int[7];

        //dataType[] arrayName = { value0, value1, ..., valueN };
        // outra Forma de criar array
        int[] meuNovoArray = { 12, 32, 54, 6, 8, 89, 64 };

        // alterando o valor de um elemento
        meuNovoArray[0] = 50;

        // comprimento do array
        System.out.println(meuNovoArray.length);

        // percorrendo arrays
        for (int i = 0; i < 7; i++) {
            System.out.println(meuNovoArray[i]);
        }

        // exemplo de arrays multidimensionais
        int[][] meuArrayMulti = { {1,2,3,4}, {5,6,7} };

        //percorrendo arrays multidimensionais
        for (int i = 0; i < meuArrayMulti.length; i++) {
            for (int j = 0; j < meuArrayMulti[i].length; j++) {
                System.out.println(meuArrayMulti[i][j]);
            }
        }

    }
}
