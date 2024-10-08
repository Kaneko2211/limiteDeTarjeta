package com.exkevin.limiteDeTarjeta.Entidad;

public class Compra implements Comparable<Compra>{

    private String Descripcion;
    private double valor;

    public Compra(String descripcion, double valor) {
        Descripcion = descripcion;
        this.valor = valor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Descripcion: ").append(Descripcion).append(" -");
        sb.append(" Valor: ").append(valor);
        sb.append(' ');
        return sb.toString();
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}
