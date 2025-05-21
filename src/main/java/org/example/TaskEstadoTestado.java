package org.example;

public class TaskEstadoTestado extends TaskEstado{
    private TaskEstadoTestado(){}

    private static TaskEstadoTestado instance = new TaskEstadoTestado();

    public static TaskEstadoTestado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Task testada";
    }

    public boolean implementar(Task task) {
        task.setEstado(TaskEstadoImplementado.getInstance());
        return true;
    }

    public boolean reprovar(Task task) {
        task.setEstado(TaskEstadoReprovado.getInstance());
        return true;
    }
}
