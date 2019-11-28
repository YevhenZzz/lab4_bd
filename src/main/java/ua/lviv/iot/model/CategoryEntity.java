package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "`Database_lab3_Bufan`")
public class CategoryEntity {
    private Integer id;
    private String name;
    private String type;
    private String quantity;

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
    @Column(name = "type", nullable = false, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "quantity", nullable = false, length = 45)
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type!= null ? !type.equals(that.type) : that.type != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "id=" + id +
                ", surname='" + name + '\'' +
                ", location='" + type + '\'' +
                ", popularity=" + quantity + '\'' +
                '}';
    }
}