package Test1;

public class Sample {
    public static void main(String[] args){
        ContractBook[] contractBook = new ContractBook[4];
        contractBook[0] = new ContractBook ("Somsak","0881234561");
        contractBook[1] = new ContractBook ("Venis","0asdccs012");
        contractBook[2] = new ContractBook ("Vichit","00010002");
        contractBook[3] = new ContractBook ("Chartchai","+660000000");
        
        for (int i = 0; i < 4; i++) {
            try{
                validate(contractBook[i].getName(),contractBook[i].getTel());
                System.out.println("Valid : " + contractBook[i].getName());
            }
            catch(NonDigitException | LengthNotMatchException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void validate(String name,String tel) throws NonDigitException, LengthNotMatchException{
         if(tel.length() < 10)
             throw new LengthNotMatchException(name + " phone length not match: " + tel);
         else if(getNonDigit(tel))
            throw new NonDigitException(name + " phone contain non digits : " + tel);
            
        
    }
    
    public static boolean getNonDigit(String tel){
        for (int i = 0; i < tel.length(); i++) {
            char ch = tel.charAt(i);
            if(ch < '0' || ch > '9')
                return false;
        }
        return true;
    }
}
