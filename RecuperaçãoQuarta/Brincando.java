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
        getJuca().addHunger(1);
        getJuca().addFatigue(-10);
        printStats("Brincando...");

    }
}
