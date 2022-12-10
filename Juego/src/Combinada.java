import java.util.ArrayList;

public class Combinada extends Habilidad{
    private int multiplicador;
    private ArrayList<Habilidad> habilidades;

    public Combinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        habilidades = new ArrayList<>();
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " Puntaje: " + calcularPuntaje();
    }

    public void agregarHabilidad(Habilidad habilidad){
    habilidades.add(habilidad);
    }

    @Override
    public double calcularPuntaje() {
        double suma = 0;
        for (Habilidad i: habilidades)
            suma +=i.calcularPuntaje();

        return (suma /(habilidades.size()))*multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
}
