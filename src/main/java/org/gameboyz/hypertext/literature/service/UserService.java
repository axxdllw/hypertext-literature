package org.gameboyz.hypertext.literature.service;

import org.gameboyz.hypertext.literature.pojo.User;
import org.gameboyz.hypertext.literature.pojo.form.UserForm;

/**
 * @author: Shiina18
 * @date: 2019/6/4 21:03
 * @description:
 */
public interface UserService {
    User login(UserForm userForm);

    User register(UserForm userForm);
}
