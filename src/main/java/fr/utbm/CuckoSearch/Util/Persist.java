package fr.utbm.CuckoSearch.Util;

import fr.utbm.CuckoSearch.Model.Intervention;
import fr.utbm.CuckoSearch.Model.Patient;
//Lib Matrix
import org.ejml.data.DenseMatrix64F;
import org.ejml.ops.MatrixIO;

//
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;


public class Persist {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();

        DenseMatrix64F intervention_matrix = new DenseMatrix64F(20, 20);



        List<Intervention> intervention_List = entityManager.createQuery("FROM Intervention ").getResultList();

        Iterator iterator = intervention_List.iterator();

        while (iterator.hasNext()) {

            Intervention intervention = (Intervention) iterator.next();

            intervention_matrix.set(intervention.getPeriode() - 1, intervention.getPatient() - 1, 1);
        }

        File file = new File("/Users/mohammeddahhou/Desktop/Intervention.txt");
        try {
            PrintStream printStream = new PrintStream(file);
            MatrixIO.print(printStream, intervention_matrix, "%.0f");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Patient patient = new Patient();

        patient.setAge(23);
        patient.setPrénom("simo");
        patient.setNom("dahhou");

        entityManager.persist(patient);

        entityTransaction.commit();

        entityManager.close();

    }


}
