package com.sidoCop.sysPharma.launcher;

import com.sidoCop.sysPharma.domaine.model.Categorie;
import com.sidoCop.sysPharma.domaine.model.Medicament;
import com.sidoCop.sysPharma.service.ServiceMedicament;

public class Laucher {
	public static void main(String[] args) {
		Medicament medicament1 = new Medicament(1, "Aspirine", 10.0, "Description", "image",
				new Categorie("ANTIINFLAMMATOIRES"));

		ServiceMedicament serviceMedicament = new ServiceMedicament();
		serviceMedicament.creerMedicament(medicament1);

		Medicament medicament2 = serviceMedicament.recherMedicament(2);
		if (medicament2 != null) {
			System.out.println("LAUNCHER: Récuperation du médicament réussie " + medicament2.toString());
		} else {
			System.out.println("LAUNCHER: Récuperation du médicament échouée");
		}

	}

}
