package com.exkevin.limiteDeTarjeta.Principal;

import com.exkevin.limiteDeTarjeta.Entidad.Compra;
import com.exkevin.limiteDeTarjeta.Entidad.TarjetaDeCredito;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Se podra realizar el commi?dsdssd
        var entrada = new Scanner(System.in);

        var valortotal = 0.0;
        var descripcion = "";
        var valor = 0.0;

        Compra compra;
        var bandera = false;

        System.out.print("Escriba el limite de la tarjeta: ");
        valortotal = entrada.nextDouble();
        entrada.nextLine();
        var tarjetaCredito = new TarjetaDeCredito(valortotal);


        while(!bandera){
            System.out.print("Escriba la descripción de la compra: ");
            descripcion = entrada.nextLine();
            System.out.print("Escriba el valor de la compra: ");
            valor = entrada.nextInt();
            entrada.nextLine();
            compra = new Compra(descripcion,valor);

            bandera =  tarjetaCredito.realizarCompra(compra);

            if(!bandera){
                System.out.print("Escriba 0 para salir o 1 para continuar ->");

                int continuar = entrada.nextInt();
                entrada.nextLine();
                if(continuar==1){

                }else{
                    System.out.println("Compra finalizado !!!!");
                    bandera = true;
                }

                System.out.println();
            }
            else {
                System.out.println("\nAlcanzaste el limite de tu saldo !!!!");
                bandera = true;
            }
        }

        Collections.sort(tarjetaCredito.getListaDeCompra());

        System.out.println("\n******************Compra Finalizada******************\n");

        for (Compra compras: tarjetaCredito.getListaDeCompra() ) {
            System.out.println(compras);
        }

        System.out.println("\n******************************************************");





    }
}
