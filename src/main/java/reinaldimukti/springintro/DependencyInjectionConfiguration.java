package reinaldimukti.springintro;

import org.springframework.context.annotation.Bean;
import reinaldimukti.springintro.data.Bar;
import reinaldimukti.springintro.data.Foo;
import reinaldimukti.springintro.data.FooBar;

public class DependencyInjectionConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }
}
