package fr.utbm.CuckoSearch.Model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


public class InterventionPK implements Serializable {
    private int patient;
    private int periode;

    @Column(name = "Patient", nullable = false)
    @Id
    public int getPatient() {
        return patient;
    }

    public void setPatient(int patient) {
        this.patient = patient;
    }

    @Column(name = "Periode", nullable = false)
    @Id
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

        InterventionPK that = (InterventionPK) o;

        if (patient != that.patient) return false;
        if (periode != that.periode) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = patient;
        result = 31 * result + periode;
        return result;
    }
}
