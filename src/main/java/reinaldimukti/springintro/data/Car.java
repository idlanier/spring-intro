package reinaldimukti.springintro.data;

import lombok.Getter;
import reinaldimukti.springintro.aware.IdAware;

public class Car implements IdAware {

    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
