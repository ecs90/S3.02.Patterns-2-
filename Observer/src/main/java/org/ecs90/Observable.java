package org.ecs90;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notification();
}
