package co.edu.unicordoba.adapter.logistica_envios.model;

/**
 * Adaptee (Adaptado): Clase externa con una interfaz incompatible.
 * Recibe los parámetros en diferente orden (destino primero) 
 * y en diferente unidad de medida (gramos como entero).
 */
public class ServientregaAPI {

    public String crearGuiaExterna(String destino, int pesoGramos) {
        return "[SERVIENTREGA API EXTERNA] Guía de envío generada exitosamente hacia " 
               + destino + " por un peso de " + pesoGramos + "g.";
    }
}