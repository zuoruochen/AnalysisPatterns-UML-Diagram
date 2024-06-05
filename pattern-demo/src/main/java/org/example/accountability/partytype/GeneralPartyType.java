package org.example.accountability.partytype;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import org.example.accountability.PartyType;

import java.util.List;

/**
 * @Author : zuoruochen
 * @Date : 2024/6/5 10:00
 * @Description: 可动态创建配置化的PartyType，不同于{@link org.example.accountability.doctor} 包下预定义好的单实例类型，动态创建不同参与方类型，通过工厂进行创建
 * @Version: v1.0
 */

@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GeneralPartyType implements PartyType {
    /**
     * 参与方类型名称
     */
    @EqualsAndHashCode.Include
    private String name;

    /**
     * 实例ID，如果存储在数据库中，可以作为主键id
     */
    private Long id;


    private List<PartyType> superTypes;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<PartyType> getSuperTypes() {
        return superTypes;
    }

}
