package fr.utbm.CuckoSearch.Model;

import javax.persistence.*;


@Entity
@IdClass(InterventionPK.class)
public class Intervention {
    private int id;
    private int patient;
    private int periode;

    @Basic
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "Patient", nullable = false)
    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    @Id
    @Column(name = "Periode", nullable = false)
    public int getPeriode() {
        return periode;
    }

    public void setPeriode(int periode) {
        this.periode = periode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Intervention that = (Intervention) o;

        if (id != that.id) return false;
        if (patient != that.patient) return false;
        if (periode != that.periode) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + patient;
        result = 31 * result + periode;
        return result;
    }
}
