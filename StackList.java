
import java.util.ArrayList;

/*
 Stack con ArrayList
 */
public class StackList<T> extends Stacker<T> {
   
    public StackList() {
        this.InternalSotorage = new ArrayList<T>();
       
        
    }
    
    @Override
    public void push(T item) {
        ArrayList<T> temp = (ArrayList) InternalSotorage;
        temp.add(item);
        InternalSotorage = temp;
    }

    @Override
    public T pull() {
        ArrayList<T> temp = (ArrayList) InternalSotorage;
        T pull = temp.remove(temp.size()-1);
        InternalSotorage = temp;
        return pull;
    }

    @Override
    public T peek() {
       ArrayList<T> temp = (ArrayList) InternalSotorage;
       return temp.get(temp.size()-1);
       
    }

    @Override
    public boolean empty() {
         ArrayList<T> temp = (ArrayList) InternalSotorage;
        return temp.isEmpty();
    }

    @Override
    public int size() {
        ArrayList<T> temp = (ArrayList) InternalSotorage;
        return temp.size();
    }
    
}
