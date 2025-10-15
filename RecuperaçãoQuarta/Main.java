public class Main {
    
    static Horario Horario = new Horario();
        
public static void main(String[] args) {
            Juca Charlinho = new Charlinho();
            Juca Joaozin = new Joaozin();
        while(true) {
            getRelogio().Display();
            Charlinho.update();
            Joaozin.update();
            getRelogio().ProximoCiclo();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public static Horario getRelogio(){
            return Horario;
        }
}
