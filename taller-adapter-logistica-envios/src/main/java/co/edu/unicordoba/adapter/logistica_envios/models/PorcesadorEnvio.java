package co.edu.unicordoba.adapter.logistica_envios.model;

/**
 * Target (Objetivo): Interfaz estándar que el cliente espera utilizar.
 * Define la firma del método de envío unificado (dirección y peso en kg).
 */
public interface ProcesadorEnvio {
    String enviar(String direccion, double pesoKg);
}