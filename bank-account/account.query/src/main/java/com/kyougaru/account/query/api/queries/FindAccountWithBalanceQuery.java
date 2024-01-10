package com.kyougaru.account.query.api.queries;

import com.kyougaru.account.query.api.dto.EqualityType;
import com.kyougaru.cqrs.core.queries.BaseQuery;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAccountWithBalanceQuery extends BaseQuery {
    private EqualityType equalityType;
    private double balance;
}
