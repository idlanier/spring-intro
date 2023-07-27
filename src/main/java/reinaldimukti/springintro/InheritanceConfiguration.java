package reinaldimukti.springintro;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import reinaldimukti.springintro.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
