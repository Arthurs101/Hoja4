/*
Interfaz Proporcionada por catedrarico Moises Alonso
*/
interface LinkLists<T> {
    void InsertAtStart(T value);

    void InsertAtEnd(T value);

    void Insert(T value, int index);

    T Delete(int index);

    T DeleteAtStart();

    T DeleteAtEnd();

    T Get(int index);

    boolean IsEmpty();
    
    int Count();
    
}