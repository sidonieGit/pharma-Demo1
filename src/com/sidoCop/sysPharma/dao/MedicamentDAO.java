package com.sidoCop.sysPharma.dao;

import java.util.List;

import com.sidoCop.sysPharma.domaine.model.Categorie;
import com.sidoCop.sysPharma.domaine.model.Medicament;

public class MedicamentDAO {

	public Medicament recuperationMedicament(int id) {
		System.out.println("DAO: récupération du médicament id=" + id);

		if (id == 2) {
			Medicament medicament = new Medicament(2, "Aspirine", 10.0, "Description", "image",
					new Categorie("ANTIINFLAMMATOIRES"));
			return medicament;

		}
		return null;
	}

	public Medicament creerMedicament(Medicament medicament) {
		System.out.println("DAO: création du médicament " + medicament.toString());
		return medicament;
	}

	public Medicament modifierMedicament(Medicament medicament) {
		System.out.println("DAO: modification du médicament " + medicament.toString());
		return medicament;
	}

	public void supprimerMedicament(Medicament medicament) {
		System.out.println("DAO: suppression du médicament " + medicament.toString());
	}

	public List<Medicament> recuperationListeMedicament() {
		System.out.println("DAO: récupération de tous les médicaments");
		return null;
	}
}