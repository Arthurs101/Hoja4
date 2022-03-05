

/**
 *
 * @author inmar
 */
public class StorageFactory {
    public Storage createInstance(int type){
    switch(type){
        case 1 ->{//lista simple
        return new SimpleList();
        }
        case 2 ->{//lista doble anidada
        return new DoubleList();
        }
        case 3 ->{//stack simple con array list
        return new StackList();}
        case 4 ->{//Stack con lista enlazada simple
        return new StackSimple();}
        case 5 ->{//stack con lista enlazada doble
        return new StackDouble();
        }
    }
        return null;
    }
}
