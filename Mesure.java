public class Mesure {
    private int valeur;

    public static int NbMesures = 0; // Nombres d'instances de la classe Mesure
    public static int SomMesures = 0; // Somme des valeurs des mesures instanciees

    public Mesure(int valeur) {
        if (valeur < -100 || valeur > 100)
            System.out.println("Mesure hors intervalle.");
        else if (valeur == 0)
            System.out.print("");
        else {
            this.valeur = valeur;
            NbMesures++;
            SomMesures += valeur;
        }
    }

    public int getValeur() {
        return this.valeur;
    }

    public void setValeur(int Valeur) {
        SomMesures += (valeur - this.valeur);
        this.valeur = Valeur;
    }

    public static void afficherMoyenne() {
        if (NbMesures == 0) {
            System.out.println("Zero Mesures");
            return;
        }

        System.out.println(
                "La moyenne des " + Mesure.NbMesures + " mesures est: " + (float) SomMesures / (float) NbMesures);
    }

}