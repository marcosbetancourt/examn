package negocio;

public class Dispositivo {

    // Atributos privados de instancia y de clase
    private int id;
    private String nombre;
    private boolean activo;
    private static int contadorDispositivos = 0;

    // Constructor
    public Dispositivo(int id, String nombre) {
        // Validaciones en la creación
        if (id > 0 && nombre != null && !nombre.trim().isEmpty()) {
            this.id = id;
            this.nombre = nombre;
            this.activo = true; // Todo dispositivo nuevo comienza activo
            contadorDispositivos++; // Aumenta solo si el objeto se crea correctamente
        } else {
            // Valores por defecto seguros si los datos iniciales son inválidos
            this.id = id > 0 ? id : 1;
            this.nombre = (nombre != null && !nombre.trim().isEmpty()) ? nombre : "Dispositivo Base";
            this.activo = true;
            contadorDispositivos++;
        }
    }

    // Getters necesarios
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    // Consulta del contador global sin necesidad de instancia
    public static int getContadorDispositivos() {
        return contadorDispositivos;
    }

    // Setter de nombre con validación (si es inválido conserva el anterior)
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    // Método utilitario: desactivar()
    public boolean desactivar() {
        if (this.activo) {
            this.activo = false;
            return true; // Estaba activo y fue desactivado
        }
        return false; // Ya estaba inactivo
    }

    // Método utilitario: obtenerResumen()
    public String obtenerResumen() {
        String estadoTexto = this.activo ? "Activo" : "Inactivo";
        return this.id + " | " + this.nombre + " | " + estadoTexto;
    }
}