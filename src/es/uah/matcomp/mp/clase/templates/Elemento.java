package es.uah.matcomp.mp.clase.templates;

public class Elemento<TipoDelDato> {

    TipoDelDato dato;
    Elemento siguiente;

    public Elemento(TipoDelDato dato, Elemento siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public TipoDelDato getDato() {
        return dato;
    }

    public Elemento<TipoDelDato> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Elemento<TipoDelDato> siguiente) {
        this.siguiente = siguiente;
    }
}
