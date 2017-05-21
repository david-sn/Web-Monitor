package com.david.webmonitor.Service;

import com.david.webmonitor.Hibernate.DAO.CheckDAO;
import com.david.webmonitor.Hibernate.Entity.Checkers;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckerBean implements Serializable {

    private List<Checkers> list;

    @Autowired
    private CheckDAO checkDAO;

    private Checkers checkers=new Checkers();

    public void init2() {
        System.out.println("*****************");
        list = checkDAO.getAllCheckerss();
   }

    public void Save() {
        checkDAO.createCheckers(checkers);
        checkers=new Checkers();
        init2();
        
        FacesContext.getCurrentInstance().addMessage("msg", new FacesMessage(FacesMessage.SEVERITY_INFO,"Data Saved ...",null));
    }

    public List<Checkers> getList() {
        return list;
    }

    public Checkers getCheckers() {
        return checkers;
    }

    public void setCheckers(Checkers checkers) {
        this.checkers = checkers;
    }
    

}
