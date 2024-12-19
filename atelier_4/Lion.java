public class Lion extends Animal implements Carnivorous {
    private final boolean isAlpha;
    private boolean hunt;
    private boolean hungry;

    public Lion(String name, int size, int numberOfPaw, boolean isCarnivorous, boolean isAlpha) {
        super(name,size, numberOfPaw,  isCarnivorous);
        this.isAlpha = isAlpha;
        this.hunt = false;
        this.hungry = true;
    }


    @Override
    public String introduce() {
        return super.introduce() + " Et je " + (this.isAlpha()? "suis ": "ne suis pas ") +"un chef de meute.";
    }

    @Override
    public String hunt() {
        if(this.isHungry() && !this.isHunting()) {
            this.setHunting();
            this.setHungry();
            return "Le lion est affamé et part en chasse.";
        } else{
            this.setHunting();
            this.setHungry();
            return "Le lion est rassasié.";
        }
    }

    @Override
    public boolean isHunting() {
        return this.hunt;
    }

    @Override
    public void setHunting() {
        this.hunt = !this.hunt;
    }

    public boolean isHungry(){
       return this.hungry;
    }
    public void setHungry(){
        this.hungry = !this.hungry;
    }

    public boolean isAlpha(){
        return this.isAlpha;
    }

}
