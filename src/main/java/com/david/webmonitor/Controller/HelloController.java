package com.david.webmonitor.Controller;

import com.david.webmonitor.Service.HelloSpringService;
import java.io.Serializable;



public class HelloController implements Serializable{
    
    private HelloSpringService helloSpringService;
    
    public String showHello(){
        return "Hellow From JSF Managed Bean++ "+helloSpringService.HelloSpring();
    }


    public void setHelloSpringService(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }
}
