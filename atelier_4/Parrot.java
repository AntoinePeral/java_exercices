public class Parrot extends Bird {
    private final boolean canTalk;
    private boolean flying;

    public Parrot(String name,int size,int numberOfPaw, boolean canTalk ) {
        super(name,size,numberOfPaw);
        this.canTalk = canTalk;
        this.flying = false;
    }

    @Override
    public String introduce() {
        return super.introduce() + " Et je " + (canTalk ? "sais " : "ne sais pas ") + "parler !";
    }

    @Override
    public String fly() {
        if(this.isFlying()){
            return "Le perroquet vole.";
        } else{
            this.setFlying(true);
            return "Le perroquet s'envole.";
        }
    }

    @Override
    public boolean isFlying() {
        return this.flying;
    }

    @Override
    public void setFlying(boolean flying) {
        this.flying = flying;
    }
}
