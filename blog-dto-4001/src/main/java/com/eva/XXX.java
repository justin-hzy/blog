package com.eva;

public class XXX {
    public int id;
    public String username;
    public String password;
    public XXX() {
        this.id = 1;
        this.username = "1111";
        this.password = "1111";
    }

    public XXX(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "xxx:"+this.id+ "   " +this.username+"   "+this.password;
    }
}
