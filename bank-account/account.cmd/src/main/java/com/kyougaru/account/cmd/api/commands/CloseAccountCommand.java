package com.kyougaru.account.cmd.api.commands;

import com.kyougaru.cqrs.core.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
