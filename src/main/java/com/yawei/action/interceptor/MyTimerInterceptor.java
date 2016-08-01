package com.yawei.action.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyTimerInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionProxy actionProxy = invocation.getProxy();
        String namespace = actionProxy.getNamespace();
        String method = actionProxy.getMethod();
        String actionName = actionProxy.getActionName();

        Long startTime = System.currentTimeMillis();
        String result = actionProxy.execute();
        Long endTime = System.currentTimeMillis();

        System.out.println((namespace + "/" + actionName) + " 方法:" +method + "耗费:" +(endTime-startTime) + "ms");
        return null;
    }
}
