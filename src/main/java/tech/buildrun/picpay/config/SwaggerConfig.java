package tech.buildrun.picpay.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .servers(
                        List.of(
                                new Server().description("Local").url("http://localhost:8080"),
                                new Server().description("Produção").url("http://localhost:8080")
                        )
                )
                .info(new Info()
                        .title("PicPay Transfer")
                        .version("1.0")
                        .description("Documentação da API - PicPay Transfer")
                        .contact(new Contact()
                                .name("João Silva")
                                .email("dev.joaovictor@hotmail.com")
                                .url("http://locahost:8080"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                );
    }
}
