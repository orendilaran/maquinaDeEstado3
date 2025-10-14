public class Juca {
    private int hunger = 0;
    private int fatigue = 0;

    private State state = new Sleeping(this);

    public int getHunger() {
        return hunger;
    }

    public void addHunger(int hunger) {
        this.hunger += hunger;
        this.hunger = Math.max(this.hunger, 0);
    }

    public int getFatigue() {
        return fatigue;
    }

    public void addFatigue(int fatigue) {
        this.fatigue += fatigue;
        this.fatigue = Math.max(this.fatigue, 0);
    }

    public void update() {
        state.execute();
    }

    public void setState(State state) {
        this.state.leave();
        this.state = state;
        state.enter();
    }

    
}
