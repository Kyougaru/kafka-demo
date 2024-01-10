package com.kyougaru.account.cmd.api.commands;

import com.kyougaru.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class WithdrawFundsCommand extends BaseCommand {
    private double amount;
}
