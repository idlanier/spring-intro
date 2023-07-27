package reinaldimukti.springintro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reinaldimukti.springintro.data.Bar;
import reinaldimukti.springintro.data.Foo;
import reinaldimukti.springintro.data.FooBar;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
