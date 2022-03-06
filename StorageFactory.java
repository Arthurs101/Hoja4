
/**
 *
 * @author inmar
 */
public class StorageFactory {
    public IStack createInstance(int type) {
        switch (type) {
     
            case 1:// stack simple con array list
                return new StackUsingArrayList<Integer>();
            // break;
            case 2:// Stack con lista enlazada simple
                return new StackUsingLinkedList<Integer>();

            case 3:// stack con lista enlazada doble
                return new StackUsingDoubleLinkedList<Integer>();

        }
        return null;
    }
    public IList createList(int type){
    switch(type){
        case 1:// lista simple
        return new SingleLinkedList<Integer>();

        case 2:// lista doble anidada
        return new DoubleLinkedList<Integer>();
    }
    
    return null;
    }
   
}
