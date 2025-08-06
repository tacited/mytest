package com.powernode.sb3011springbootmybatis.resporitory;

import com.powernode.sb3011springbootmybatis.model.Vip;

import java.util.List;

public interface VipMapper {
    int insert(Vip vip);

    int deleteById(Long id);
    int update(Vip vip);
    Vip selectById(Long id);
    List<Vip> selectAll();
}
