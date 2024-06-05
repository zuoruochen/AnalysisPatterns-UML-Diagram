package org.example.accountability.partytype.doctor;

import com.google.common.collect.Lists;
import org.example.accountability.PartyType;

import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/4 19:20
 * @Description:
 * @Version: v1.0
 */


public final class GeneralDoctor implements PartyType {

    private GeneralDoctor() {

    }

    private static class SingletonHolder {
        private static final GeneralDoctor INSTANCE = new GeneralDoctor();
    }

    public static GeneralDoctor getInstance() {
        return GeneralDoctor.SingletonHolder.INSTANCE;
    }

    public List<PartyType> getSuperTypes() {
        return Lists.newArrayList(Doctor.getInstance());
    }
}
