package org.cloudfoundry.samples.music.config.data;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * This configuration is disabled because it depends on Spring Cloud Connectors
 * which is not compatible with Spring Boot 3.x.
 * For cloud deployments, you would need to use a different approach,
 * such as Spring Cloud Config or environment variables.
 */
@Configuration
@Profile("mongodb-cloud")
public class MongoCloudConfig {
    // Cloud configuration is disabled
}
