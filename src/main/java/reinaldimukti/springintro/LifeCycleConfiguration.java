package reinaldimukti.springintro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reinaldimukti.springintro.data.Connection;
import reinaldimukti.springintro.data.Server;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    @Bean()
    public Server server() {
        return new Server();
    }
}
