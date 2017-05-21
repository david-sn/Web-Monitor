package com.david.webmonitor.Hibernate.DAO;

import com.david.webmonitor.Hibernate.Entity.Checkers;
import com.david.webmonitor.Hibernate.Sessions.NewHibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Transactional
@Service
@Repository
public class CheckDAO {

    public CheckDAO() {
        System.out.println("Checkers-DAO-`Impl");
    }

    @Autowired
    private NewHibernateUtil hibernateUtil;
 

    public int createCheckers(Checkers checkers) {
        return (int) hibernateUtil.create(checkers);
    }
    
    public Checkers updateCheckers(Checkers checkers) {
        return hibernateUtil.update(checkers);
    }

    public void deleteCheckers(int id) {
        hibernateUtil.delete(id);
    } 
    
    public List<Checkers> getAllCheckerss() {
        return hibernateUtil.fetchAll(Checkers.class);
    }

    public Checkers getCheckers(int id) {
        return hibernateUtil.fetchById(id, Checkers.class);
    }
 
}
