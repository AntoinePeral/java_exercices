public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Lion", 105, 4, true);
        Animal perroquet = new Animal("Perroquet", 50, 2);

        System.out.println(lion.introduce());
        System.out.println("Le "+ lion.getName()  + (lion.isDangerous()? " est un " : " n'est pas un ") + "animal dangereux");
        System.out.println(perroquet.introduce());
        System.out.println("Le "+ perroquet.getName()  + (perroquet.isDangerous()? " est un " : " n'est pas un ") + "animal dangereux");
    }
}
