package org.ecs90;

public interface Observable<Type extends Observer> {
    void addObserver(Type observer);
    boolean removeObserver(Type observer);
    void notification();
}
