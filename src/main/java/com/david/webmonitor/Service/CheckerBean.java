package com.david.webmonitor.Service;

import com.david.webmonitor.Hibernate.DAO.CheckDAO;
import com.david.webmonitor.Hibernate.Entity.Checkers;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckerBean implements Serializable {

    private List<Checkers> list;

    @Autowired
    private CheckDAO checkDAO;

    public void init2() {
        System.out.println("*****************");
        list = checkDAO.getAllCheckerss();

        list.forEach((V) -> {
            System.out.println(V.getName());
        });

    }

    public List<Checkers> getList() {
        return list;
    }

    
}
