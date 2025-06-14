# Projet Pharma1 - Application de Gestion de Médicaments (Démo Java Pure)

Ce dépôt contient la première itération du projet "Pharma", une application de gestion de médicaments développée en Java. Cette version se concentre sur les concepts de base du développement orienté objet et l'implémentation d'une logique métier simple sans l'utilisation d'un framework d'injection de dépendances (comme Spring).

## Fonctionnalités (Démo 1)

- Création d'objets `Medicament` et `Categorie`.
- Implémentation d'une couche Data Access Object (DAO) (`MedicamentDAO`) pour simuler les opérations de base (CRUD) sur les médicaments. Les données sont actuellement "mockées" (codées en dur) et affichées dans la console.
- Implémentation d'une couche Service (`ServiceMedicament`) pour encapsuler la logique métier et interagir avec le DAO.
- Point d'entrée de l'application (`Laucher`) pour démontrer les fonctionnalités de base.

## Technologies Utilisées

- Java (JDK 8 ou supérieur recommandé)

## Comment Exécuter l'Application

1.  **Prérequis :** Assurez-vous d'avoir le [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) installé sur votre machine (version 8 ou supérieure).

2.  **Cloner le dépôt :**

    ```bash
    git clone https://github.com/sidonieGit/pharma-Demo1.git
    cd Pharma1
    ```

3.  **Compiler le code :**
    Vous devrez compiler manuellement les fichiers Java.

    - **Si vous utilisez un IDE (IntelliJ IDEA, Eclipse, VS Code) :** Importez le dossier `Pharma1` comme un projet Java. Votre IDE devrait gérer la compilation automatiquement. Exécutez la classe `com.sidoCop.sysPharma.launcher.Laucher`.

    - **Depuis la ligne de commande (si pas de Maven) :**
      Naviguez vers le répertoire `src/main/java` de votre projet, puis vers le package racine `com/sidoCop/sysPharma/`.
      ```bash
      # Depuis la racine du projet Pharma1
      cd src/main/java
      javac com/sidoCop/sysPharma/launcher/Laucher.java com/sidoCop/sysPharma/service/ServiceMedicament.java com/sidoCop/sysPharma/dao/MedicamentDAO.java com/sidoCop/sysPharma/domaine/model/Medicament.java com/sidoCop/sysPharma/domaine/model/Categorie.java
      ```

4.  **Exécuter l'application :**

    - **Depuis l'IDE :** Exécutez la classe `com.sidoCop.sysPharma.launcher.Laucher`.

    - **Depuis la ligne de commande :**
      Après la compilation, les fichiers `.class` seront dans les mêmes répertoires que les `.java`. Vous devrez lancer la JVM depuis un répertoire qui a le package racine dans son classpath.
      ```bash
      # Depuis le répertoire 'src/main/java'
      java com.sidoCop.sysPharma.launcher.Laucher
      ```
      Vous devriez voir les messages de console indiquant la création et la récupération des médicaments.

## Prochaines Étapes

- Introduction de l'injection de dépendances sans framework (Spring)

---

**Auteur :** Sidonie sidoniedjuissifohouo@gmail.com---www.linkedin.com/in/sidonie-djuissi-fohouo
**Date :** 12 juin 2025
