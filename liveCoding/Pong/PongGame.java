import javax.swing.*; // Importation des classes Swing pour créer l'interface graphique (JFrame, JPanel, etc.).
// On utilisera JFrame pour créer une fenêtre principale et JPanel pour dessiner nos éléments de jeu.
import java.awt.*; // Importation pour gérer le dessin graphique (couleurs, formes, etc.).
// Cela inclut la classe Graphics, utilisée pour dessiner des formes (comme la balle ou les raquettes).


public class PongGame extends JPanel { // La classe hérite de JPanel pour fournir une zone où dessiner notre jeu.
    // Attributes
    private static int width = 800;
    private static int heigth = 500;
    private static int ballWidth = 20;
    private static int ballHeigth = 20;
    private static int paddleWidth = 10;
    private static int paddleHeigth = 60;


    // Step 2 : Préparer le dessin de base
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        // Appelle la méthode de la classe parent pour s'assurer que tout le reste du panneau est correctement mis à jour.

        g.setColor(Color.BLACK); 
        // Définition de la couleur actuelle en noir. Cette couleur sera utilisée pour l'arrière-plan.

        g.fillRect(0, 0, width, heigth); 
        // Dessin d'un rectangle noir qui couvre toute la surface du jeu (dimensions de la fenêtre).

        g.setColor(Color.WHITE); 
        // Changement de la couleur actuelle en blanc, utilisée pour dessiner la balle et les raquettes.

        g.fillOval(250, 150, ballWidth, ballHeigth); 
        // Dessin d'un cercle représentant la balle. 
        // Le cercle est positionné au centre (x=250, y=150) avec un diamètre de 20 pixels.

        g.fillRect(20, 120, paddleWidth, paddleHeigth); 
        // Dessin de la raquette du joueur 1. 
        // Elle est positionnée à gauche (x=20) avec une largeur de 10 pixels et une hauteur de 60 pixels.

        g.fillRect(470, 120, 10, 60); 
        // Dessin de la raquette du joueur 2. 
        // Elle est positionnée à droite (x=470) avec les mêmes dimensions que la raquette 1.
    }

    // Méthode principale : point d'entrée du programme.
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong Game"); // Création de la fenêtre avec le titre "Pong Game".

        PongGame pong = new PongGame(); // Création d'une instance de notre panneau personnalisé pour le jeu.
        // Ce panneau sera utilisé comme zone où le jeu sera dessiné et géré.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // Configuration pour que l'application se ferme proprement quand on clique sur le bouton de fermeture.

        frame.setSize(width, heigth); 
        // Dimensions de la fenêtre (largeur = 500 pixels, hauteur = 300 pixels). 
        // C'est suffisant pour notre jeu qui se déroulera dans cette zone.

        frame.add(pong); 
        // Ajout du panneau PongGame (JPanel) dans la fenêtre principale (JFrame).
        // Le panneau va gérer tout le contenu graphique du jeu.

        frame.setVisible(true); 
        // Rend la fenêtre visible à l'utilisateur. Par défaut, une fenêtre JFrame est invisible.
    }
}
