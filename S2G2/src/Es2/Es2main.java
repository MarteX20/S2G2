package Es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Es2.func.*;

public class Es2main {
    public static void main(String[] args) {
        int N = 10;
        List<Integer> listaCasuale = genCasualList(N);


        System.out.println("Lista casuale:");
        System.out.println(listaCasuale);


        List<Integer> inversList = newListInvers(listaCasuale);
        System.out.println("Lista inversa:");
        System.out.println(inversList);


        System.out.println("Valori in posizioni pari:");
        stampList(listaCasuale, true);


        System.out.println("Valori in posizioni dispari:");
        stampList(listaCasuale, false);
    }
}
