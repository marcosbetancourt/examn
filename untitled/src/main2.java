package interfaz;

import negocio.Dispositivo;

public class Main {
    public static void main(String[] args) {

        // 1. Crear dispositivo 1, Sensor A (Estado inicial activo)
        Dispositivo d1 = new Dispositivo(1, "Sensor A");

        // 2. Consultar resumen (Resultado: 1 | Sensor A | Activo)
        System.out.println("Consultar resumen: " + d1.obtenerResumen());

        // 3. Desactivar dispositivo (Resultado: true)
        System.out.println("Desactivar dispositivo: " + d1.desactivar());

        // 4. Desactivarlo nuevamente (Resultado: false)
        System.out.println("Desactivarlo nuevamente: " + d1.desactivar());

        // 5. Cambiar nombre a "" (Conserva el nombre anterior "Sensor A")
        d1.setNombre("");
        System.out.println("Resumen tras intento de cambio invalido: " + d1.obtenerResumen());

        // 6. Crear dos dispositivos válidos adicionales
        Dispositivo d2 = new Dispositivo(2, "Estacion B");
        Dispositivo d3 = new Dispositivo(3, "Router C");

        // 7. Verificar contador total de dispositivos creados
        System.out.println("Total de dispositivos creados: " + Dispositivo.getContadorDispositivos());
    }
}