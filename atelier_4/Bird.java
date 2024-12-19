public abstract class Bird extends Animal {

    public Bird(String name,int size,int numberOfPaw ) {
        super(name,size,numberOfPaw);
    }

    public abstract String fly();
    public abstract boolean isFlying();
    public abstract void setFlying(boolean flying);
}
