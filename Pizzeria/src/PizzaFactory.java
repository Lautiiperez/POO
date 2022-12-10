public class PizzaFactory {
    private static PizzaFactory instancia;
    public static final String SIMPLE = "S";
    public static final String COMBINADA = "C";

    private PizzaFactory() {
    }

    //iniciar instancia
    public static PizzaFactory obtenerInstancia(){
        if(instancia == null)
            instancia = new PizzaFactory();
        return instancia;
    }

    //Fabrica de Pizzas
    public Pizza crearPizza (String codigo, String nombre, String descripcion){
        switch (codigo) {
            case "S":
                return new PizzaSimple(nombre, descripcion);
            case "C":
                return new PizzaCombinada(nombre, descripcion);
        }
        return null;
    }

}
