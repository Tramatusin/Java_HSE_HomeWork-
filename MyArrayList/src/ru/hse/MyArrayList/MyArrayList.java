package ru.hse.MyArrayList;

public class MyArrayList<T> implements IMyArrayList<T>{
    //дефолтный размер списка
    private final int INIT_SIZE = 2;
    //массив для элементов
    private Object[] listArray = new Object[INIT_SIZE];
    //счетчик элементов
    private int counter = 0;

    /**
     * получает элемент по индексу из массива, если индекс
     * за пределами массива кидает исключение
     * @param index индекс элемента в массиве
     * @return возвращает элемент
     */
    public T getItem(int index){
        if(index < 0 || index >= listArray.length)
            throw new IndexOutOfBoundsException("Индекс за пределами массива");
        return listArray[index] == null ? null : (T)listArray[index];
    }

    /**
     * вставляет элемент в конец списка
     * @param value элемент, который мы вставляем
     */
    public void putItem(T value){
        if(counter == listArray.length-1)
            resizeArray(listArray.length*2);
        listArray[counter++]=value;
    }

    /**
     * метод, возвращающий размер списка
     * @return размер списка
     */
    public int getSize(){
        return listArray.length;
    }

    /**
     * проверяет есть ли переданный элемент в списке
     * @param item элемент
     * @return возвращает true OR false в зависимости от того находит идентичный элемент или нет
     */
    public boolean containsInArray(T item){
        for(int i=0;i<listArray.length;++i)
            if (item.equals(listArray[i]))
                return true;
        return false;
    }

    /**
     * метод очищающий список
     */
    public void clearArray(){
        listArray = new Object[0];
    }

    //вспомогательный метод для ресайза массива
    private void resizeArray(int updateLength) {
        Object[] newArray = new Object[updateLength];
        System.arraycopy(listArray, 0, newArray, 0, counter);
        listArray = newArray;
    }
}
