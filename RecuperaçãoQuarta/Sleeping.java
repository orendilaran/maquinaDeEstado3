public class Sleeping extends AbstractState {

    public Sleeping(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Bateu um sono...");
    }

    @Override
    public void execute() {
        getJuca().addHunger(1);
        getJuca().addFatigue(-10);
        printStats("Dormindo...");

        if (getJuca().getFatigue() <= 0) {
            if (getJuca().getHunger() <= 10) {
                getJuca().setState(new Working(getJuca()));
            } else {
                getJuca().setState(new Eating(getJuca()));
            }
        }
    }
}
