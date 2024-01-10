package com.kyougaru.cqrs.core.infrastructure;

import com.kyougaru.cqrs.core.commands.BaseCommand;
import com.kyougaru.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
