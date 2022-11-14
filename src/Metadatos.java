import java.util.Date;

public class Metadatos
{
    Date ultActualizacion;
    Double tamañoArchivo;
    String hash;

    public Metadatos(Date ultActualizacion, Double tamañoArchivo, String hash) {
        this.ultActualizacion = ultActualizacion;
        this.tamañoArchivo = tamañoArchivo;
        this.hash = hash;
    }
}
