public class Person{
    private String personName;
    private  int personBirthday;

    public void setPersonName(String personName){
        this.personName=personName;
    }

    public void setPersonBirthday(int personBirthday){
        this.personBirthday=personBirthday;
    }

    public String getPersonName(){
          return this.personName;
    }

    public int getPersonBirthday(){
        return this.personBirthday;
    }
}