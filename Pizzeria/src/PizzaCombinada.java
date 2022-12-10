import java.util.ArrayList;

public class PizzaCombinada extends Pizza{
    private ArrayList<Pizza> pizzas;


    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    //Metodo sobreescrito
    @Override
    public String mostrar() {
        return super.mostrar() + ", Precio: $"+ calcularPrecio();
    }

    //Metodo Heredado
    @Override
    public double calcularPrecio() {
        double aux = 0;
        for(Pizza i: pizzas) {
            // necesito ingresar al precio de cada una: i.calcularPrecio()
            if (aux < i.calcularPrecio())
                aux=i.calcularPrecio();
        }
        return aux;
    }

    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }
}
