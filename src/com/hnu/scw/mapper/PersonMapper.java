package com.hnu.scw.mapper;

import com.hnu.scw.pojo.Person;

/**
 * @ Author     ：scw
 * @ Date       ：Created in 下午 3:21 2018/6/15 0015
 * @ Description：对应于person的mapper操作接口
 * @ Modified By：
 * @Version: $version$
 */
public interface PersonMapper {
    /**
     * 添加一个person实体
     * @param person
     */
    void addPerson(Person person);
}
