public class Estudando extends AbstractState {

    public Estudando(Juca juca) {
        super(juca);
    }
    @Override
    public void enter() {
        System.out.println("Hora da Aula...");
    }

    @Override
    public void execute() {
        getJuca().addHunger(3);
        getJuca().addFatigue(2);
        printStats("Estudando...");
    }
}
