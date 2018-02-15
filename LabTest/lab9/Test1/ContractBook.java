package Test1;

public class ContractBook {
    private String name = "";
    private String tel = "";
    
    public ContractBook(String name,String tel){
        this.name = name;
        this.tel = tel;
    }
    
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
}
