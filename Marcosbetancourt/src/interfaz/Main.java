package interfaz;

import negocio.Dispositivo;

public class Main {
    static void main() {

        Dispositivo d1 = new Dispositivo(1, "Sensor A");

        System.out.println("Consultar resumen: " + d1.obtenerResumen());


        System.out.println("Desactivar dispositivo: " + d1.desactivar());


        System.out.println("Desactivarlo nuevamente: " + d1.desactivar());

        d1.setNombre("");
        System.out.println("Resumen tras intento de cambio invalido: " + d1.obtenerResumen());

        Dispositivo d2 = new Dispositivo(2, "Estacion B");
        Dispositivo d3 = new Dispositivo(3, "Router C");


        System.out.println("Total de dispositivos creados: " + Dispositivo.getContadorDispositivos());

    }

}