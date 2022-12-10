import java.util.ArrayList;

public class Personaje {
    private String nombre;
    private ArrayList<Habilidad> suFuerza;

    public Personaje(String nombre) {
        this.nombre = nombre;
        suFuerza = new ArrayList<>();
    }

    public void incorporarASuFuerza(Habilidad habilidad){
        suFuerza.add(habilidad);
    }

    public String mostrarSuFuerza(){
        String total= "La fuerza del personaje "+nombre+" es:"+"\n";
        for (Habilidad i: suFuerza)
            total += i.mostrar() + "\n";
        return total;
    }



}
