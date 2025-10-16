public class Brincando extends AbstractState {

    public Brincando(Juca juca) {
        super(juca);
    }
    @Override
    public void enter() {
        System.out.println("Bora brincar...");
    }

    @Override
    public void execute() {
        getJuca().addHunger(3);
        getJuca().addFatigue(7);
        printStats("Brincando...");

    }
}
