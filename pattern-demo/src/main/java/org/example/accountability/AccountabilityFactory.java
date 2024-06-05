package org.example.accountability;

import com.google.common.base.Preconditions;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/5 16:46
 * @Description:
 * @Version: v1.0
 */


public final class AccountabilityFactory {
    public static Accountability create(AccountabilityType accountabilityType, Party commissioner, Party responsible, TimeRange timeRange) {
        Preconditions.checkArgument(accountabilityType != null);
        Preconditions.checkArgument(commissioner != null);
        Preconditions.checkArgument(responsible != null);
        if (!accountabilityType.checkConstraint(commissioner, responsible)) {
            throw new IllegalArgumentException("AccountabilityType is not suitable");
        }
        return Accountability.builder()
                .accountabilityType(accountabilityType)
                .commissioner(commissioner)
                .responsible(responsible)
                .timeRange(timeRange)
                .build();
    }
}
