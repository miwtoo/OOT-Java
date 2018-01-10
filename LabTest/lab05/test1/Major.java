
package oot.lab5.test;


public class Major {
    private String mid = "";
    private String mname = "";
    public Major(String mid, String mname){
        this.mid = mid;
        this.mname = mname;
    }
    
    public String getMid(){
        return mid;
    }
    
    public void setMid(String mid){
        this.mid = mid;
    }
    
    public String getMname(){
        return mname;
    }
    
    public void setMname(String sid){
        this.mname = mname;
    }
}
