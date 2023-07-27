package reinaldimukti.springintro;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import reinaldimukti.springintro.configuration.BarConfiguration;
import reinaldimukti.springintro.configuration.FooConfiguration;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {


}
