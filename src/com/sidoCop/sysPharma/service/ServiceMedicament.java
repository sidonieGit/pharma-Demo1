package com.sidoCop.sysPharma.service;

import java.util.List;

import com.sidoCop.sysPharma.dao.MedicamentDAO;
import com.sidoCop.sysPharma.domaine.model.Medicament;

/**
 * Service de gestion des médicaments (CRUD + recherche).
 */
public class ServiceMedicament {

    private MedicamentDAO medicamentDao;

    public ServiceMedicament() {
        super();// pour que l'objet soit instanciable
        // injection de l'objet dao
        this.medicamentDao = new MedicamentDAO();// création d'un objet dao
    }

    public Medicament recherMedicament(int id) {
        System.out.println("SERVICE: récupération du médicament id=" + id);
        Medicament medicamentRetour = medicamentDao.recuperationMedicament(id);
        return medicamentRetour;
    }

    public void creerMedicament(Medicament medicament) {
        System.out.println("SERVICE: création du médicament " + medicament.toString());
        medicamentDao.creerMedicament(medicament);
    }

    public Medicament modifierMedicament(Medicament medicament) {
        System.out.println("SERVICE: modification du médicament " + medicament.toString());
        medicamentDao.modifierMedicament(medicament);
        return medicament;
    }

    public void supprimerMedicament(Medicament medicament) {
        System.out.println("SERVICE: suppression du médicament " + medicament.toString());
        medicamentDao.supprimerMedicament(medicament);
    }

    public List<Medicament> recuperationListeMedicament() {
        System.out.println("SERVICE: récupération de tous les médicaments");
        List<Medicament> medicamentListeRetour = medicamentDao.recuperationListeMedicament();
        return medicamentListeRetour;
    }
}
