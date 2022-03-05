
public class StackDouble<T> extends Stacker<T> {
    public StackDouble() {
        this.InternalSotorage = new DoubleList();
    }

    @Override
    public void push(T item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T pull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
