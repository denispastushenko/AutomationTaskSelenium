package utils;

import java.util.Base64;

public class Actions {

    public  static String pass(){
        return new String(Base64.getDecoder().decode("MTIzNDU2Nzg5YUI="));
    }
}
