package fr.utbm.CuckoSearch.Model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;


@Entity
public class Periode {
    private int id;
    private Time debut;
    private Time fin;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Debut", nullable = false)
    public Time getDebut() {
        return debut;
    }

    public void setDebut(Time debut) {
        this.debut = debut;
    }

    @Basic
    @Column(name = "Fin", nullable = false)
    public Time getFin() {
        return fin;
    }

    public void setFin(Time fin) {
        this.fin = fin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Periode periode = (Periode) o;

        if (id != periode.id) return false;
        if (debut != null ? !debut.equals(periode.debut) : periode.debut != null) return false;
        if (fin != null ? !fin.equals(periode.fin) : periode.fin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (debut != null ? debut.hashCode() : 0);
        result = 31 * result + (fin != null ? fin.hashCode() : 0);
        return result;
    }
}
