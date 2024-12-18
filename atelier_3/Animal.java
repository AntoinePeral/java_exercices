public class Animal {

    // ATTRIBUTES
    private String name;
    private int size;
    private int numberOfPaw;
    private boolean carnivorous;

    public Animal(String name,int size,int numberOfPaw ){
        this.name = name;
        this.size = size;
        this.numberOfPaw = numberOfPaw;
        this.carnivorous = false;
    }

    public Animal(String name,int size,int numberOfPaw, boolean isCarnivorous ){
        this.name = name;
        this.size = size;
        this.numberOfPaw = numberOfPaw;
        this.carnivorous = isCarnivorous;
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
        return this.carnivorous;
    }

    public void setIsCarnivorous(boolean isCarnivorous){
        this.carnivorous = isCarnivorous;
    }

    public String introduce(){
       return "Hey, en tant que " + this.getName() + ", j'ai " + this.getNumberOfPaw() + " pattes et "
       + (this.isCarnivorous()? "je suis " : "je ne suis pas ")
       + "carnivore.";
    }

    public boolean isDangerous(){
        return this.getSize()>50 && this.isCarnivorous();
    }

}