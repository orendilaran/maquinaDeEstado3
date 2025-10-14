public class Horario {
    private int Horario = 8;

    public int getHorario(){
        return Horario;
    }
    public void ProximoCiclo(){
        Horario = Horario + 1;
        if (Horario == 24){
            Horario = 0;
        }
    }
    public void Display(){
        System.out.println(Horario+":00");
    }

}


