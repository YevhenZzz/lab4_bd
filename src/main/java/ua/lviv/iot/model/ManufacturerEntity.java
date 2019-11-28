package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "`manufacturer`", schema = "`Database_lab3_Bufan`")
public class ManufacturerEntity {
    private Integer id;
    private String country;
    private String type_of_drugs;
    private String safety;
    private String stock;

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
    @Column(name = "country", nullable = false, length = 45)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "type_of_drugs", nullable = false, length = 45)
    public String getType_of_drugs() {
        return type_of_drugs;
    }

    public void setType_of_drugs(String type_of_drugs) {
        this.type_of_drugs = type_of_drugs;
    }

    @Basic
    @Column(name = "safety", nullable = false, length = 45)
    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    @Basic
    @Column(name = "stock", nullable = false, length = 45)
    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManufacturerEntity that = (ManufacturerEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (type_of_drugs != null ? !type_of_drugs.equals(that.type_of_drugs) : that.type_of_drugs != null) return false;
        if (safety != null ? !safety.equals(that.safety) : that.safety != null) return false;
        if (stock != null ? !stock.equals(that.stock) : that.stock != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (country!= null ? country.hashCode() : 0);
        result = 31 * result + (type_of_drugs != null ? type_of_drugs.hashCode() : 0);
        result = 31 * result + (safety != null ? safety.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "UsingEntity{" +
                "id=" + id +
                ", surname='" + country + '\'' +
                ", location='" + type_of_drugs + '\'' +
                ", popularity=" + safety +
                ", products=" + stock + '\'' +
                '}';
    }
}