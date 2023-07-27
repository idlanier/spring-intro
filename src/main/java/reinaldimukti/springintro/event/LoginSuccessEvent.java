package reinaldimukti.springintro.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import reinaldimukti.springintro.data.User;

public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}
