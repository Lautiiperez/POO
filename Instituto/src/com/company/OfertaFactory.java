package com.company;

public class OfertaFactory {
    private static OfertaFactory instancia;
    public final static String CURSO="C";
    public final static String PROGRAMA_INTENSIVO="P";
    private OfertaFactory() {
    }

    public static  OfertaFactory obtenerInstancia()
    {
        if (instancia==null)
            instancia=new OfertaFactory();
        return instancia;
    }
    public OfertaAcademica crearOferta(String codigo, String nombre, String descripcion)
    {
        switch (codigo)
        {
            case "C":
                return new Curso(nombre, descripcion);
            case "P":
                return new ProgramaIntensivo(nombre, descripcion);
        }
        return null;
    }
}
