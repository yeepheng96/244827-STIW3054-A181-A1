package com.InAsg1;

import java.lang.*;

public class Info {
    private String th;
    private String td;

    public Info(){
        super();
    }

    public Info (String th, String td){
        super();
        this.th = th;
        this.td = td;
    }

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }
}
