public class Simple extends Habilidad{
    private double puntaje;

    public Simple(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public double calcularPuntaje() {
        if (getNombre().equals("Disparar"))
        return puntaje+5;
        return puntaje;
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " Puntaje: " + calcularPuntaje();
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }


}
