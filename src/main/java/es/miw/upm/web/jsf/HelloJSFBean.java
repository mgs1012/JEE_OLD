package es.miw.upm.web.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloJSFBean {
    private String name="Hola, desde Bean. OK!!!";

    public String getName() {
        return name;
    }
    
    public String name(){
    	return name;
    }
}
