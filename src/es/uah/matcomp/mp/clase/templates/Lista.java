package es.uah.matcomp.mp.clase.templates;

public class Lista<TipoDeDatoLista> {
    Elemento<TipoDeDatoLista> ancla;

    public void add(TipoDeDatoLista o){
        Elemento el = new Elemento(o,this.ancla);
        this.ancla = el;
    }

    public TipoDeDatoLista del(){
        if (this.ancla == null)
            return null;

        Elemento<TipoDeDatoLista> el = this.ancla;
        this.ancla = el.getSiguiente();
        return el.getDato();
    }
}
