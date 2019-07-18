package com.pck.pro_demofacade.service.user;

import com.pck.pro_demofacade.ro.user.UserRo;

/**
 * @description: 用户业务
 * @program: pro_demo
 * @author: pancikai
 * @create: 2019/07/18 14:03
 * @version: 1.0
 */
public interface UserService {

    public void insertUser(UserRo userRo);

    public UserRo getUser(Long UserId);

    public void updateUser(UserRo userRo);

    public void deleteUser(UserRo userRo);






}
