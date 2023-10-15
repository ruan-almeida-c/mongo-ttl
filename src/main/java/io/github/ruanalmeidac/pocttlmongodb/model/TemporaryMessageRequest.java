package io.github.ruanalmeidac.pocttlmongodb.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
public class TemporaryMessageRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "table")
    private String table;
    @ApiModelProperty(value = "message")
    private String message;
    @ApiModelProperty(value = "sender")
    private String sender;
    @ApiModelProperty(value = "expiringSeconds")
    private int expiringSeconds;

}
