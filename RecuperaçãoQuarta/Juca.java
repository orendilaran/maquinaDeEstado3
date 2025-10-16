public class Juca {
    private int hunger = 0;
    private int fatigue = 0;
    private int PreviewHunger =0;
    private int PreviewFatigue =0;

    protected State state = new Sleeping(this);

    public int getHunger() {
        return hunger;
    }

    public void addHunger(int hunger) {
        this.PreviewHunger = this.hunger;
        this.hunger += hunger;
        this.hunger = Math.max(this.hunger, 0);
    }

    public int getFatigue() {
        return fatigue;
    }

    public void addFatigue(int fatigue) {
        this.PreviewFatigue = this.fatigue;
        this.fatigue += fatigue;
        this.fatigue = Math.max(this.fatigue, 0);
    }

    public void update() {
        state.execute();
    }

    public void setState(State state) {
        if (this.state != state){
        this.state.leave();
        this.state = state;
        state.enter();}
    }
    public int getPreFatigue() {
        return PreviewFatigue;
    }
    public int getPreHunger() {
        return PreviewHunger;
    }
    public int getPreFatigue() {
        return PreviewFatigue;
    }
    public int getPreHunger() {
        return PreviewHunger;
    }
}
