import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander combien de nombres l'utilisateur souhaite saisir
        System.out.print("Combien de nombres voulez-vous moyenner ? : ");
        int count = 0;
        
        // Vérification du nombre d'éléments à entrer
        try {
            count = scanner.nextInt();
            if (count <= 0) {
                System.out.println("Erreur : Le nombre de valeurs à entrer doit être positif.");
                scanner.close();
                return;
            }
        } catch (InputMismatchException e) {
            System.err.println("Erreur : Veuillez entrer un nombre entier valide pour le nombre de valeurs.");
            scanner.close();
            return;
        }

        // Variables pour le calcul de la somme
        float sum = 0;

        // Demander à l'utilisateur de saisir les valeurs
        System.out.println("Veuillez saisir " + count + " nombres : ");
        for (int i = 1; i <= count; i++) {
            try {
                float number = scanner.nextFloat();  // Lire chaque nombre
                sum += number;  // Ajouter le nombre à la somme
            } catch (InputMismatchException e) {
                System.err.println("Erreur : Veuillez entrer des nombres valides.");
                scanner.nextLine();  // Consommer l'entrée incorrecte
                i--;  // Réessayer la saisie de ce nombre
            }
        }

        // Calculer et afficher la moyenne
        float average = sum / count;
        System.out.println("La moyenne de vos " + count + " nombres est : " + average);

        // Fermer le scanner
        scanner.close();
    }
}
