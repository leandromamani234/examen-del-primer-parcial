import java.util.List;

public class Termino
{
    String termino;
    int frecuenciaTermino;
    List<Documento> documento;

    public Termino(String termino, int frecuenciaTermino) {
        this.termino = termino;
        this.frecuenciaTermino = frecuenciaTermino;
    }
}
