public class Pila {

    private Nodo tope;

    public Pila() {
        tope = null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void push(char dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public char pop() {
        if (estaVacia())
            return ' ';
        char valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    public char peek() {
        if (estaVacia())
            return ' ';
        return tope.dato;
    }

}