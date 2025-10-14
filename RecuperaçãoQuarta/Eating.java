public class Eating extends AbstractState {

    public Eating(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Bateu uma fome...");
    }

    @Override
    public void leave() {
        System.out.println("Ufa! Já estou cheio...");
    }

    @Override
    public void execute() {
        getJuca().addHunger(-5);
        printStats("Comendo...");

        if(getJuca().getHunger() <= 0) {
            getJuca().setState(new Working(getJuca()));
        }
    }
}
