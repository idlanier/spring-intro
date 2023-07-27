package reinaldimukti.springintro.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import reinaldimukti.springintro.client.PaymentGatewayClient;

@Component("paymentGatewayClient")
public class PaymentGatewayFactoryBean implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();

        client.setEndpoint("https://example.com");
        client.setPrivateKey("private");
        client.setPublicKey("public");

        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
