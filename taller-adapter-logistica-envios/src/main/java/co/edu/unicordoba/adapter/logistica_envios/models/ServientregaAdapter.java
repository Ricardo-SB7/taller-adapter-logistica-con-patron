package co.edu.unicordoba.adapter.logistica_envios.model;

/**
 * Adapter (Adaptador): Convierte la interfaz de ServientregaAPI 
 * en la interfaz objetivo ProcesadorEnvio.
 * Mantiene el principio Open/Closed (OCP) evitando modificar el código cliente.
 */
public class ServientregaAdapter implements ProcesadorEnvio {

    // Composición: referencia a la clase que deseamos adaptar
    private final ServientregaAPI servientregaAPI;

    public ServientregaAdapter(ServientregaAPI servientregaAPI) {
        this.servientregaAPI = servientregaAPI;
    }

    @Override
    public String enviar(String direccion, double pesoKg) {
        // 1. Transformación de datos: convierte de kilogramos (double) a gramos (int)
        int pesoGramos = (int) (pesoKg * 1000);

        // 2. Delegación y reordenamiento de parámetros a la API externa
        return servientregaAPI.crearGuiaExterna(direccion, pesoGramos);
    }
}