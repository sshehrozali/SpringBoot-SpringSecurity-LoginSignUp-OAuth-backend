package com.main.signuploginapp.event;

import com.main.signuploginapp.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class RegisterationCompleteEvent extends ApplicationEvent {
    private User user;
    private String applicationUrl;

    public RegisterationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}
