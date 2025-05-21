package org.example;

public class Task {
    private String titulo;
    private TaskEstado estado;

    public Task() {
        this.estado = TaskEstadoCriada.getInstance();
    }

    public void setEstado(TaskEstado estado) {
        this.estado = estado;
    }

    public boolean criar() {
        return estado.criar(this);
    }

    public boolean analisar() {
        return estado.analisar(this);
    }

    public boolean desenvolver() {
        return estado.desenvolver(this);
    }

    public boolean testar() {
        return estado.testar(this);
    }

    public boolean implementar() {
        return estado.implementar(this);
    }

    public boolean reprovar() {
        return estado.reprovar(this);
    }

    public String getTaskEstado() {
        return estado.getEstado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public TaskEstado getEstado() {
        return estado;
    }
}
