package ejb;

import javax.ejb.Stateless;

@Stateless(name = "SessionBEJB")
public class SessionBBean {
    public SessionBBean() {

    }
    public String Hello(){
        return "Hello World!";

    }
}
