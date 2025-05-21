package org.example;

public class TaskEstadoReprovado extends TaskEstado{
    private TaskEstadoReprovado(){}

    private static TaskEstadoReprovado instance = new TaskEstadoReprovado();

    public static TaskEstadoReprovado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Task reprovada";
    }
}
