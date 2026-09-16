

package OOPA2;


public class User {
    private int userID;
    private String  firstName;
    private String surname;
    private String dateOfBirth;
    private String email;
    private String password;
    private boolean locked;
    private String lastLogin;
    private String  registeredDate;
    private int friends;

 
    public User(int userID,String firstName,String surname,String dateOfBirth,String email,String password,String registeredDate){
    
        this.userID = userID;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.locked = false;
        this.lastLogin = "N/A";
        this.registeredDate = registeredDate;
        this.friends = 0;
        
}//construtor 
    public int getUserID() {
        return userID;
    }//getUserID


 
    public String getFirstName() {
        return firstName;
    }//getFname

   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//setfName
  
    public String getSurname() {
        return surname;
    }//getsurname

  
    public void setSurname(String surname) {
        this.surname = surname;
    }//setsurname

  
    public String getDateOfBirth() {
        return dateOfBirth;
    }//getDOB

   
    public String getEmail() {
        return email;
    }//get Email

   
    public void setEmail(String email) {
        this.email = email;
    }//set email

    
    public String getPassword() {
        return password;
    }//get password

    public boolean getLocked() {
        return locked;
    }//locked
   
    public void setPassword(String password) {
        this.password = password;
    }//set password

  
    public String getLastLogin() {
        return lastLogin;
    }//get Last login

   
    public String getRegisteredDate() {
        return registeredDate;
    }//get reg date

  
    public int getFriends() {
        return friends;
    }// Friend count 
    
    public String basicInfo()
            {
                return userID+ "  " + this.firstName + "   " + surname;
            }
    
    public String fullDetails()
    {
        String output = "<html>User Info<br>";
        output += "User ID: " +  userID + "<br>";
        output += "Name: " +  firstName + " " + surname + "<br>";
        output += "DOB: " +  dateOfBirth + "<br>";
        output += "Email: " +  email + "<br>";
        output += "Locked: " +  locked + "<br>";
        output += "Last Login: " + lastLogin + "<br>";
        output += "Registered: " +  registeredDate + "<br>";
        output += "Friends" +  friends + "<br>";
        
        return output;
    }

 
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
    
     public void setLocked(boolean yn){
         locked = yn;
     }

    /**
     * @param friends the friends to set
     */
    public void setFriends(int friends) {
        this.friends = friends;
    }
     
     
}//end of class 
