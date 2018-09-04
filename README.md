# MagiWord ReadMe
Dans cet exercice, vous allez devoir créer un jeu de combat épique entre Guerrier, Rôdeur et Mage !
Ce jeu est prévu pour 2 joueurs et fonctionne dans le terminal.

##Comment se déroule le jeu :
* Le jeu commence par proposer au joueur 1 de choisir entre Guerrier, Rôdeur ou Mage.
* Il doit ensuite choisir le niveau, la force, l’agilité et enfin l’intelligence de son personnage.
* C’est ensuite au tour du second joueur de choisir la classe et les caractéristiques de son personnage.
* La partie démarre ensuite, le joueur 1 commence.
* Chaque joueur joue tour à tour et choisit entre son Attaque Basique ou son Attaque spéciale.
* Quand un joueur n’a plus de point de vie, la partie est terminée et l’autre joueur l’emporte.

##Les caractéristiques :
Chaque personnage possède **5 caractéristiques** :

* Niveau : choisi par le joueur (min 1, max 100)
* Vie : égale au niveau du joueur * 5
* Force : choisie par le joueur (min 0, max 100)
* Agilité : choisie par le joueur (min 0, max 100)
* Intelligence : choisie par le joueur (min 0, max 100)

**Attention le total force + agilité + intelligence doit être égal au niveau du joueur.**

Par exemple, un mage niveau 18 ne peut pas avoir 5 de force et 14 d’intelligence : le total fait 19 et non 18.

##Les sorts :
Chaque joueur possède **2 sorts** :

Une attaque basique qui cause des dommages à l’adversaire.

Une attaque spéciale aux effets variés.

Voici le détail des sorts :

* Guerrier  
  * Attaque Basique - Coup d’Épée : Effectue des dommages égaux à la force du joueur sur l’adversaire.
  * Attaque Spéciale - Coup de Rage : Effectue des dommages égaux à la force du joueur fois deux sur l’adversaire. Le joueur lançant l'attaque perd de la vitalité : la valeur de sa force divisée par 2.
* Rôdeur
  * Attaque Basique - Tir à l’Arc : Effectue des dommages égaux à l’agilité du joueur sur l’adversaire.
  * Attaque Spéciale - Concentration : Le joueur gagne son niveau divisé par 2 en agilité.
* Mage
  * Attaque Basique - Boule de Feu : Effectue des dommages égaux à l’intelligence du joueur sur l’adversaire.
  * Attaque Spéciale - Soin : Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie. Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
  
 