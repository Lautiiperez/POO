package com.company;

import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<OfertaAcademica> oferta;

    public Instituto(String nombre) {
        this.nombre = nombre;
        oferta=new ArrayList<>();
    }

    public String generarInforme()
    {   String datos="Instituto: " + nombre + "\n";
        for (OfertaAcademica ofertaAcademica:oferta)
        {
            datos+=ofertaAcademica.mostrar() +"\n";
        }
        return datos;
    }
    public void incorporarOferta(OfertaAcademica ofertaAcademica)
    {
        oferta.add(ofertaAcademica);
    }
}
