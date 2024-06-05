package org.example.accountability;

import lombok.Builder;
import lombok.Getter;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/5 10:58
 * @Description:
 * @Version: v1.0
 */

@Getter
@Builder
public class Accountability {
    private AccountabilityType accountabilityType;
    private Party commissioner;
    private Party responsible;
    private TimeRange timeRange;
}
