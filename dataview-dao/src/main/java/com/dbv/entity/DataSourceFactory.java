package com.dbv.entity;

/**
 * Created by firnice on 15/3/3.
 */
public class DataSourceFactory {

    private String id;

    /**
     * 数据库驱动类名称
     */
    private   String driver ;

    /**
     * 连接字符串
     */
    private  String urlstr ;

    /**
     * 用户名
     */
    private  String userName ;

    /**
     * 密码
     */
    private  String userPassword ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrlstr() {
        return urlstr;
    }

    public void setUrlstr(String urlstr) {
        this.urlstr = urlstr;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
