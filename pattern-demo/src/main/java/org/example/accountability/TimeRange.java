package org.example.accountability;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/5 10:50
 * @Description:
 * @Version: v1.0
 */


@Getter
@AllArgsConstructor
public class TimeRange {
    private LocalDateTime begin;
    private LocalDateTime end;

    public boolean inRange(LocalDateTime time) {
        return (begin.isBefore(time) || begin.isEqual(time)) && (end.isAfter(time) || end.isEqual(time));
    }
}
