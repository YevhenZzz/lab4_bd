package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "`components`", schema = "`Database_lab3_Bufan`")
public class ComponentsEntity {
    private Integer id;
    private String name;
    private String properties;
    private String contents;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "properties", nullable = false, length = 45)
    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Basic
    @Column(name = "contents", nullable = false, length = 45)
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComponentsEntity that = (ComponentsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (properties != null ? !properties.equals(that.properties) : that.properties != null) return false;
        if (contents!= null ? !contents.equals(that.contents) : that.contents != null) return false;
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
        return "ComponentsEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", properties='" + properties + '\'' +
                ", contents=" + contents +  '\'' +
                '}';
    }
}
