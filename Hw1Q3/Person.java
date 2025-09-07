public class Person {
    private String firstName;
    private String lastName;
    private String id;


//Initilializing Constructor
    public Person(String fName, String lName, String num){
        firstName = fName;
        lastName = lName;
        id = num;
    }
//Getters (Accessor methods)
    public String getfName(){
        return firstName;
    }

     public String getlName(){
        return lastName;
    }

    public String getId(){
        return id;
    }


    //method to return a String with Person's info 
    @Override
    public String toString(){
        return "First Name : " + firstName + " Last Name: " + lastName + " ID: " + id;
    }   
}
