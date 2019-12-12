package com.tdsson.interface_test2;

public class UserService implements IUserService {
    User[] all = new User[10];
    static int num = 0;
    @Override
    public User login(String useranem, String password) {
        for (int i = 0;i<num;i++) {
            if(all[i].getUsername().equals(useranem)==true && all[i].getPassword().equals(password)){
                return all[i];
            }
        }
        return null ;
    }

    @Override
    public boolean regist(User user) {
        if( num<10 ){
            all[num] = user;
            num++;
            return true;
        }else{
            return false;
        }
    }
}
