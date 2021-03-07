Projet Java :
Gestion informatique de l’emploi du temps d’une école

Ce projet vise à concevoir un système de gestion de l’emploi du temps d’une école. L’architecture générale de ce système est
décrite dans le schéma ci-dessous :
![image](https://user-images.githubusercontent.com/63539587/110241596-dfdfd980-7f51-11eb-8145-4590d681423a.png)


Ce système qui a pour architecture le pattern MVC, compte principalement 5 modules :
- Le module de Recherche d’informations : toutes les consultations possibles de l’emploi du temps dans la base de données, selon plusieurs critères de recherche
- Le module de Mise à jour des données : toute opération de modification, ajout ou suppression dans l’emploi du temps
- Le module de Reporting : des statistiques sous forme de graphes (camemberts, histogrammes etc.)
- Le module Accès aux données (DAO) interroge ou met à jour les données de la BDD et communique avec les 3 modules précédents
- L’Interface graphique communique avec les 3 premiers modules pour visualiser l’emploi de temps
