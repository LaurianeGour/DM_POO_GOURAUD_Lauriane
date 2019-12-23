#Etape 5 :

- Spring Web :
- Spring Data JPA
- Hibernate : Deja present dans JPA + 
- H2 :
- DevTools :
- Tymeleaf :
	
#Etape 13 :

Avec quelle partie du code avons-nous paramétré l'url d'appel /gretting ?
>Avec le paramètre 'getName' dans le fichier 'helloworldcontroller'
		
Avec quelle partie du code avons nous choisi le fichier HTML à afficher ?
>Avec le  '@GetMapping("/greeting")'

Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien? 
>"nameGET=" dans l'url
		
#Etape 17 :
Avez-vous remarqué une difference ?
>Une table "Adress" apparait (dans l'arboressance de la base de donnée "jdbc:h2:mem:testdb", en plus de "Information_schema", "Sequence" et "User" on y trouve une table, avec les attributs Id, content, et creation)
	
#Etape 18 : 
>Les anotations (@Entity, @Id, @GeneratedValue) permettent à hibernate de génerer la table -> en créant une classe avec ces annotations, hibernate sait qu'il doit generer une table (@Entity) avec differents attributs (@Id)

#Etape 20 :
>En utilisant le requete "SELECT * FROM ADRESS;", j'obtiens bien le tableau suivant :
	ID  	CONTENT  	CREATION  
	1	C'est le premier contenu !	2019-12-02 10:49:24.424
	2	C'est un autre contenu !	2019-12-02 10:49:24.444
	
#Etape 23 :
Pouvez-vous trouver à quoi sert l'annotation @Autowierd du code précédent sur internet ?
>Elle sert à faire de l'injection de dependance (le fait implicaitement) : Dans notre exemple, c'est l'interface qui est annotée (pointe sur la reference d'une instance de l'interface) (?)
		
		
		