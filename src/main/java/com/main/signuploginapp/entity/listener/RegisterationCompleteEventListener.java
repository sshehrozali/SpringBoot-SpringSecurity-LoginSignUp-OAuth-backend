package com.main.signuploginapp.entity.listener;

import com.main.signuploginapp.entity.User;
import com.main.signuploginapp.event.RegisterationCompleteEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegisterationCompleteEventListener implements ApplicationListener<RegisterationCompleteEvent> {
    @Override
    public void onApplicationEvent(RegisterationCompleteEvent event) {
        String token = UUID.randomUUID().toString();    // Generate token
        String url = event.getApplicationUrl() + "/verifyRegisteration?token=" + token;     // Generate URL to verify
        System.out.println("Click Link to Verify: " + url);     // Throw Verification Link as a log
    }
}