package com.andergi.javadddtemplate.src.shared.domain.query;

import com.andergi.javadddtemplate.src.shared.domain.response.Response;

public interface QueryHandler<Q extends Query, R extends Response> {
    R handle(Q query);
}
