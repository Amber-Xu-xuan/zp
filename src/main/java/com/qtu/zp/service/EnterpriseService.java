package com.qtu.zp.service;

import com.qtu.zp.domain.Enterprise;
import com.qtu.zp.domain.JobPosition;
import com.qtu.zp.model.PageModel;

import java.util.List;

/**
 * @Author: AmberXu
 * @Date: 2019/4/11 21:52
 */
public interface EnterpriseService {
    List<Enterprise> getAllEnterprise();

    //     通过电话号码获取用户信息
    Enterprise findEnterpriseByPhone(String phone);

    //    获取岗位信息(分页）
    PageModel findJobListByEName(Integer pageCode, Integer pageSize,String eName);



}
