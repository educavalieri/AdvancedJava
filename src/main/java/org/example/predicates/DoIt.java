package org.example.predicates;

@FunctionalInterface
public interface DoIt<T> {

    boolean doo(T t);


}
