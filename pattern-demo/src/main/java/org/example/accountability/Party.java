package org.example.accountability;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/4 15:56
 * @Description:
 * @Version: v1.0
 */

@Getter
public abstract class Party {
    protected Long id;
    protected String name;
    protected PartyType partyType;

    public List<PartyType> getAllTypes() {
        return getAllTypes(partyType);
    }

    private List<PartyType> getAllTypes(PartyType partyType) {
        List<PartyType> ret = new ArrayList<>();
        if (partyType == null) {
            return ret;
        }
        ret.add(partyType);
        for (PartyType type : partyType.getSuperTypes()) {
            ret.addAll(getAllTypes(type));
        }
        return ret;
    }
}
