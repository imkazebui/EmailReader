package my.emailreader.EmailReaderJava.model;

public class User 
{
    private int id;
    private String email;
    private String password;
    private String fname;
    private String lname;
    public int getId(){
            return id;
    }
    public void setId(int id){
            this.id = id;
    }
    public String getEmail() {
            return email;
    }
    public void setEmail(String email) {
            this.email = email;
    }
    public String getPassword() {
            return password;
    }
    public void setPassword(String password) {
            this.password = password;
    }
    public String getFname() {
            return fname;
    }
    public void setFname(String fname) {
            this.fname = fname;
    }
    public String getLname() {
            return lname;
    }
    public void setLname(String lname) {
            this.lname = lname;
    }
}
	