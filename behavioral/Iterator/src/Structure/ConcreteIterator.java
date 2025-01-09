package Structure;

import java.util.Collection;

public class ConcreteIterator<T> implements Iterator<T>{
    private Collection<T> collection;
    private double iterationState;

    ConcreteIterator(Collection<T> collection){
        this.collection = collection;
    }

    @Override
    public T getNext() {
        return null;
    }

    @Override
    public boolean hasMore() {
        return false;
    }
}
