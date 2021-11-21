//import java.util.HashMap;

public class OurArrayList<T> {

    private final int INITIAL_CAPACITY = 512;
    private T[] _array = (T[]) new Object[INITIAL_CAPACITY];
    private int _numElements;

    private void growArray(){
        
        T[] newArray = (T[]) new Object[2 * _array.length];

        for(int i = 0; i< _array.length; i++){
            newArray[i] = _array[i];
        }
        _array = newArray;
    }

    public void add(T obj){
        if(_numElements == _array.length){
            growArray();
        }
        _array[_numElements] = obj;
        _numElements++;
    }

    public boolean remove(T obj){
        T[] newArray = (T[]) new Object[_array.length];
        boolean returnCondition = false;

        for(int i = 0, j = 0; i< _array.length; i++){
            
            if(_array[i] != obj){
                newArray[j++] = _array[i];
            }
            else{
                returnCondition = true;
                _numElements--;
            }
        }
        _array = newArray;

        return returnCondition;
    }

    public T remove(int index) throws IndexOutOfBoundsException{
        
        T obj = null;

        T[] newArray = (T[]) new Object[_array.length];

        for(int i = 0, j = 0; i< _array.length; i++){
            if(i != index){
                newArray[j++] = _array[i];
            }
            else{
                obj = _array[i];
                _numElements--;
            }
        }
        _array = newArray;

        return obj;
    }
    
    public T get(int index) throws IndexOutOfBoundsException{
        return _array[index];
    }

    
}
