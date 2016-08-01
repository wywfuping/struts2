package com.yawei.action;


import com.opensymphony.xwork2.ActionContext;
import com.yawei.pojo.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserAction extends BaseAction {

    private User user;
    private List<String> names;

    public String newUser() {
        ActionContext actionContext = ActionContext.getContext();
        Map<String,Object> session = actionContext.getSession();
        session.put("hello","world");

        System.out.println("user new");
        return SUCCESS;
    }

    public String save() {
        System.out.println("username" + user.getUsername() + "address:" + user.getAddress());
        return SUCCESS;
    }

    public String list() {
        System.out.println("user list ....");

        names = new ArrayList<>();
        names.add("wang");
        names.add("ya");
        names.add("wei");

        return SUCCESS;
    }

    //get set

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
