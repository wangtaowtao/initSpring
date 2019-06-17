package com.wtao.service;

import com.wtao.common.ServerResponse;
import com.wtao.pojo.User;

/**
 * @ClassName IUserService
 * @Description TODO
 * @author wtao wangtao@eyaoshun.com
 * @date 2019年6月17日 下午2:03:00
 */

public interface IUserService {

    ServerResponse<User> login(String username, String password);
    
}