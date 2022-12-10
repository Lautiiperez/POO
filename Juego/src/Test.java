public class Test {
    public static void main(String[] args) {

        Personaje pikachu = new Personaje("Pikachu");
        HabilidadFactory fabrica = HabilidadFactory.obtenerInstancia();

        Simple saltar = (Simple) fabrica.crearHabilidad(HabilidadFactory.SIMPLE,"saltar",
                "El personaje salta" );
        saltar.setPuntaje(7.5);


        Simple disparar = (Simple) fabrica.crearHabilidad(HabilidadFactory.SIMPLE,"Disparar",
                "El personaje dispara" );
        disparar.setPuntaje(10);

        Combinada disparoAlSaltar = (Combinada) fabrica.crearHabilidad(HabilidadFactory.COMBINADA,
                "Disparo-al-saltar","El personaje salta y Dispara");
        disparoAlSaltar.agregarHabilidad(saltar);
        disparoAlSaltar.agregarHabilidad(disparar);
        disparoAlSaltar.setMultiplicador(4);

        pikachu.incorporarASuFuerza(saltar);
        pikachu.incorporarASuFuerza(disparar);
        pikachu.incorporarASuFuerza(disparoAlSaltar);

        System.out.println(pikachu.mostrarSuFuerza());

    }
}