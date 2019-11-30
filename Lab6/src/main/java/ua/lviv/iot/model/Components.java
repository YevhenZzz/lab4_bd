package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "`components`", schema = "`Database_lab3_Bufan`")
public class Components {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "properties", nullable = false, length = 45)
    private String properties;
    @Column(name = "contents", nullable = false, length = 45)
    private String contents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


    public Components() {}

    public Components(Integer id, String name, String properties, String  contents) {
        this.id = id;
        this.contents = contents;
        this.properties = properties;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Components that = (Components) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (properties != null ? !properties.equals(that.properties) : that.properties != null) return false;
        if (contents != null ? !contents.equals(that.contents) : that.contents != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (properties != null ? properties.hashCode() : 0);
        result = 31 * result + (contents != null ? contents.hashCode() : 0);


        return result;
    }

    @Override
    public String toString() {
        return "Components{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", properties='" + properties + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }

}
