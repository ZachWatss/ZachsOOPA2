
package OOPA2;


public class Friend {
   private int userID;
   private int friendID;
   private String dateTime;
   
   public Friend (int userID, int friendID, String dateTime){
       this.userID = userID;
       this.friendID = friendID;
       this.dateTime = dateTime;
   }

  
    public int getUserID() {
        return userID;
    }//get UserID

   
    public void setUserID(int userID) {
        this.userID = userID;
    }//set UserID

  
    public int getFriendID() {
        return friendID;
    }//get Friend ID


    public void setFriendID(int friendID) {
        this.friendID = friendID;
    }//set friend ID

    public String getDateTime() {
        return dateTime;
    }// get date Time

  
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }//set Date Time
   
    public String details()
    {
        return userID +  "  " + friendID;
    }

}//end of class
