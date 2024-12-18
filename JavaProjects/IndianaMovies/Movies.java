class Movies {

    public static void main(String[] args){
        String[] indianaMoviesTitles =  {
            "Raiders of the Lost Ark",
            "Indiana Jones and the Temple of Doom",
            "Indiana Jones and the Last Crusade"
        };

        String[] actorsInRaidersOfTheLostArk = {
            "Harrison Ford",
            "Karen Allen",
            "Paul Freeman"
        };
        String[] actorsInTempleOfDoom = {
            "Harrison Ford",
            "Kate Capshaw",
            "Ke Huy Quan"
        };
        String[] actorsInLastCrusade = {
            "Harrison Ford",
            "Sean Connery",
            "Alison Doody"
        };

        String[][] actorsInIndianaMovies ={
            actorsInRaidersOfTheLostArk,
            actorsInTempleOfDoom,
            actorsInLastCrusade
        };

        int index =0;
        for (String title : indianaMoviesTitles) {
            System.out.println(":Dans le film "+ title + " , les principaux acteurs sont :");
            for (String actor : actorsInIndianaMovies[index]) {
                System.out.print(actor + ", ");
            }
            System.out.println();
            index ++;
        }

        // Seconde solution avec une boucle for classique
        for(int i=0; i< indianaMoviesTitles.length; i++){
            System.out.println();
            System.out.println(":Dans le film "+ indianaMoviesTitles[i] + " , les principaux acteurs sont :");
            for(int j =0; j<actorsInIndianaMovies[i].length; j++ ){
                System.out.println(actorsInIndianaMovies[i][j]);
            }
            System.out.println();
        }
    }
}