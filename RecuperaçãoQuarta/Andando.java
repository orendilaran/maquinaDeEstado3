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
        getJuca().addFatigue(3);
        printStats("Andando...");
    }
}
