package com.company;

public class Curso extends OfertaAcademica{
    private double precioHora;
    private int cargaHoraria;
    private int duracionMeses;

    public Curso(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    @Override
    public double calcularPrecio() {
        return cargaHoraria*duracionMeses*precioHora;
    }

    public String mostrar()
    {
        return super.mostrar() + " Precio: " + calcularPrecio();
    }
    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }
}
