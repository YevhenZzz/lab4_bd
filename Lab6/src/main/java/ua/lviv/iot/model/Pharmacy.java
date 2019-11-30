package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "`pharmacy`", schema = "`Database_lab3_Bufan`")
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "location", nullable = false, length = 45)
    private String location;
    @Column(name = "popularity", nullable = false, length = 45)
    private String popularity;
    @Column(name = "products", nullable = false, length = 45)
    private String products;
    @Column(name = "chain", nullable = false, length = 45)
    private String chain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public Pharmacy() {}

    public Pharmacy(Integer id, String name, String location, String  popularity, String products, String chain) {
       this.id = id;
       this.chain = chain;
       this.products = products;
       this.popularity = popularity;
       this.location = location;
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

        Pharmacy that = (Pharmacy) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (popularity != null ? !popularity.equals(that.popularity) : that.popularity != null) return false;
        if (products != null ? !products.equals(that.products) : that.products != null) return false;
        if (chain != null ? !chain.equals(that.chain) : that.chain != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (popularity != null ? popularity.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        result = 31 * result + (chain != null ? chain.hashCode() : 0);

        return result;
    }
    @Override
    public String toString() {
        return "Pharmacy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", popularity='" + popularity + '\'' +
                ", products='" + products + '\'' +
                ", chain='" + chain + '\'' +
                '}';
    }
}
