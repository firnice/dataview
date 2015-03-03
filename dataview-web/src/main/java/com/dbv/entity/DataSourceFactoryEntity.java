package com.dbv.entity;

import javax.persistence.*;

/**
 * Created by firnice on 15/3/3.
 */
@Entity
@Table(name = "DATA_SOURCE_FACTORY", schema = "PUBLIC", catalog = "DBV")
public class DataSourceFactoryEntity {
    private String id;
    private String driver;
    private String urlstr;
    private String username;
    private String userpassword;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DRIVER")
    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    @Basic
    @Column(name = "URLSTR")
    public String getUrlstr() {
        return urlstr;
    }

    public void setUrlstr(String urlstr) {
        this.urlstr = urlstr;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "USERPASSWORD")
    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataSourceFactoryEntity that = (DataSourceFactoryEntity) o;

        if (driver != null ? !driver.equals(that.driver) : that.driver != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (urlstr != null ? !urlstr.equals(that.urlstr) : that.urlstr != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (userpassword != null ? !userpassword.equals(that.userpassword) : that.userpassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (urlstr != null ? urlstr.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (userpassword != null ? userpassword.hashCode() : 0);
        return result;
    }
}
