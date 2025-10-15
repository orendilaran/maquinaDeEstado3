public abstract class AbstractState implements State {
    private Juca juca;
    public AbstractState(Juca juca) {
        this.juca = juca;
    }
    public AbstractState(Charlinho juca) {
        this.juca = juca;
    }
    public AbstractState(Joaozin juca) {
        this.juca = juca;
    }

    @Override
    public Juca getJuca() {
        return juca;
    }

    @Override
    public void printStats(String state) {
        System.out.println(state);
        System.out.println("Fome: "+ juca.getPreHunger() +" -->" +juca.getHunger());
        System.out.println("Cansaço: "+ juca.getPreFatigue() +" -->" + + juca.getFatigue());
    }

    @Override
    public void enter() {
    }

    @Override
    public void leave() {
    }
}
