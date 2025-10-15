public class Andando extends AbstractState {

    public Andando(Juca juca) {
        super(juca);
    }
    @Override
    public void enter() {
        System.out.println("Tenho que ir...");
    }

    @Override
    public void execute() {
        getJuca().addHunger(1);
        getJuca().addFatigue(3);
        printStats("Andando...");
    }
}
