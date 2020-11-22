package ru.hse.MyArrayList;

// FIXME почему интерфейс конкртено для ArrayList а не для всех листов?
// FIXME нужен интерфейс List который будут имплементировать и ArrayList и LinkedLisst.
// TODO нет комментариев для каждого метода.
public interface IMyArrayList<T> {
    T getItem(int index);
    void putItem(T value);
    int getSize();
    boolean containsInArray(T item);
    void clearArray();
}
