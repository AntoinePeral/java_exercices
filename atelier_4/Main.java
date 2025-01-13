public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Lion", 105, 4, true, true);
        Parrot perroquet = new Parrot("Perroquet", 50, 2, true);

        System.out.println(lion.introduce());
        System.out.println("Le "+ lion.getName()  + (lion.isDangerous()? " est un " : " n'est pas un ") + "animal dangereux");
        System.out.println(lion.hunt());
        System.out.println(lion.hunt());
        System.out.println(lion.hunt());

        System.out.println(perroquet.introduce());
        System.out.println("Le "+ perroquet.getName()  + (perroquet.isDangerous()? " est un " : " n'est pas un ") + "animal dangereux");
        System.out.println(perroquet.fly());
        System.out.println(perroquet.fly());
    }
}
