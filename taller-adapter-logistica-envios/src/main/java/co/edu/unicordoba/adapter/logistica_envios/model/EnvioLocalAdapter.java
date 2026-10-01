package co.edu.unicordoba.adapter.logistica_envios.model;

/**
 * Concrete Component: Servicio nativo de la empresa.
 * Implementa la interfaz Objetivo sin necesidad de adaptación.
 */
public class EnvioLocalAdapter implements ProcesadorEnvio {

    @Override
    public String enviar(String direccion, double pesoKg) {
        return "[LOGÍSTICA LOCAL] Envío procesado directamente a " 
               + direccion + " con un peso de " + pesoKg + " kg.";
    }
}