package com.powernode.sb3013ssm.service.impl;

import com.powernode.sb3013ssm.model.Vip;
import com.powernode.sb3013ssm.repository.VipMapper;
import com.powernode.sb3013ssm.service.VipService;
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
