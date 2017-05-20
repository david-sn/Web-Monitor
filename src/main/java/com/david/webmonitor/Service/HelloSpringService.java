package com.david.webmonitor.Service;

import java.io.Serializable;
import org.springframework.stereotype.Service;

public class HelloSpringService implements Serializable{

    
    public String HelloSpring() {
        return "Hellow From Service Spring";
    }
}
