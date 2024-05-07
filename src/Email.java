import java.io.Serializable;

public class Email implements Serializable {
    String Fname;
    String Lname;
    String identifier;
    String lemail;

    public Email(String fname, String lname, String identifier, String lemail) {
        Fname = fname;
        Lname = lname;
        this.identifier = identifier;
        this.lemail = lemail;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLemail() {
        return lemail;
    }

    public void setLemail(String lemail) {
        this.lemail = lemail;
    }

    @Override
    public String toString() {
        return "Email" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", identifier='" + identifier + '\'' +
                ", lemail='" + lemail + '\'' +
                '}';
    }
}
