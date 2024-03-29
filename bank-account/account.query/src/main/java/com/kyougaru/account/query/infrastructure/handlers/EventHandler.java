package com.kyougaru.account.query.infrastructure.handlers;

import com.kyougaru.account.common.events.AccountClosedEvent;
import com.kyougaru.account.common.events.AccountOpenedEvent;
import com.kyougaru.account.common.events.FundsDepositedEvent;
import com.kyougaru.account.common.events.FundsWithdrawnEvent;

public interface EventHandler {
    void on(AccountOpenedEvent event);
    void on(FundsDepositedEvent event);
    void on(FundsWithdrawnEvent event);
    void on(AccountClosedEvent event);
}
