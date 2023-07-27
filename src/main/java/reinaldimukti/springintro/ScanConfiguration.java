package reinaldimukti.springintro;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "reinaldimukti.springintro.configuration"
})
public class ScanConfiguration {
}
