package negocio;

public class Dispositivo {
    private int id;
    private String nombre;
    private boolean activo;
    private static int contadorDispositivo = 0;

    public Dispositivo(int id, String nombre) {

        if (id > 0 && nombre != null && !nombre.trim().isEmpty()) {
            this.id = id;
            this.nombre = nombre;
            this.activo = true;
            contadorDispositivo++;
        } else {

            this.id = id > 0 ? id : 1;
            this.nombre = (nombre != null && !nombre.trim().isEmpty()) ? nombre : "Dispositivo Base";
            this.activo = true;
            contadorDispositivo++;
        }
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public static int getContadorDispositivos() {
        return contadorDispositivo;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public boolean desactivar() {
        if (this.activo) {
            this.activo = false;
            return true;
        }
        return false;
    }


    public String obtenerResumen() {
        String estadoTexto = this.activo ? "Activo" : "Inactivo";
        return this.id + " | " + this.nombre + " | " + estadoTexto;
    }
}
