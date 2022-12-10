public class Test {
    public static void main(String[] args) {

        Pizzeria pizzaLoca = new Pizzeria("Pizza Loca");
        PizzaFactory fabrica = PizzaFactory.obtenerInstancia();

        PizzaSimple muzzarella = (PizzaSimple) fabrica.crearPizza(PizzaFactory.SIMPLE,"muzzarella",
                "la pisa mas rica" );
        muzzarella.setPrecioBase(700);
        muzzarella.setEspecial(false);

        PizzaSimple margarita = (PizzaSimple) fabrica.crearPizza(PizzaFactory.SIMPLE,"margarita",
                "la pizza de la margaret");
        margarita.setPrecioBase(850);
        margarita.setEspecial(true);

        PizzaSimple margarita2 = (PizzaSimple) fabrica.crearPizza(PizzaFactory.SIMPLE,"margarita",
                "la pizza de la margaret que no es especial");
        margarita.setPrecioBase(850);
        margarita.setEspecial(false);

        PizzaSimple anana = (PizzaSimple) fabrica.crearPizza(PizzaFactory.SIMPLE,"anana",
                "La pizza que no es pizza");
        anana.setPrecioBase(950);
        anana.setEspecial(false);

        PizzaCombinada combinadaLoca = (PizzaCombinada) fabrica.crearPizza(PizzaFactory.COMBINADA,
                "combinadaLoca","loca loca loca");
        combinadaLoca.agregarPizza(margarita2);
        combinadaLoca.agregarPizza(anana);

        pizzaLoca.incorporarAlMenu(muzzarella);
        pizzaLoca.incorporarAlMenu(anana);
        pizzaLoca.incorporarAlMenu(combinadaLoca);
        pizzaLoca.incorporarAlMenu(margarita);

        System.out.println(pizzaLoca.mostrarMenu());





        //Pizza combinada loca, que es mitad margarita y mitad ananá, cuyo cálculo de precio
        //nos debería arrojar 950 pesos.



    }
}