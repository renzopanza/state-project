package org.example;

public class TaskEstadoCriada extends TaskEstado{
    private TaskEstadoCriada(){}

    private static TaskEstadoCriada instance = new TaskEstadoCriada();

    public static TaskEstadoCriada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Task criada";
    }

    public boolean analisar(Task task){
        task.setEstado(TaskEstadoAnalisado.getInstance());
        return true;
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
