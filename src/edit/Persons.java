package edit;
import java.util.Objects;

public class Persons {
    private String nameFirst;
    private String nameLast;
    private int uid;

    public void Persons(String nameFirst, String nameLast, int uid) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.uid = uid;
    }
    public String getNameFirst(){
        return this.nameFirst;
    }
    public String getNameLast(){
        return this.nameLast;
    }
    public int getUid(){
        return this.uid;
    }

    public void setNameFirst(String nameFirst){
        this.nameFirst = nameFirst;
    }
    public void setNameLast(String nameLast){
        this.nameLast = nameLast;
    }
    public void setUid(int uid){
        this.uid = uid;
    }

    public String toString(){
        return "uid(" + uid + ") " + nameLast + '\t'+ nameFirst;
               
    }
    


 
    @Override
    public boolean equals(Object obj){
        
        if (this == obj) 
            return true;
        if (this == null || getClass() != obj.getClass()) 
             return false;
        Persons persona = (Persons) obj;
        return nameFirst.equals(persona.getNameFirst()) && nameLast.equals(persona.getNameLast());
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(nameFirst,nameLast,uid);
    }

}