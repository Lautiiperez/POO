public class ServicioFactory {
    private static ServicioFactory instancia;

    private static final String SIMPLE = "S";
    private static final String COMBO = "C";


    private ServicioFactory() {
    }

    public static ServicioFactory obtenerInstancia(){
        if (instancia == null)
            instancia = new ServicioFactory();
        return instancia;
    }

    public Servicio crearServicio(String codigo, String nombre, String descripcion){
        switch (codigo){
            case "S": new Simple(nombre, descripcion);

            case "C": new ComboServicio(nombre, descripcion);
        }
        return null;
    }

}
