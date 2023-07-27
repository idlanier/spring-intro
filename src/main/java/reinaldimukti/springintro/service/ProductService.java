package reinaldimukti.springintro.service;

import lombok.Getter;
import org.springframework.stereotype.Component;
import reinaldimukti.springintro.repository.ProductRepository;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
