public class Animal {

    // ATTRIBUTES
    private String name;
    private int size;
    private int numberOfPaw;
    private boolean isCarnivorous = false;

    public Animal(String name,int size,int numberOfPaw ){
        this.name = name;
        this.size = size;
        this.numberOfPaw = numberOfPaw;
    }

    public Animal(String name,int size,int numberOfPaw, boolean isCarnivorous ){
        this.name = name;
        this.size = size;
        this.numberOfPaw = numberOfPaw;
        this.isCarnivorous = isCarnivorous;
    }

    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int newSize){
        this.size = newSize;
    }

    public int getNumberOfPaw(){
        return this.numberOfPaw;
    }

    public void setNumberOfPaw(int newNumberOfPaw){
        this.numberOfPaw = newNumberOfPaw;
    }

    public boolean isCarnivorous (){
        return this.isCarnivorous;
    }

    public void setIsCarnivorous(boolean isCarnivorous){
        this.isCarnivorous = isCarnivorous;
    }

    public String introduce(){
       return "Hey, en tant que " + this.getName() + ", j'ai " + this.getNumberOfPaw() + " pattes et "
       + (this.isCarnivorous()? "je suis carnivore." : "je ne suis pas carnivore");
    }

    public boolean isDangerous(){
        return this.getSize()>50 && this.isCarnivorous()? true : false;
    }

    public static void main(String[] args) {
        Animal lion = new Animal("Lion", 105, 4, true);
        Animal perroquet = new Animal("Perroquet", 50, 2);

        System.out.println(lion.introduce());
        System.out.println("Est ce que "+ lion.getName() + " est dangereux ? "+ (lion.isDangerous()));
        System.out.println(perroquet.introduce());
        System.out.println("Est ce que "+ perroquet.getName() + " est dangereux ? "+ (perroquet.isDangerous()));
    }
}