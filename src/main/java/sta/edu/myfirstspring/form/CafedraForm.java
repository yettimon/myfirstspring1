package sta.edu.myfirstspring.form;

public class CafedraForm {


    private String id;
    private String name;
    private String description;
    private String chief;


    public CafedraForm() {
    }

    public CafedraForm(String id, String name, String description, String chief) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.chief = chief;
    }


    public CafedraForm(String name, String description, String chief) {
        this.name = name;
        this.description = description;
        this.chief = chief;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }
}