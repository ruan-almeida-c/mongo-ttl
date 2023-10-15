package io.github.ruanalmeidac.pocttlmongodb.services;

import io.github.ruanalmeidac.pocttlmongodb.model.TemporaryMessageRequest;

public interface IncludeMessageService {

    void save(TemporaryMessageRequest temporaryMessageRequest);
}
