public class PizzaSimple extends Pizza{
    private double precioBase;
    private boolean especial;


    public PizzaSimple(String nombre, String descripcion) {
        super(nombre, descripcion);
    }




    //Metodo sobreescrito -generar -> O:metodo
    @Override
    public String mostrar() {
        return super.mostrar() + ", Precio: $"+ calcularPrecio();
    }

    //Metodo heredado
    @Override
    public double calcularPrecio() {
        if(especial)
            return precioBase * 1.7;
        return precioBase;
    }

    //Setters
    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}
