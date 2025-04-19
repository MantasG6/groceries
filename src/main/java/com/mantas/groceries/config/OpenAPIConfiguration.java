package com.mantas.groceries.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfiguration {

    @Bean
    public OpenAPI defineOpenAPI() {
        Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Grocery Shop API");

        Contact contact = new Contact();
        contact.setName("Mantas Gricius");
        contact.setEmail("mantasgricius6@gmail.com");

        Info information = new Info()
                .title("Grocery Shop API")
                .version("1.0")
                .description("This is a simple CRUD API application to manage grocery shop items")
                .contact(contact);

        return new OpenAPI().info(information).servers(List.of(server));
    }
}
