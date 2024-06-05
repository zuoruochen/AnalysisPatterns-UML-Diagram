package org.example.accountability.partytype;

import org.example.accountability.PartyType;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/5 10:25
 * @Description:
 * @Version: v1.0
 * @see GeneralPartyTypeRepository
 */


public final class GeneralPartyTypeFactory {

    public static GeneralPartyType create(String name, List<PartyType> superTypes) {
        // in fact, should check the uniqueness of name in repository firstly
        return GeneralPartyType.builder()
                .name(name)
                .id(ThreadLocalRandom.current().nextLong())
                .superTypes(superTypes)
                .build();
    }
}
