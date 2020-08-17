package ejercicio5;

import java.util.NoSuchElementException;
import java.util.Iterator;


class Iterador implements Iterator {
    private int cursor;
    private final int end;
    private final int start;

    public Iterador(int inicio, int fin) {
        this.cursor = inicio;
        this.end = fin;
        this.start = inicio;
    }
    
    @Override
    public boolean hasNext() {
        return this.cursor < this.end;
    }

    @Override
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
    return cursor++;
    }

    public boolean hasPrevious() {
        return this.cursor > this.start;
    }

    public Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
    return cursor--;
    }



}
