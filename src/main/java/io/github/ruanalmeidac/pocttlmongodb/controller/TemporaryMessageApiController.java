package io.github.ruanalmeidac.pocttlmongodb.controller;

import io.github.ruanalmeidac.pocttlmongodb.api.TemporaryMessageApi;
import io.github.ruanalmeidac.pocttlmongodb.model.TemporaryMessageRequest;
import io.github.ruanalmeidac.pocttlmongodb.services.IncludeMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

@Slf4j
@RestController
@Api(tags="Temporary Message")
public class TemporaryMessageApiController implements TemporaryMessageApi{

    private final IncludeMessageService includeMessageService;

    public TemporaryMessageApiController(IncludeMessageService includeMessageService) {
        this.includeMessageService = includeMessageService;
    }


    @Override
    public ResponseEntity<String> saveMessage(@RequestBody TemporaryMessageRequest temporaryMessageRequest) {
        log.info(temporaryMessageRequest.toString());
        log.info(String.format("Starting Poc for saving message temporary - TABLE [%s] - MESSAGE [%s] - SENDER [%s]", temporaryMessageRequest.getTable(),
                temporaryMessageRequest.getMessage(), temporaryMessageRequest.getSender()));

        includeMessageService.save(temporaryMessageRequest);

        log.info(String.format("Process finished - TABLE [%s] - MESSAGE [%s] - SENDER [%s]", temporaryMessageRequest.getTable(),
                temporaryMessageRequest.getMessage(), temporaryMessageRequest.getSender()));

        return ResponseEntity.ok(null);

    }
}
