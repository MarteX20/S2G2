package Es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class func {
    public static List<Integer> genCasualList(int N) {

        Random random = new Random();
        List<Integer> lista = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            int numeroCasuale = random.nextInt(101);
            lista.add(numeroCasuale);
        }

        return lista;

    }

    public static List<Integer> newListInvers(List<Integer> lista) {
        List<Integer> listaInversa = new ArrayList<>(lista);
        List<Integer> listaOriginale = new ArrayList<>(lista);

        for (int i = listaOriginale.size() - 1; i >= 0; i--) {
            listaInversa.add(listaOriginale.get(i));
        }

        return listaInversa;
    }

    public static void stampList(List<Integer> lista, boolean pari) {
        if (pari) {
            for (int i = 0; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        } else {
            for (int i = 1; i < lista.size(); i += 2) {
                System.out.println(lista.get(i));
            }
        }
    }
}
