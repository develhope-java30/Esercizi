import java.util.ArrayList;

public class ArraysImple {
    //    Implementare un metodo che prenda come parametro un array di interi e ne ritorni il minimo
    public static void ritornaMinimo(ArrayList<Integer> numeri) {
        int result = numeri.get(0);
        for (int number : numeri) {
            if (number <= result) {
                result = number;
            }
        }
        System.out.println("Il minimo valore nell'array risulta essere : " + result);
    }

    public static void ritornaMassimo(ArrayList<Integer> numeri) {
        int result = numeri.get(0);
        for (int number : numeri) {
            if (number >= result) {
                result = number;
            }
        }
        System.out.println("Il massimo valore nell'array risulta essere : " + result);
    }

    //    - Implementare un metodo che prenda come parametro un array di interi e ne ritorni il minimo dei valori maggiori
//    di un parametro k
    public static void numeroPiuGrandeDopoK(ArrayList<Integer> numeri, int k) {
        ArrayList<Integer> listanumeri = new ArrayList<Integer>();
        int result;
        for (int number : numeri) {
            if (number > k) {
                listanumeri.add(number);
            }
        }
        result = listanumeri.get(0);
        for (int number : listanumeri) {
            if (number <= result) {
                result = number;
            }
        }
        System.out.println("Il minimo tra i massimi valori nell'array risulta essere : " + result);
    }

    //    Implementare un metodo che prenda come parametro un array di interi e ne ritorni il minimo dei valori minori di un parametro k
    public static void numeroPiuPiccoloTraiPiPiccoliDopoK(ArrayList<Integer> numeri, int k) {
        ArrayList<Integer> listanumeri = new ArrayList<Integer>();
        int result;
        for (int number : numeri) {
            if (number < k) {
                listanumeri.add(number);
            }
        }
        result = listanumeri.get(0);
        for (int number : listanumeri) {
            if (number <= result) {
                result = number;
            }
        }
        System.out.println("Il minimo tra i minori valori nell'array risulta essere : " + result);
    }

    //    Implementare un metodo che prenda come parametro un array di interi e ne ritorni il minimo dei numeri strettamente positivi
    public static void ritornaMinimoPositivo(ArrayList<Integer> numeri) {
        int result = numeri.get(0);
        for (int number : numeri) {
            if (number > 0 && number <= result) {
                result = number;
            }
        }
        System.out.println("Il minimo valore positivo nell'array risulta essere : " + result);
    }

    //    Implementare un metodo che prenda come parametro un array di interi e ne ritorni il massimo dei numeri strettamente negativi
    public static void ritornaMassimoNegativi(ArrayList<Integer> numeri) {
        ArrayList<Integer> listanumeri = new ArrayList<>();
        for (int number : numeri) {
            if (number < 0 ) {
                listanumeri.add(number);
            }
        }
        int result = listanumeri.get(0);

        for (int number : listanumeri){
            if ( number > result);
            result = number;
        }
        System.out.println("Il massimo valore tra i negativi  nell'array risulta essere : " + result);
    }
}

