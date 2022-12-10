import java.util.ArrayList;

public class ComboServicio extends Servicio{
    private double descuento;
    private ArrayList<Servicio> servicios;


    public ComboServicio(String nombre, String descripcion) {
        super(nombre, descripcion);
        servicios = new ArrayList<>();
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", Precio: $"+ calcularPrecio();
    }

    @Override
    public double calcularPrecio() {
        double total= 0;
        for (Servicio i : servicios)
            total += i.calcularPrecio();
        return total-(descuento*0.1);
    }

    public void agregarServicio(Servicio servicio){
        servicios.add(servicio);
    }


}
