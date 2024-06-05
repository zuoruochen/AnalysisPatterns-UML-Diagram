package org.example.accountability;

import org.example.accountability.partytype.GeneralPartyType;
import org.example.accountability.partytype.GeneralPartyTypeFactory;
import org.example.accountability.partytype.GeneralPartyTypeRepository;

import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/4 16:13
 * @Description: PartyType保持单例，泛化关系不通过继承实现
 * @Version: v1.0
 * @see org.example.accountability.doctor
 * @see GeneralPartyType
 * @see GeneralPartyTypeFactory
 * @see GeneralPartyTypeRepository
 */


public interface PartyType {
    /**
     * 一个字类型允许有多个超类型，实现多重继承
     *
     * @return 父参与方类型列表
     */
    List<PartyType> getSuperTypes();

    /**
     * @return 参与方类型名称
     */
    default String getName() {
        return this.getClass().getCanonicalName();
    }
}
