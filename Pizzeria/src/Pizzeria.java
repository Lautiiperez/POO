import java.util.ArrayList;

public class Pizzeria {
    private String nombre;
    private ArrayList<Pizza> menu;


    //Constructor
    public Pizzeria(String nombre) {
        this.nombre = nombre;
        menu = new ArrayList<>();
    }

    //Agregar pizzas al menu
    public void incorporarAlMenu(Pizza pizza){
        menu.add(pizza);
    }

    public String mostrarMenu(){
        String datos= "Pizzeria: "+ nombre + "\n";
        for(Pizza i: menu)
           datos += i.mostrar() + "\n";
        return datos;
    }

}
