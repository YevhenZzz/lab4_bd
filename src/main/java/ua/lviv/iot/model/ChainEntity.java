package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "`chain`", schema = "`Database_lab3_Bufan`")
public class ChainEntity {
    private Integer id;
    private String podorozhnik;
    private String ze;
    private String ds;

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
    @Column(name = "podorozhnik", nullable = false, length = 45)
    public String getPodorozhnik() {
        return podorozhnik;
    }

    public void setPodorozhnik(String podorozhnik) {
        this.podorozhnik = podorozhnik;
    }
    @Basic
    @Column(name = "ze", nullable = false, length = 45)
    public String getZe() {
        return ze;
    }

    public void setZe(String ze) {
        this.ze = ze;
    }
    @Basic
    @Column(name = "ds", nullable = false, length = 45)
    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChainEntity that = (ChainEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (podorozhnik != null ? !podorozhnik.equals(that.podorozhnik) : that.podorozhnik != null) return false;
        if (ze != null ? !ze.equals(that.ze) : that.ze != null) return false;
        if (ds != null ? !ds.equals(that.ds) : that.ds != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (podorozhnik != null ? podorozhnik.hashCode() : 0);
        result = 31 * result + (ze != null ? ze.hashCode() : 0);
        result = 31 * result + (ds != null ? ds.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "ChainEntity{" +
                "id=" + id +
                ", podorozhik='" + podorozhnik + '\'' +
                ", ze='" + ze + '\'' +
                ", ds=" + ds + '\'' +
                '}';
    }
}