package com.yaw.service;

import com.yaw.dto.UmsAdminParam;
import com.yaw.entity.UmsAdmin;

/**
 * 后台管理员Service
 *  @author Yaw
 *  * @createTime 2019/6/3 22:55
 */
public interface UmsAdminService {

    /**
     * 注册功能
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

}
