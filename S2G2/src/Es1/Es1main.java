package Es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Es1main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire il numero di elementi: ");
        int N = scanner.nextInt();

        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserire le parole non duplicate:");

        for (int i = 0; i < N+1; i++) {
            String s = scanner.nextLine();

            if (!parole.add(s)){
                paroleDuplicate.add(s);
            }
        }

        System.out.println("Parole duplicate");
        for (String s : paroleDuplicate) {
            System.out.println(paroleDuplicate);
        }

        int singoli = parole.size();
        System.out.println("Numero di parole non duplicate: " + singoli);

        System.out.println("Elenco parole non duplicate: ");
        for (String s : parole){
            System.out.println(s);
        }
    }
}