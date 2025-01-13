public class Parrot extends Animal {
    private boolean canTalk;

    public Parrot(String name,int size,int numberOfPaw, boolean canTalk ) {
        super(name,size,numberOfPaw);
        this.canTalk = canTalk;
    }

    @Override
    public String introduce() {
        return super.introduce() + " Et je " + (canTalk ? "sais " : "ne sais pas ") + "parler !";
    }
}
