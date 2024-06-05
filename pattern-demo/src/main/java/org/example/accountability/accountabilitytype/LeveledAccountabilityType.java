package org.example.accountability.accountabilitytype;

import org.example.accountability.AccountabilityType;
import org.example.accountability.Party;
import org.example.accountability.PartyType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/4 17:34
 * @Description:
 * @Version: v1.0
 */

public interface LeveledAccountabilityType extends AccountabilityType {
    Logger log = LoggerFactory.getLogger(LeveledAccountabilityType.class);

    List<PartyType> getLevels();

    @Override
    default boolean checkConstraint(Party commissioner, Party responsible) {
        int cIndex = getLevels().indexOf(commissioner.getPartyType());
        if (cIndex == -1) {
            log.info("commissioner's party type: {} in levels", commissioner.getPartyType());
            return false;
        }
        if (cIndex + 1 >= getLevels().size() || responsible.getPartyType() != getLevels().get(cIndex + 1)) {
            log.info("responsible's party type: {} is not the next level", responsible.getPartyType());
            return false;
        }
        return true;
    }
}
