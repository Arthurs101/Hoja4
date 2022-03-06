
public class StackDouble<T> extends Stacker<T> {
    public StackDouble() {
        this.InternalSotorage = new DoubleList();
    }

    @Override
    public void push(T item) {
        DoubleList<T> listaInterna =  (DoubleList) InternalSotorage; 
        listaInterna.InsertAtStart(item);
    }

    @Override
    public T pull() {
        DoubleList<T> listaInterna =  (DoubleList) InternalSotorage;  
        return (T) listaInterna.Delete(0);
    }

    @Override
    public T peek() {
        DoubleList<T> listaInterna =  (DoubleList) InternalSotorage; 
        return (T) listaInterna.Get(0);
    }

    @Override
    public boolean empty() {
        DoubleList<T> listaInterna =  (DoubleList) InternalSotorage; 
        return listaInterna.IsEmpty();
    }

    @Override
    public int size() {
        DoubleList<T> listaInterna =  (DoubleList) InternalSotorage; 
        return listaInterna.Count();
    }
}
