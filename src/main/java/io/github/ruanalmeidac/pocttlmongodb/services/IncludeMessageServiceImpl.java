package io.github.ruanalmeidac.pocttlmongodb.services;

import io.github.ruanalmeidac.pocttlmongodb.model.Message;
import io.github.ruanalmeidac.pocttlmongodb.model.TemporaryMessageRequest;
import io.github.ruanalmeidac.pocttlmongodb.repository.TempMessageRepository;
import java.util.Calendar;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class IncludeMessageServiceImpl implements IncludeMessageService{

    private final TempMessageRepository tempMessageRepository;

    public IncludeMessageServiceImpl(TempMessageRepository tempMessageRepository) {
        this.tempMessageRepository = tempMessageRepository;
    }


    @Override
    public void save(TemporaryMessageRequest temporaryMessageRequest) {

        Date date = new Date();
        log.info(date.toString());
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.SECOND, temporaryMessageRequest.getExpiringSeconds());
        log.info(cal.getTime().toString());

        Message tempMessage = new Message(temporaryMessageRequest.getMessage(), temporaryMessageRequest.getTable(), temporaryMessageRequest.getSender(), cal.getTime());

        tempMessageRepository.save(tempMessage);
    }
}
