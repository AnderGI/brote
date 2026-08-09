package com.andergi.javadddtemplate.src.backoffice.user.application.register_user;

import com.andergi.javadddtemplate.src.shared.domain.command.Command;

public class RegisterUserCommand extends Command {
    private String id;

    public RegisterUserCommand(final String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
