package domain.users;

public class Userfactory {

    public User makeUser(String userType,String name){
        if(userType == "P"){
            return new ProductOwner(name);
        }
        else if(userType == "S"){
            return new ScrumMaster(name);
        }
        else if(userType == "D"){
            return new Developer(name);
        }
        else{
            return null;
        }
    }
}
