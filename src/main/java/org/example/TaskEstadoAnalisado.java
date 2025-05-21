package org.example;

public class TaskEstadoAnalisado extends TaskEstado{
    private TaskEstadoAnalisado(){}

    private static TaskEstadoAnalisado instance = new TaskEstadoAnalisado();

    public static TaskEstadoAnalisado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Task analisada";
    }

    public boolean desenvolver(Task task) {
        task.setEstado(TaskEstadoDesenvolvido.getInstance());
        return true;
    }

    public boolean testar(Task task) {
        task.setEstado(TaskEstadoTestado.getInstance());
        return true;
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
