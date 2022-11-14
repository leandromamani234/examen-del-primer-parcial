import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Tema protocolos = new Tema("Seguridad");
        Tema armas = new Tema("Fantasia");

        List<Tema> seguridad = new ArrayList<>();
            seguridad.add(protocolos);
            seguridad.add(armas);

        /////////////////////////////////////////////////////

        Date hoy = new Date();
        Metadatos arch1 = new Metadatos(hoy, 2444.422,"AB123853433D-H");

        ///////////////////////////////////////////////////////

        Termino termino1 = new Termino("papa",32);
        Termino termino2 = new Termino("plantar",16);

        List<Termino> termList = new ArrayList<>();
        termList.add(termino1);
        termList.add(termino2);

        ///////////////////////////////////////////////////////////////////////////

        BaseDatos bas1 = new BaseDatos(531);


        Documento d1 = new Documento(5484733,"Principios Seguridad","www.google.com", termino1,arch1,seguridad,bas1);
        Documento d2 = new Documento(5484733,"Principios Seguridad","www.google.com", termino1,arch1,seguridad,bas1);

        List <Documento> documentoList1 = new ArrayList<>();
        documentoList1.add(d1);
        documentoList1.add(d2);
    }
}
