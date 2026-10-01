package co.edu.unicordoba.adapter.logistica_envios;

import co.edu.unicordoba.adapter.logistica_envios.controller.AdapterController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TallerAdapterLogisticaEnviosApplication {

    public static void main(String[] args) {
        SpringApplication.run(TallerAdapterLogisticaEnviosApplication.class, args);
    }

    /**
     * Bean para ejecutar la prueba por consola al arrancar Spring Boot.
     */
    @Bean
    public CommandLineRunner run(AdapterController controller) {
        return args -> {
            System.out.println("\n--------------------------------------------------");
            System.out.println("EJECUCIÓN EN CONSOLA DEL PATRÓN ADAPTER:");
            controller.ejecutarDemostracion().forEach(System.out::println);
            System.out.println("--------------------------------------------------\n");
        };
    }
}