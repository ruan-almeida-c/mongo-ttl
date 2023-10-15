package io.github.ruanalmeidac.pocttlmongodb.model;

import io.swagger.annotations.ApiModel;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "message_history_temporary")
public class Message implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    private String message;
    private String Table;
    private String Sender;
    @Indexed(expireAfterSeconds = 3600)
    private Date createdAt;

    public Message(String message, String table, String sender, Date createdAt) {
        this.message = message;
        Table = table;
        Sender = sender;
        this.createdAt = createdAt;
    }
}
