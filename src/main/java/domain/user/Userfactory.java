package domain.user;

public class Userfactory {
    public User makeUser(String userType,String name){
        if(userType.equals("P")){
            return new ProductOwner(name);
        }
        else if(userType.equals("S")){
            return new ScrumMaster(name);
        }
        else if(userType.equals("D")){
            return new Developer(name);
        }
        else{
            return null;
        }
        //push
    }
}
