package com.andergi.javadddtemplate.backoffice.backend.controllers.http.register_user;

import com.andergi.javadddtemplate.src.backoffice.user.application.register_user.RegisterUserCommand;
import com.andergi.javadddtemplate.src.backoffice.user.application.register_user.UserRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class UserPutController {

    private final UserRegistrar registrar;

    @Autowired
    public UserPutController(final UserRegistrar registrar) {
        this.registrar = registrar;
    }

    @PutMapping(path = "/users/{id}")
    public ResponseEntity run(@PathVariable final String id) {
        this.registrar.register(new RegisterUserCommand(id));
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
