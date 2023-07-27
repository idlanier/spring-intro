package reinaldimukti.springintro;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import reinaldimukti.springintro.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "reinaldimukti.springintro.repository",
        "reinaldimukti.springintro.service",
        "reinaldimukti.springintro.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {

}