public class OurHashMap<K, V> {
    
    final int INITIAL_CAPACITY = 512;
    private Node<K,V>[] _internalArray = (Node<K,V>[]) new Object[INITIAL_CAPACITY];

    private class Node<K,V>{
        V _value;
        K _key;
        Node<K,V> _next;

        public Node(K key, V value){
            _value = value;
            _key = key;
        }
    }

    public void put(K key, V value){
        final int hashIndex = key.hashCode() % INITIAL_CAPACITY;
        
        for(Node<K,V> node = _internalArray[hashIndex]; node != null; node = node._next){
            if(node._key.equals(key)){
                node._value = value;
            }
        }
        
        final Node<K,V> node = new Node<K,V>(key, value);
       
        if(_internalArray[hashIndex] != null){
            node._next = _internalArray[hashIndex];
        }
        
        _internalArray[hashIndex] = node;

    }

    public void remove(K key){
    
        Node<K,V> prev = null;
        final int hashIndex = key.hashCode() % INITIAL_CAPACITY;

        for(Node<K,V> node = _internalArray[hashIndex]; node != null; node = node._next){
            if(node._key.equals(key)){
                
            }

            if(prev == null){
                prev = _internalArray[hashIndex];
            }
            else{
                prev = prev._next;
            }
        }


    }

    public V get(K key){

    }

    public boolean contains(K key){

    }

}
