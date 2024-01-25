package at.kaindorf.pomos;

public class Manuel {
    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean isEmo;
    private String bigFanOf;

    public Manuel(String firstName, String lastName, Integer age, Boolean isEmo, String bigFanOf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isEmo = isEmo;
        this.bigFanOf = bigFanOf;
    }


    public String toString() {
        String txt = "";
        txt += "Hello, my Name is ";
        txt += firstName;
        txt += " ";
        txt += lastName;
        txt += " , I am";
        txt += age;
        txt += " years old, I am also ";
        if (!isEmo) txt += "not ";
        txt += "an Emo.";
        txt += "\n";
        txt += "Additionally, I am a big fan of";
        txt += bigFanOf;

        return txt;
    }
}
