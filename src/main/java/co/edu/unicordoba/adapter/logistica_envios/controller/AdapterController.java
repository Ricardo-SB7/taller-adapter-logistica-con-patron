package co.edu.unicordoba.adapter.logistica_envios.controller;

import co.edu.unicordoba.adapter.logistica_envios.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller: Expone la demostración del patrón Adapter mediante endpoints HTTP.
 * Garantiza el correcto despliegue y puerto activo para Render.
 */
@RestController
@RequestMapping("/api/adapter")
public class AdapterController {

    @GetMapping("/demo")
    public List<String> ejecutarDemostracion() {
        List<String> resultados = new ArrayList<>();

        resultados.add("=== DEMOSTRACIÓN DEL PATRÓN ADAPTER (REFACTORIZADO) ===");

        // Instanciación del servicio nativo
        ProcesadorEnvio envioLocal = new EnvioLocalAdapter();
        
        // Instanciación de la API externa a través de su Adaptador
        ProcesadorEnvio envioServientrega = new ServientregaAdapter(new ServientregaAPI());

        // Polimorfismo: el controlador trata ambas opciones con la misma interfaz sin importar la fuente
        resultados.add(envioLocal.enviar("Calle 24 #10-05, Montería", 2.5));
        resultados.add(envioServientrega.enviar("Carrera 5 #40-12, Montería", 3.0));

        return resultados;
    }
}