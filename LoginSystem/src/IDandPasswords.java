import java.util.HashMap;       
         
public class IDandPasswords {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPasswords(){

        loginInfo.put("JavaScript Object Notation","JSON");
        loginInfo.put("C Plus Plus","CPP");
        loginInfo.put("Java","Coffee");
        loginInfo.put("Anything","Anything");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
