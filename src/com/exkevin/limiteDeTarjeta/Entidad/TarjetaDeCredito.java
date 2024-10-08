package com.exkevin.limiteDeTarjeta.Entidad;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {


    private double limite;
    private double saldo;
    private List<Compra> listaDeCompra;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        //this.saldo = limite;
        this.listaDeCompra = new ArrayList<>();
    }

    public boolean realizarCompra(Compra compra){
        if(this.limite >= compra.getValor()){

            this.limite-=compra.getValor();
            this.listaDeCompra.add(compra);
            return false;

        }else{
            return true;
        }
    }

    public double getLimite() {
        return limite;
    }

    /*public double getSaldo() {
        return saldo;
    }*/

    public List<Compra> getListaDeCompra() {
        return listaDeCompra;
    }
}
