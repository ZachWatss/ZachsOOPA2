
package OOPA2;


import java.util.ArrayList;
import java.time.*;
import java.time.format.*;
//imports 

public class AppData {
    
    public static ScrMain mainScreen;
    public static ScrSplash splashScreen;
    public static frmRegister scrRegister;
    public static frmMainMenu scrMainMenu;
    public static LogIn scrLogin;
    public static frmAddPost scrAddPosts;
    public static frmMyPosts scrMyPosts;
    public static frmPublicPosts scrPublicPosts;
    public static frmViewFriendsPost scrViewFriendsPost;
    public static frmAddFriend scrAddFriend;
    public static frmFriendsMenu scrFriendsMenu;
    
     
    
   public static ArrayList usersAL = new ArrayList();
   public static ArrayList postsAL = new ArrayList();
   public static ArrayList friendsAL = new ArrayList();
   
   //array list for users and posts and friends 
   
   public static User loggedOn;
    
    public static String genDate2()
    {
        LocalDate today = LocalDate.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        
        String dateStr = today.format(formatter);
        
        return dateStr;
    }
   
    public static String genDate()
    {
        LocalDate today = LocalDate.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        
        String dateStr = today.format(formatter);
        
        return dateStr;
    }
    
    public static String genDateTime()
    {
       LocalDateTime dateTime = LocalDateTime.now();
        
        DateTimeFormatter formatterDT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String dateTimeStr = dateTime.format(formatterDT);
        
        return dateTimeStr;
    }
    
    public static Boolean isUnique(int id)
    {
        for(int index =0; index< usersAL.size(); index++)
        {
            User auser =(User)usersAL.get(index);
            if(auser.getUserID() == id)
            {
                return false;
            }

        }
       return true;
    }
    
     public static Boolean isUniquePostID(int pid)
    {
        for(int index =0; index< postsAL.size(); index++)
        {
            Posts post =(Posts)postsAL.get(index);
            if(post.getPostID()== pid)
            {
                return false;
            }

        }
       return true;
    }
        
     public static boolean vaildLogon(String email, String password)
     {
          for(int index =0; index< usersAL.size(); index++)
        {
            User auser =(User)usersAL.get(index);
            if(auser.getEmail().equals(email) && auser.getPassword().equals(password))
            {
                auser.setLastLogin(genDateTime());
                loggedOn = auser;
                return true; 
            }

        }
       return false;
     }//vaildLogon
     
     
     public static Posts findPost(int pid){
         for(int index =0; index< postsAL.size(); index++)
        {
            Posts post =(Posts)postsAL.get(index);
            if(post.getPostID()== pid)
            {
                return post;
            }

        }//for
       return null;
     }//find post
     
     
     
    public static User findUser(int uid){
         for(int index =0; index< usersAL.size(); index++)
        {
            User foundUser =(User)usersAL.get(index);
            if(foundUser.getUserID()== uid)
            {
                return foundUser;
            }

        }//for
       return null;
     }//find post
     
    public static boolean friendAlready(int uid, int fid)
    {
        
        
        for(int index =0; index < friendsAL.size(); index++)
        {
            Friend frd = (Friend) friendsAL.get(index);
            if(frd.getUserID()== uid && frd.getFriendID() == fid)
            {
                return true;
            }
        }
        return false;
    }
     
     public static void loadData()
{
User tmpUser = new User(3355, "Paddy","stein", "02/03/44",
"f@s.com", "pass", "09/05/26");
tmpUser.setLocked(false);
tmpUser.setFriends(0);
tmpUser.setLastLogin("N/A");
usersAL.add(tmpUser);
tmpUser = new User(4242,"Max","Mc","08/03/77","b@b.com","maxmcc",
"09/05/26");
tmpUser.setLocked(false);
tmpUser.setFriends(0);
tmpUser.setLastLogin("N/A");
usersAL.add(tmpUser);
tmpUser = new User(6534,
"Zach","watson","20/12/2005","zach@zach.com","pwd","14/05/26");
tmpUser.setLocked(false);
tmpUser.setFriends(0);
tmpUser.setLastLogin("N/A");
usersAL.add(tmpUser);
tmpUser = new User(1007,
"Erin","McManus","23/11/04","emcmanus@gmail.com","erni","14/05/26");
tmpUser.setLocked(false);
tmpUser.setFriends(0);
tmpUser.setLastLogin("N/A");
usersAL.add(tmpUser);
tmpUser = new User(8888, "Ted", "jim", "12/10/01", "t@b.com",
"Pass", "07/05/26");
tmpUser.setLocked(false);
tmpUser.setFriends(0);
tmpUser.setLastLogin("N/A");
usersAL.add(tmpUser);
Image imgPost;
Text txtPost;
imgPost = new Image(23456, 3355, "public", "08/05/26 11:54:20",
"myfile.txt", "big file", "c:/temp");
AppData.postsAL.add(imgPost);
txtPost = new Text(23467, 3355, "private", "08/05/26 11:54:30",
"I love Cats");
AppData.postsAL.add(txtPost);
imgPost = new Image(23400, 4242, "public", "08/05/26 11:55:20",
"myBlog.txt", "what i done today", "belfast");
AppData.postsAL.add(imgPost);
txtPost = new Text(23404, 4242, "private", "08/05/26 11:56:30",
"I Love this new app treadly");
AppData.postsAL.add(txtPost);
imgPost = new Image(23401, 4242, "public", "08/05/26 11:55:20",
"Threadly.txt", "my review of threadly so far", "USA");
AppData.postsAL.add(imgPost);
txtPost = new Text(23444, 3355, "public", "08/05/26 11:56:30",
"I got a new car today.Also love this new threadly app!");
AppData.postsAL.add(txtPost);
}//loadData
}//end of class
