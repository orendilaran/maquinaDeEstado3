public class Charlinho extends Juca{
    private int progresso = 0;
    private boolean acordou = true;
    @Override
    public void update() {
        System.out.println("------Charlinho------");
        state.execute();
        if(Main.getRelogio().getHorario() > 7 && Main.getRelogio().getHorario() < 13){ //  MANHA, em Casa antes de ir escola
            if (getFatigue() < 0 && acordou == false){
                acordou = true;}
            if (acordou == true){
                if (getHunger() > 15){
                    setState(new Eating(this));
                }
                else{
                    setState(new Brincando(this));
                }
            }
            
        }
        if(Main.getRelogio().getHorario() > 12&& Main.getRelogio().getHorario() < 19){ //  TARDE, indo e estando na escola
            if (getHunger() > 25 && progresso < 3){
                    System.out.println("indo almoçar");
                    setState(new Eating(this)); 
                }
            else{
                setState(new CaminhadaCharlinho(this));
                progresso += 1;
            }
            if (progresso == 3){
                setState(new Estudando(this));
            }
        }
        if(Main.getRelogio().getHorario() > 18 && Main.getRelogio().getHorario() < 22){
            setState(new CaminhadaCharlinho(this));
        }
        if(Main.getRelogio().getHorario() > 21 && Main.getRelogio().getHorario() < 24){ //  NOITE em Casa Depois de ir escola
            if (getHunger() > 15){
                setState(new Eating(this));
            }
            else {
            if (getFatigue() > 100){
                setState(new Sleeping(this));
            }
            else {
                setState(new Brincando(this));
            }
            }
        }
        if(Main.getRelogio().getHorario() >= 0 && Main.getRelogio().getHorario() < 8){ //  MUITO TARDE
            setState(new Sleeping(this));
            acordou = false;
        }
    }
}
