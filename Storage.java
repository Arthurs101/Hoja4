/*
Clase que relaciona Stacks y Listas, puesto que factory regresa la clase correspondiente
*/
public class Storage<T>  {
    protected String type;

    public Storage(String type) {
        this.type = type;
    }

    public String getType() {//servira para ver que tipo es, 
        return type;
    }
    public Class me(){//regresa la clase que es.
        return this.getClass();
    }
    
}
