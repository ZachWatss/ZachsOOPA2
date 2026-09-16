
package OOPA2;


public class Image extends Posts {
    private String name;
    private String description;
    private String location;
    
public Image(int postID, int userID, String postSecurity, String date, String name, String description, String location){
    super(postID,  userID,  postSecurity,  date);
    this.name = name;
    this.description = description;
    this.location = location;
}//construtor


  
    public String getName() {
        return name;
    }//get name

 
    public void setName(String name) {
        this.name = name;
    }//set name


    public String getDescription() {
        return description;
    }//get description 

  
    
    public void setDescription(String description) {
        this.description = description;
    }// set discription 

    
    public String getLocation() {
        return location;
    } // get location

  
    public void setLocation(String location) {
        this.location = location;
    }// set location

    public String getPostDetails()
    {
       String details = "<html>Post Details<br>";
        details += "Image Name: " + getName() + "<br>";
        details += "Description: " + getDescription() + "<br>";
        details += "Location : " + getLocation() + "<br>";
        return details;
 
    }
    
}//construtor
