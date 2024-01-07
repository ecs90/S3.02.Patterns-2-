package org.ecs90;

import java.util.ArrayList;
import java.util.List;

public class AgenteBolsa implements Observable{
    private double valorActual;
    private List<Observer> observers;

    public AgenteBolsa(double valorActual) {
        this.valorActual = valorActual;
        this.observers = new ArrayList<>();
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
        notification();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notification() {
        observers.forEach(observador -> observador.update(valorActual));
    }
}
