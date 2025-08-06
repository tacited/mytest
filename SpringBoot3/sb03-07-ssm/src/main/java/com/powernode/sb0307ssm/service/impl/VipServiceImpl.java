package com.powernode.sb0307ssm.service.impl;

import com.powernode.sb0307ssm.model.Vip;
import com.powernode.sb0307ssm.repository.VipMapper;
import com.powernode.sb0307ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("vipService")
public class VipServiceImpl implements VipService {

    @Autowired
    private VipMapper vipMapper;

    @Override
    public Vip getById(Long id) {
        return vipMapper.selectByPrimaryKey(id);
    }
}
