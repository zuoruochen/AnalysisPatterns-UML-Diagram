package org.example.accountability.partytype.doctor;

import com.google.common.collect.Lists;
import org.example.accountability.PartyType;

import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/4 19:51
 * @Description:
 * @Version: v1.0
 */


public final class MixDoctor implements PartyType {

    private MixDoctor() {

    }

    private static class SingletonHolder {
        private static final MixDoctor INSTANCE = new MixDoctor();
    }

    public static MixDoctor getInstance() {
        return MixDoctor.SingletonHolder.INSTANCE;
    }

    @Override
    public List<PartyType> getSuperTypes() {
        return Lists.newArrayList(GeneralDoctor.getInstance(), Pediatrician.getInstance());
    }
}
