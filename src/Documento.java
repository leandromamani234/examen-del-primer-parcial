import java.util.List;

public class Documento
{
    int idDocumento;
    String titulo, url;
    List<Termino> clasifTerminos;
    Metadatos meta;
    List<Tema> tema;
    BaseDatos nroPalabras;

    public Documento(int idDocumento, String titulo, String url, Termino clasifTerminos, Metadatos meta, List<Tema> tema, BaseDatos nroPalabras) {
        this.idDocumento = idDocumento;
        this.titulo = titulo;
        this.url = url;
        this.clasifTerminos = (List<Termino>) clasifTerminos;
        this.meta = meta;
        this.tema = tema;
        this.nroPalabras = nroPalabras;
    }

}

