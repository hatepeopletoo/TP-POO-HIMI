# TP-POO-HIMI

// Spring Web

Il s'agit d'un cadre de développement Web basé sur Spring qui facilite la création d'applications Web à l'aide de technologies telles que JavaServer Faces, Spring MVC, etc.

// Spring Data JPA

Il s'agit d'un standard d'accès aux données en Java qui autorise la gestion des données d'une application en utilisant des objets Java plutôt que des requêtes SQL.

// Hibernate

Il s'agit d'une bibliothèque de mappage objet-relationnel (ORM) pour Java qui simplifie la gestion des données à l'aide de JPA.

// Base de données H2

Il s'agit d'un gestionnaire de base de données relationnelle développé en Java qui peut être employé en tant que base de données incorporée pour les applications Web.

// DevTools

Il s'agit d'un ensemble d'outils destinés aux concepteurs de Spring pour faciliter le développement et le débogage des applications Web.

// Thymeleaf

Il s'agit d'un moteur de modèles pour les applications Web qui donne la possibilité de générer des vues à l'aide de fichiers HTML et d'expressions Java.

// Quatorzième étape

Définition de l'URL d'appel : @GetMapping("/greeting")
Choix du fichier HTML à afficher : return "greeting" ;
le nom est donné par l'utilisateur via l'URL et ensuite il est passé à la vue grâce au Model.addAttribute() qui remplace ${nameTemplate} par le nom

// 17ème étape 

Lorsque vous créez une entité "Address" en utilisant Hibernate et JPA, cela se traduit par l'ajout d'une table "Address" dans la base de données. En utilisant les annotations JPA, vous allez décrire les colonnes de la table correspondante dans la base de données. Lorsque vous lancez l'application, Hibernate créera automatiquement la table "Address" dans la base de données H2 en utilisant les informations de la classe "Address". Il génèrera un script SQL qui définit les colonnes et les contraintes de clé étrangère appropriées, puis exécutera ce script pour créer la table réellement.

// 20ème étape 

On peut voir le contenu data.sql en entier

// 22ème étape 

L'annotation @Autowired de Spring automatise l'injection de dépendance pour les répositories en instanciant automatiquement une variable de répository avec la classe appropriée lorsqu'elle est utilisée.

// 30ème étape 

J'ai inclu les feuilles de styles et scripts Bootstrap distants obtenus à partir de la page officielle de Bootstrap dans les pages où je souhaite les utiliser via des liens CDN.

// Etape 6 

- La clé API est importante pour appeler l'API MeteoConcept. La principale raison pour laquelle les API nécessitent une clé API est pour des raisons de sécurité et de protection de l'API
- l'URL à appeler : https://api.meteo-concept.com/api/forecast/daily/0?token=CLE_API&latlng=LATITUDE,LONGITUDE


Lien GitHub : https://github.com/hatepeopletoo/TP-POO-HIMI 
