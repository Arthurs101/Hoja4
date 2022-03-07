/*
 * interfaz que sera implementada para todos los stacks.
 */


public interface IStack<T> {

    int count();

    boolean isEmpty();

    void push(T value);

    T pull();

    T peek();
}