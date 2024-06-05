package org.example.accountability.partytype;

import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/5 10:38
 * @Description:
 * @Version: v1.0
 */


public interface GeneralPartyTypeRepository {
    List<GeneralPartyType> getAll();

    GeneralPartyType findByName(String name);
}
