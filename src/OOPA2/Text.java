
package OOPA2;


public class Text extends Posts {
    
    private String text;

    public Text(int postID, int userID, String postSecurity, String date, String text){
        super(postID,  userID,  postSecurity,  date);
        this.text = text;
    }
    public String getText() {
        return text;
    }//get text

   
    public void setText(String text) {
        this.text = text;
    }//set text 
    
        public String getPostDetails(){
        String details = "<html>Post Details<br>";
        details += "Post Text: " + getText() + "<br>";
        return details;
    }

    
}//end of class 
