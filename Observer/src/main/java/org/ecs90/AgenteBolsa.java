package org.ecs90;

import java.util.ArrayList;
import java.util.List;

public class AgenteBolsa implements Observable<Agencia> {
    private double valorActual;
    private List<Agencia> observers;

    public AgenteBolsa(double valorActual) {
        this.valorActual = valorActual;
        this.observers = new ArrayList<>();
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
        notification();
    }

    @Override
    public void addObserver(Agencia observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(Agencia observer) {
        return observers.remove(observer);
    }

    @Override
    public void notification() {
        observers.forEach(observador -> observador.update(valorActual));
    }
}
