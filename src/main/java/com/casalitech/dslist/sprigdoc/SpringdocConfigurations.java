package com.casalitech.dslist.sprigdoc;



import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Configuration classe de configuração da documentacao
@Configuration
public class SpringdocConfigurations {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                //@OpenAPIDefinition(
                .info(new Info().title("Game")
                        .description("Api responsável por Listar, detalhar e movimentar")
                        .version("1")
                )


                .components(new Components());

    }

}
