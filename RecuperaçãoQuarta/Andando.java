public class Andando extends AbstractState {

    public Andando(Juca juca) {
        super(juca);
    }
    @Override
    public void enter() {
        System.out.println("Bora Se Movimentar...");
    }

    @Override
    public void execute() {
        getJuca().addHunger(1);
        getJuca().addFatigue(-10);
        printStats("Andando...");

        if (getJuca().getFatigue() <= 0) {
            if (getJuca().getHunger() <= 10) {
                getJuca().setState(new Working(getJuca()));
            } else {
                getJuca().setState(new Eating(getJuca()));
            }
        }
    }
}
