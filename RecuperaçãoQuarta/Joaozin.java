public class Joaozin extends Juca{
    private boolean Na_Escola = false;
    private boolean acordou = true;
    @Override
    public void update() {
        System.out.println("-------Joaozin-------");
        state.execute();
        if(Main.getRelogio().getHorario() > 7 && Main.getRelogio().getHorario() < 14){ //  MANHA, em Casa antes de ir escola
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
        if(Main.getRelogio().getHorario() > 13&& Main.getRelogio().getHorario() < 19){ //  TARDE, indo e estando na escola
            if (getHunger() > 25){
                    System.out.println("indo almoçar");
                    setState(new Eating(this)); 
                }
            else{
                if (Na_Escola == false){
                    setState(new Andando(this));
                    flipNa_Escola();
                }
                else{
                    setState(new Estudando(this));
                };
            }
        }
        if(Main.getRelogio().getHorario() > 18 && Main.getRelogio().getHorario() < 24){ //  NOITE em Casa Depois de ir escola
            if (Na_Escola == true){
                setState(new Andando(this));
                flipNa_Escola();
            }
            else{
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
        }
        if(Main.getRelogio().getHorario() >= 0 && Main.getRelogio().getHorario() < 8){ //  MUITO TARDE
            setState(new Sleeping(this));
            acordou = false;
        }
    }
    public boolean getNa_Escola(){
        return Na_Escola;
    }
    public void flipNa_Escola(){
        Na_Escola = !Na_Escola;
    }
}
