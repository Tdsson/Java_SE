package com.tdsson.interface_test2;

public interface IUserService {
    User login(String useranem,String password);
    boolean regist(User user);
}
