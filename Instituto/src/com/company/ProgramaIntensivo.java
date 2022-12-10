package com.company;

import java.util.ArrayList;

public class ProgramaIntensivo extends  OfertaAcademica{
    private double descuento;
    private ArrayList<OfertaAcademica> materias;

    public ProgramaIntensivo(String nombre, String descripcion) {
        super(nombre, descripcion);
        materias=new ArrayList<>();
    }

    public double calcularDescuento(double precio)
    {
        return precio*descuento/100;
    }
    @Override
    public double calcularPrecio() {
        double total=0;
        for(OfertaAcademica oferta: materias)
            total+= oferta.calcularPrecio();
        return total-calcularDescuento(total);
    }
    public String mostrar()
    {
        return super.mostrar() + " Precio: " +calcularPrecio();
    }
    public void agregarOferta(OfertaAcademica oferta)
    {
        materias.add(oferta);
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
