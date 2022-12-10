public class Simple extends Servicio{
        private double precioBase;
        private boolean colocacion;

    public Simple(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    //Metodo heredado
    @Override
    public String mostrar() {
        return super.mostrar() + ", Precio: $"+ calcularPrecio();
    }

    //Metodo Sobreescrito
    @Override
    public double calcularPrecio() {
        if(colocacion)
            return precioBase*0.1;
        return precioBase;
    }
}
