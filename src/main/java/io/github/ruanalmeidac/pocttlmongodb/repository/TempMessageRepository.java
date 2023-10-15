package io.github.ruanalmeidac.pocttlmongodb.repository;

import io.github.ruanalmeidac.pocttlmongodb.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TempMessageRepository extends MongoRepository<Message, String> {
}
