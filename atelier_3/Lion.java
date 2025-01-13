public class Lion extends Animal {
    private boolean isAlpha;

    public Lion(String name, int size, int numberOfPaw, boolean isCarnivorous, boolean isAlpha) {
        super(name,size, numberOfPaw,  isCarnivorous);
        this.isAlpha = isAlpha;
    }

    @Override
    public String introduce() {
        return super.introduce() + " Et je " + (isAlpha? "suis ": "ne suis pas ") +"un chef de meute.";
    }
}
