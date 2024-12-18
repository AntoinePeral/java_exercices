// L’idée est de créer un programme pour calculer quelle quantité d'ingrédients tu as besoin pour faire un quatre-quarts :
// Crée une classe Recipe avec une méthode main().
// Déclare une variable quantity pour stocker la quantité de chaque ingrédient (pour info, tu utilises la même quantité pour chaque ingrédient du quatre-quarts.).
// Déclare une variable cookingTime pour représenter le temps de cuisson en minutes.
// Déclare une variable temperature pour représenter la température de cuisson.
// Déclare une arrayList pour stocker les 4 ingrédients nécessaires à la recette (exemple : "farine", "sucre", "beurre", "œufs")
// Affiche dans la console le texte suivant pour chaque ingrédient :
// " - 125g de farine"
// À la fin du programme, affiche un message dans la console indiquant le temps et la température de cuisson. Exemple :
// "Place ton plat au four pendant X minutes à X degrés”

import java.util.ArrayList;

class Recipe {

    public static void main(String[] args){
        short quantity = 125;
        byte cookingTime = 25;
        short temperature = 180;
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("farine");
        ingredients.add("sucre");
        ingredients.add("beurre");
        ingredients.add("oeufs");

        System.out.println("Pour cette recette nous avons besoin de :");
        for (String ingredient : ingredients) {
            System.out.println("- "+ quantity+ "g de "+ingredient);
        }
        System.out.println("Place ton plat au four pendant "+ cookingTime+ " minutes à "+ temperature+  " degrés");
    }
}