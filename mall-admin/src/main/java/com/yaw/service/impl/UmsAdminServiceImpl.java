package com.yaw.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.yaw.dto.UmsAdminParam;
import com.yaw.entity.UmsAdmin;
import com.yaw.example.UmsAdminExample;
import com.yaw.service.UmsAdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 后台管理实现类
 *
 * @author Yaw
 * @createTime 2019/6/3 23:55
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);

        EntityWrapper ew = new EntityWrapper();
        ew.setEntity(new UmsAdmin());
        ew.where("username = {0}",umsAdmin.getUsername());
        //查询是否有相同用户名的用户
        UmsAdminExample example = new UmsAdminExample();
     /*   example.createCriteria().andUsernameEqualTo(umsAdmin.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        adminMapper.insert(umsAdmin);*/
        return umsAdmin;
    }

}
