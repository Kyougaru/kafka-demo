package com.kyougaru.cqrs.core.producers;

import com.kyougaru.cqrs.core.events.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}
