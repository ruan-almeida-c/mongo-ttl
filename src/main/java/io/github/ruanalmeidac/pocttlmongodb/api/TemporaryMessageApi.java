package io.github.ruanalmeidac.pocttlmongodb.api;

import io.github.ruanalmeidac.pocttlmongodb.model.TemporaryMessageRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
@RequestMapping("/poc")
@Api(tags="Temporary Message")
public interface TemporaryMessageApi {
    @ApiOperation(value = "Save Message", tags = {"Temporary Message"})
    @PostMapping(value = "/temporary-message")
    ResponseEntity<String> saveMessage(@RequestBody TemporaryMessageRequest temporaryMessageRequest);

}
