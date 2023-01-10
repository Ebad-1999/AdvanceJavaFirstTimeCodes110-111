package generics.genericInterface;
//if we implement generic interface the implementing class should be also generic
public class GenericInterfaceImpl01<T> implements GenericInterface<T>{
    @Override
    public void setValue(T t) {
    }

    @Override
    public T getValue() {
        return null;
    }
}
