public class Charlinho extends Juca{

    @Override
    public void update() {
        if(Main.getRelogio().getHorario() < 7 && Main.getRelogio().getHorario() < 13){ //  MANHA, em Casa antes de ir escola
            if (getFatigue() < 20){
                if (getHunger() > 15){
                    setState(new Eating(this));
                }
                else{
                    setState(new Brincando(this));
                }
            }
            
        }
        if(Main.getRelogio().getHorario() < 12&& Main.getRelogio().getHorario() < 19){ //  TARDE, indo e estando na escola
            if (getHunger() > 5){
                    System.out.println("indo almoçar");
                    setState(new Eating(this)); 
                }
            else{
                setState(new CaminhadaCharlinho(this));
            }
        }
        if(Main.getRelogio().getHorario() < 21 && Main.getRelogio().getHorario() < 24){ //  NOITE em Casa Depois de ir escola
            if (getHunger() > 15){
                setState(new Eating(this));
            }
            else {
            if (getFatigue() > 70){
                setState(new Sleeping(this));
            }
            else {
                setState(new Brincando(this));
            }
            }
        }
        if(Main.getRelogio().getHorario() <= 0 && Main.getRelogio().getHorario() < 8){ //  MUITO TARDE
            setState(new Sleeping(this));
        }
    }
}
