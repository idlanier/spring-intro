package reinaldimukti.springintro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import reinaldimukti.springintro.data.Foo;

public class DuplicateConfiguration {

    @Bean
    public Foo foo1() {
        return new Foo();
    }

    @Bean
    public Foo foo2() {
        return  new Foo();
    }
}
