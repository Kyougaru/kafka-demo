package com.kyougaru.account.cmd.api.commands;

import com.kyougaru.account.common.dto.AccountType;
import com.kyougaru.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
