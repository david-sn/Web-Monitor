package com.david.webmonitor.Hibernate.Sessions;

import com.david.webmonitor.Hibernate.DAO.CheckDAO;
import com.david.webmonitor.Hibernate.Entity.Checkers;
import org.springframework.beans.factory.annotation.Autowired;

public class InitDB {

    @Autowired
    CheckDAO checkDAO;

    public void init() {

        {
            Checkers c = new Checkers();
            c.setName("google");
            c.setUrl("www.google.com");
            checkDAO.createCheckers(c);
        }
        {
            Checkers c = new Checkers();
            c.setName("example");
            c.setUrl("www.example.com");
            checkDAO.createCheckers(c);
        }
        {
            Checkers c = new Checkers();
            c.setName("twitter");
            c.setUrl("www.twitter.com");
            checkDAO.createCheckers(c);
        }
    }

}
