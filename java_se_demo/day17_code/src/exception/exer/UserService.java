package com.tdsson.exception.exer;
/*2、声明一个用户管理类UserService类，包含User[] all
提供：void addUser(User user){
	//如果all数组满了，抛出对应的异常
	//如果用户名已存在，抛出对应的异常

	}
	User login(String username, String password){
		//如果用户名不存在，报用户名不存在异常
		//如果用户名或密码错误，报用户名或密码错误异常
		//正确就返回用户信息
	}
 */
public class UserService {
    private User[] all = new User[2];
    private int total;
    public void addUser(User user) throws UserArrayFullException,UserExistException  {
        if(total>=all.length){
            throw new UserArrayFullException("用户数组已满");
        }

        boolean flag = false;
        for(int i = 0;i< total;i++){
            if(all[i].getName().equals(user.getName())){
                flag = true;
                break;
            }
        }
        if(flag==true){
            throw new UserExistException("用户名已存在");
        }

        all[total++] = user;
    }
    public User login(String username, String password) throws UserNotExistException,UsernameOrPasswordErrorException{
        boolean flag = false;
        User user = null;
        for(int i = 0;i<=total;i++){
            if(all[i].getName().equals(username)){
                flag = true;
                user = all[i];
                break;
            }
        }
        if(flag == false){
            throw new UserNotExistException("用户名不存在");
        }
        //如果用户名或密码错误，报用户名或密码错误异常
        if(!user.getPassword().equals(password)){
            throw new UsernameOrPasswordErrorException("用户名或密码错误");
        }
        //正确就返回用户信息
        return user;
    }
}
