

import org.springframework.context.annotation.Bean;

@Configuration
@Profile("dev")
public class WebDemoConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://10.223.99.44:8080");
            }
        };
    }

}