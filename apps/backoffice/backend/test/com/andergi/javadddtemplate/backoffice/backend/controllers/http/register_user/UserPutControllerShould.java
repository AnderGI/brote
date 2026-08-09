package com.andergi.javadddtemplate.backoffice.backend.controllers.http.register_user;

import com.andergi.javadddtemplate.backoffice.backend.ApplicationTestCase;
import org.junit.jupiter.api.Test;


class UserPutControllerShould extends ApplicationTestCase {

    @Test
    void register_a_valid_non_existing_user() throws Exception {
        assertRequest(
                "PUT",
                "/users/c6fb6089-dcf4-488d-9e57-9932ddb6839f",
                202
        );
    }

}