package org.example.accountability.partytype.doctor;

import org.example.accountability.PartyType;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/4 19:19
 * @Description: 预定义的partyType
 * @Version: v1.0
 */

public final class Doctor implements PartyType {
    private Doctor() {

    }

    private static class SingletonHolder {
        private static final Doctor INSTANCE = new Doctor();
    }

    public static Doctor getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public List<PartyType> getSuperTypes() {
        return new ArrayList<>();
    }
}
