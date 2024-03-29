package com.kyougaru.account.query.infrastructure.consumers;

import com.kyougaru.account.common.events.AccountClosedEvent;
import com.kyougaru.account.common.events.AccountOpenedEvent;
import com.kyougaru.account.common.events.FundsDepositedEvent;
import com.kyougaru.account.common.events.FundsWithdrawnEvent;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;

public interface EventConsumer {
    void consume(@Payload AccountOpenedEvent event, Acknowledgment ack);
    void consume(@Payload FundsDepositedEvent event, Acknowledgment ack);
    void consume(@Payload FundsWithdrawnEvent event, Acknowledgment ack);
    void consume(@Payload AccountClosedEvent event, Acknowledgment ack);
}
