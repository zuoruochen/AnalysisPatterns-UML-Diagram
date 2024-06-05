package org.example.accountability;

import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/4 17:18
 * @Description: 责任类型，实现方式可以类似{@link PartyType}，动态配置方式或者是通过类预定义
 * @Version: v1.0
 */


public interface AccountabilityType {

    List<PartyType> getCommissioners();
    List<PartyType> getResponsibles();

    default boolean checkConstraint(Party commissioner, Party responsible) {
        return hasIntersection(getCommissioners(), commissioner.getAllTypes()) && hasIntersection(getResponsibles(), responsible.getAllTypes());
    }

    private <T> boolean hasIntersection(List<T> list1, List<T> list2) {
        for (T t : list1) {
            if (list2.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
