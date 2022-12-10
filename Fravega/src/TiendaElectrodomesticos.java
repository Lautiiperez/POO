import java.util.ArrayList;

public class TiendaElectrodomesticos {
    private String razonSocial;
    private ArrayList<Servicio> stock;

    public TiendaElectrodomesticos(String razonSocial) {
        this.razonSocial = razonSocial;
        stock = new ArrayList<>();
    }

    public String mostrarStock(){
        String datos = "El stock de" + razonSocial + "\n";
        for (Servicio i: stock)
            datos += i.mostrar() + "\n";
        return datos;
    }

}
