package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "`manufacturer`", schema = "`Database_lab3_Bufan`")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "country", nullable = false, length = 45)
    private String country;
    @Column(name = "type_of_drugs", nullable = false, length = 45)
    private String type_of_drugs;
    @Column(name = "safety", nullable = false, length = 45)
    private String safety;
    @Column(name = "stock", nullable = false, length = 45)
    private String stock;

    public Manufacturer() {}

    public Manufacturer(Integer id, String country, String type_of_drugs, String  safety, String stock) {
        this.id = id;
        this.stock = stock;
        this.safety = safety;
        this.type_of_drugs = type_of_drugs;
        this.country = country;
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

        Manufacturer that = (Manufacturer) o;

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
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (type_of_drugs != null ? type_of_drugs.hashCode() : 0);
        result = 31 * result + (safety != null ? safety.hashCode() : 0);
        result = 31 * result + (stock != null ? stock.hashCode() : 0);

        return result;
    }
    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", type_of_drugs='" + type_of_drugs + '\'' +
                ", safety='" + safety + '\'' +
                ", stock='" + stock + '\'' + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType_of_drugs() {
        return type_of_drugs;
    }

    public void setType_of_drugs(String type_of_drugs) {
        this.type_of_drugs = type_of_drugs;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
