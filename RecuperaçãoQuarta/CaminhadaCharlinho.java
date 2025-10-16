public class CaminhadaCharlinho extends AbstractState {
    public CaminhadaCharlinho(Juca juca) {
        super(juca);
    }

    @Override
    public void enter() {
        System.out.println("Esta na Hora da Jornada Para Escola");
    }

    @Override
    public void execute() {
        getJuca().addHunger(1);
        getJuca().addFatigue(4);
        printStats("Limpando o Caminhão...");

    }
}

