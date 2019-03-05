package com.cucumber;

import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
/**
 * Created by Administrator on 2019/3/5.
 */
public class MyStepdefs {
    @当("^我打开qq邮箱网站$")
    public void open() {
        System.out.println("打开qq邮箱网站");
    }

    @并且("^我在email文本框输入\"([^\"]*)\"$")
    public void emailsend(String email){
        System.out.println("我输入了email:"+email);
    }

    @并且("^在密码文本框输入\"([^\"]*)\"$")
    public void PWd(String pwd) {
        System.out.println("我输入密码"+pwd);
    }

    @并且("^点击登录按钮$")
    public void click() {
        System.out.println("登录");
    }

    @那么("^登录成功$")
    public void clicksu(){
        System.out.println("登录成功");
    }
}
