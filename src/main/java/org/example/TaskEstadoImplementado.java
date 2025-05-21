package org.example;

public class TaskEstadoImplementado extends TaskEstado{
    private TaskEstadoImplementado(){}

    private static TaskEstadoImplementado instance = new TaskEstadoImplementado();

    public static TaskEstadoImplementado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Task implementada";
    }
}
