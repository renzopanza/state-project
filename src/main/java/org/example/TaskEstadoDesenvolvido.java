package org.example;

public class TaskEstadoDesenvolvido extends TaskEstado{
    private TaskEstadoDesenvolvido(){}

    private static TaskEstadoDesenvolvido instance = new TaskEstadoDesenvolvido();

    public static TaskEstadoDesenvolvido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Task desenvolvida";
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
