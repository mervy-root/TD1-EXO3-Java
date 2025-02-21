import java.util.Scanner;

public class Main {
    public static void Application() {
        int saisie = 0;
        Scanner sc = new Scanner(System.in);

        Mesure mes;

        do {
            System.out.println("Entrez une mesure: ");
            saisie = sc.nextInt();
            mes = new Mesure(saisie);
        } while (saisie != 0);

        Mesure.afficherMoyenne();
        sc.close();
    }

    public static void main(String[] args) {
        Application();
    }
}
