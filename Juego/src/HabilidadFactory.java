public class HabilidadFactory {
    private static HabilidadFactory instancia;
    public static final String SIMPLE = "S";
    public static final String COMBINADA = "C";

    private HabilidadFactory() {
    }

    public static HabilidadFactory obtenerInstancia(){
        if(instancia == null)
            instancia = new HabilidadFactory();
        return instancia;
    }


    public Habilidad crearHabilidad (String codigo, String nombre, String descripcion){
        switch (codigo) {
            case "S":
                return new Simple(nombre, descripcion);
            case "C":
                return new Combinada(nombre, descripcion);
        }
        return null;
    }


}
