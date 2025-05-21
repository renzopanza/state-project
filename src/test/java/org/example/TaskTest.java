package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    Task task;

    @BeforeEach
    void setUp() {
        task = new Task();
    }

    @Test
    void naoDeveCriarTaskCriada() {
        task.setEstado(TaskEstadoCriada.getInstance());
        assertFalse(task.criar());
    }

    @Test
    void deveAnalisarTaskCriada() {
        assertTrue(task.analisar());
        assertEquals("Task analisada", task.getTaskEstado());
    }

    @Test
    void deveDesenvolverTaskAnalisada() {
        task.analisar();
        assertTrue(task.desenvolver());
        assertEquals("Task desenvolvida", task.getTaskEstado());
    }

    @Test
    void deveTestarTaskDesenvolvida() {
        task.analisar();
        task.desenvolver();
        assertTrue(task.testar());
        assertEquals("Task testada", task.getTaskEstado());
    }

    @Test
    void deveImplementarTaskTestada() {
        task.analisar();
        task.desenvolver();
        task.testar();
        assertTrue(task.implementar());
        assertEquals("Task implementada", task.getTaskEstado());
    }

    @Test
    void deveReprovarTaskCriada() {
        assertTrue(task.reprovar());
        assertEquals("Task reprovada", task.getTaskEstado());
    }

    @Test
    void deveReprovarTaskAnalisada() {
        task.analisar();
        assertTrue(task.reprovar());
        assertEquals("Task reprovada", task.getTaskEstado());
    }

    @Test
    void deveReprovarTaskDesenvolvida() {
        task.analisar();
        task.desenvolver();
        assertTrue(task.reprovar());
        assertEquals("Task reprovada", task.getTaskEstado());
    }

    @Test
    void deveReprovarTaskTestada() {
        task.analisar();
        task.desenvolver();
        task.testar();
        assertTrue(task.reprovar());
        assertEquals("Task reprovada", task.getTaskEstado());
    }

    @Test
    void deveReprovarTaskImplementada() {
        task.analisar();
        task.desenvolver();
        task.testar();
        task.implementar();
        assertFalse(task.reprovar());
    }
}