package ru.hse.MyArrayList;

public interface IMyArrayList<T> {
    T getItem(int index);
    void putItem(T value);
    int getSize();
    boolean containsInArray(T item);
    void clearArray();
}
