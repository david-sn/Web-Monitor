package com.david.webmonitor.Hibernate.Sessions;

import com.david.webmonitor.Hibernate.DAO.CheckDAO;
import com.david.webmonitor.Hibernate.Entity.Checkers;
import org.springframework.beans.factory.annotation.Autowired;


public class InitDB {
    
    @Autowired
    CheckDAO checkDAO;
    
    public void init(){
            
        Checkers c =new Checkers();
        c.setName("asdsda");
        
        checkDAO.createCheckers(c);
        
    }
    
}
