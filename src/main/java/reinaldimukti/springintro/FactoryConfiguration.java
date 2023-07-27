package reinaldimukti.springintro;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import reinaldimukti.springintro.factory.PaymentGatewayFactoryBean;

@Configuration
@Import({
        PaymentGatewayFactoryBean.class
})
public class FactoryConfiguration {
}
