package org.example.accountability.partytype.doctor;

import com.google.common.collect.Lists;
import org.example.accountability.PartyType;

import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/4 19:38
 * @Description:
 * @Version: v1.0
 */


public final class Pediatrician implements PartyType {

    private Pediatrician() {

    }

    private static class SingletonHolder {
        private static final Pediatrician INSTANCE = new Pediatrician();
    }

    public static Pediatrician getInstance() {
        return Pediatrician.SingletonHolder.INSTANCE;
    }

    @Override
    public List<PartyType> getSuperTypes() {
        return Lists.newArrayList(Doctor.getInstance());
    }
}
