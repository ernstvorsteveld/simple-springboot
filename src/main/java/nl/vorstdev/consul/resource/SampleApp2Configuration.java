package nl.vorstdev.consul.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ernstvorsteveld on 23/04/16.
 */
@Configuration
public class SampleApp2Configuration {

    @Bean
    public SampleApp sampleApp() {
        return new SampleApp();
    }
}
