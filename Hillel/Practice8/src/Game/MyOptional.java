package Game;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyOptional<Type> {
    private Type type;

    private MyOptional(Type type) {
        this.type = type;
    }

    public boolean isPresent() {
        return type != null;
    }

    public Type getType() {
        try {
            return type;
        } catch (NoSuchElementException e) {
            System.out.println("Error: NoSuchElementException");
            return null;
        }
    }

    public Type get() {
        if (type == null) {
            throw new NoSuchElementException("Error: null");
        }
        return type;
    }

    static <T> MyOptional<T> of(T type) {
        if (type == null) {
            throw new NoSuchElementException("Error: null");
        }
        return new MyOptional<>(type);
    }

    static <T> MyOptional<T> ofNullable(T type) {
        if (type != null) {
            return new MyOptional<>(type);
        }
        return null;
    }

    public static <T> MyOptional<T> empty(){
        return new MyOptional<>(null);
    }

    public Type orElse(Type type){
        if (isPresent()){
            return this.type;
        }
        return type;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyOptional<?> that = (MyOptional<?>) o;
        return Objects.equals(type, that.type);
    }
    
    public int hashCode() {
        return Objects.hash(type);
    }
}
