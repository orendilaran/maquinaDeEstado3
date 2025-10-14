public class CaminhadaCharlinho extends AbstractState {
    public CaminhadaCharlinho(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Hora de ir ao trabalho!");
    }

    @Override
    public void execute() {
        getJuca().addHunger(2);
        getJuca().addFatigue(5);
        printStats("Limpando o Caminhão...");

    }
}

