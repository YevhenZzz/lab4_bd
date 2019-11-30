package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "`using`", schema = "`Database_lab3_Bufan`")
public class Using {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Column(name = "type_of_using", nullable = false, length = 45)
    private String type_of_using;
    @Column(name = "number", nullable = false, length = 45)
    private String number;
    @Column(name = "time", nullable = false, length = 45)
    private String time;
    @Column(name = "usingcol", nullable = false, length = 45)
    private String usingcol;
    @Column(name = "contrainidation", nullable = false, length = 45)
    private String contrainidation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType_of_using() {
        return type_of_using;
    }

    public void setType_of_using(String type_of_using) {
        this.type_of_using = type_of_using;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsingcol() {
        return usingcol;
    }

    public void setUsingcol(String usingcol) {
        this.usingcol = usingcol;
    }

    public String getContrainidation() {
        return contrainidation;
    }

    public void setContrainidation(String contrainidation) {
        this.contrainidation = contrainidation;
    }

    @Override
    public String toString() {
        return "Using{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type_of_using='" + type_of_using + '\'' +
                ", number='" + number + '\'' +
                ", time='" + time + '\'' +
                ", usingcol='" + usingcol + '\'' +
                ", contrainidation='" + contrainidation + '\'' +
                '}';
    }

    public Using() {}

    public Using(Integer id, String name, String type_of_using, String  number, String time, String usingcol, String contrainidation) {
        this.id = id;
        this.usingcol = usingcol;
        this.time = time;
        this.number = number;
        this.type_of_using = type_of_using;
        this.name = name;
        this.contrainidation = contrainidation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Using that = (Using) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type_of_using != null ? !type_of_using.equals(that.type_of_using) : that.type_of_using != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (usingcol != null ? !usingcol.equals(that.usingcol) : that.usingcol != null) return false;
        if (contrainidation != null ? !contrainidation.equals(that.contrainidation) : that.contrainidation != null) return false;



        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type_of_using != null ? type_of_using.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (usingcol != null ? usingcol.hashCode() : 0);
        result = 31 * result + (contrainidation != null ? contrainidation.hashCode() : 0);


        return result;
    }

}
