import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T> {
    private int DEFAULT_SIZE = 10;
    private int size;
    private T[] arr;
    private int counter = 0;

    public MyList() {
        this.size = DEFAULT_SIZE;
        arr = (T[]) new Object[size];
    }

    public MyList(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
    }

    public void add(T data) {
        if (counter == (size - 1)) {
            getNewInstance();
        }
        this.arr[counter++] = data;
    }

    public T remove(int index) {
        if (checkOutOfBounds(index)) {
            T data = arr[index];
            for (int i = index; i < this.counter; i++) {
                arr[i] = arr[i + 1];
            }
            counter--;
            return data;
        }
        return null;
    }

    public T set(int index, T newData) {
        if (checkOutOfBounds(index)) {
            T oldData = arr[index];
            arr[index] = newData;
            return oldData;
        }
        return null;
    }

    public int lastIndexOf(T data) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) lastIndex = i;
        }
        return lastIndex;
    }

    public boolean isEmpty(){
        return counter==0;
    }

    public T[] toArray(){
        return Arrays.copyOf(arr,arr.length);
    }

    public void clear(){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                arr[i] = null;
            }
        }
        counter =0;
    }

    public MyList<T> sublist(int start, int finish) {

        MyList<T> myList = null;
        if (start >= 0 && finish < arr.length) {
            T[] list = Arrays.copyOfRange(arr, start, finish+1);
            myList = new MyList<>();
            for (T temp :
                    list) {
                myList.add(temp);
            }
        }
        return myList;
    }
    public boolean contains(T data){
        boolean status = false;
        for (T temp : arr) {
            if (temp == data) {
                status = true;
                break;
            }
        }
        return status;
    }

    private boolean checkOutOfBounds(int index) {
        return (index >= 0 && index <= counter);
    }

    public T get(int index) {
        return checkOutOfBounds(index) ? arr[index] : null;
    }

    public int indexOf(T data) {
        for (int i = 0; i < counter; i++) {
            if (arr[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int getCapacity() {
        return size;
    }

    public int size() {
        return counter;
    }


    private void getNewInstance() {
        this.size *= 2;
        arr = Arrays.copyOf(arr, size);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        for (T temp :
                arr) {
            if (temp !=null) sb.append(temp+",");
        }
        sb.append(']');
        return sb.toString();
    }
}
