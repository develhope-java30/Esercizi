import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Main{
    public static void main(String[] args){

        ArrayList<Integer> numeri = new ArrayList<Integer>(Arrays.asList(1,2,-83,4,5,6,-7,8,9,10));
        ArraysImple.ritornaMinimo(numeri);
        ArraysImple.ritornaMassimo(numeri);
        ArraysImple.numeroPiuGrandeDopoK(numeri,3);
        ArraysImple.numeroPiuPiccoloTraiPiPiccoliDopoK(numeri,6);
        ArraysImple.ritornaMinimoPositivo(numeri);
        ArraysImple.ritornaMassimoNegativi(numeri);
        System.out.println("hello world");
    }


}
