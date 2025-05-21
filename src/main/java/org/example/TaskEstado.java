package org.example;

public abstract class TaskEstado {
    public abstract String getEstado();

    public boolean criar(Task task) {
        return false;
    }

    public boolean analisar(Task task) {
        return false;
    }

    public boolean desenvolver(Task task) {
        return false;
    }

    public boolean testar(Task task) {
        return false;
    }

    public boolean implementar(Task task) {
        return false;
    }

    public boolean reprovar(Task task) {
        return false;
    }
}
