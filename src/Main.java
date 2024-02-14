import es.uah.matcomp.mp.clase.templates.Lista;

public class Main {
    public static void main(String[] args) {
        Lista<String> miLista = new Lista<String>();
        Lista<Long> miListaLongs = new Lista<Long>();

        miListaLongs.add(new Long(333));
        miListaLongs.add(444L);
        //miListaLongs.add("Tienequedarerror");

        miLista.add("Hola Mundo");
        // miLista.add(new Long(445));
        miLista.add("Esto es un mundo feliz");
        miLista.add("Tercera cadena");


        String cadena = miLista.del();
        while (cadena != null) {
            System.out.println(cadena);
            cadena = miLista.del();
        }

        Long x = miListaLongs.del();
        while (x != null) {
            System.out.println(x);
            x = miListaLongs.del();
        }


    }
}