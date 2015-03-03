package com.dbv.security;

import com.google.inject.internal.util.$Lists;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

/**
 * Created by firnice on 14/11/19.
 */
@Component("shiroDbRealm")
public class ShiroDbRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        UsernamePasswordToken token = (UsernamePasswordToken) principalCollection.getPrimaryPrincipal();

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // 基于Role的权限信息
        info.addRole("admin");
        // 基于Permission的权限信息
        info.addStringPermissions($Lists.newArrayList("admin"));
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        if (token != null) {
            return new SimpleAuthenticationInfo(token, token.getPassword(), getName());
        } else {
            return null;
        }
    }
}

