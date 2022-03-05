/*
Proporcionado por Moises 
*/
public class StackSimple<T> extends Stacker<T> {

    public StackSimple() {
        this.InternalSotorage = new SimpleList();
    }

    @Override
    public void push(T item) {
        SimpleList listaInterna =  (SimpleList) InternalSotorage; 
        listaInterna.InsertAtStart(item);
    }

    @Override
    public T pull() {
        SimpleList listaInterna =  (SimpleList) InternalSotorage; 
        return (T) listaInterna.Delete(0);
    }

    @Override
    public T peek() {
        SimpleList listaInterna =  (SimpleList) InternalSotorage; 
        return (T) listaInterna.Get(0);
    }

    @Override
    public boolean empty() {
        SimpleList listaInterna =  (SimpleList) InternalSotorage; 
        return listaInterna.IsEmpty();
    }

    @Override
    public int size() {
        SimpleList listaInterna =  (SimpleList) InternalSotorage; 
        return listaInterna.Count();
    }
    
}
