package sta.edu.myfirstspring.model;

import java.time.LocalDateTime;

public class Group {

    private String id;
    private String name;
    private String description;
    Cafedra cafedra;
    LocalDateTime createAt, updateAt;


    public Group() {
    }

    public Group(String name, String description, Cafedra cafedra) {
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
    }

    public Group(String id, String name, String description, Cafedra cafedra, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Group(String id, String name, String description, Cafedra cafedra) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
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

    public Cafedra getCafedra() {
        return cafedra;
    }

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
