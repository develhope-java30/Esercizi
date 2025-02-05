# Esercizi
## Indice per argomenti
- [Object-oriented programming](#oop)
- [Enum](#enum)
- [Date](#date)

## OOP
### Student
- 1. Implementare una classe Student con nome, cognome e media dei voti.
- 2. Implementare una classe Product con nome, prezzo (float) e qualità (int). la qualità dev'essere un numero intero maggiore o uguale a 0.
- 3. Definire un'interfaccia Rankable con i seguenti metodi:
    - getRank(): float
    - Ritorna un valore "rank" che indica il valore dell'oggetto
- 4. Implementare l'interfaccia Rankable per Student. Il "rank" di uno studente è dato dalla sua media dei voti diviso 10.
- 5. Implementare l'interfaccia Rankable per Product. Il "rank" di un prodotto è dato dalla sua qualità diviso il suo prezzo.
- 6. Implementare nella classe Main un metodo statico che prenda come parametro un array di Rankable e ritorni l'elemento nell'array col rank più alto.
   
### Movable
#### Parte 1
- 1.1 Definire un'interfaccia Movable, rappresentante delle entità che si muovono nel mondo. L'interfaccia ha i seguenti metodi:
  - getInitialSpeed(): float
          * Ritorna la velocità a cui l'oggetto si muove non appena inizia il movimento
  - getMaxSpeed(): float
          * Ritorna la velocità massima a cui si può muovere l'oggetto

- 1.2 Implementare nella classe Main un metodo statico che, dato un array di oggetti Movable, ritorni l'oggetto con la maggiore velocità massima.
- 1.3 Implementare nella classe Main un metodo statico che, dato un array di oggetti Movable, ritorni l'oggetto con la maggiore velocità iniziale.
NB: Questi metodi possono essere scritti e compilati anche se nessun oggetto implementa l'interfaccia Movable

### Parte 2
- 2.1 Implementare una classe Pedestrian, rappresentante un pedone, definito da un nome ed una forza muscolare.
  - 2.1.1 Implementare l'interfaccia Movable per Pedestrian. La velocità iniziale di un pedone e la velocità massima coincidono e sono date dalla sua forza muscolare moltiplicata per 3.

- 2.2 Implementare una classe Car, rappresentante una macchina, definito da un oggetto Pedestrian che la guida ed una potenza del motore (float).
  - 2.2.1 Implementare l'interfaccia Movable per Car. La velocità iniziale di una macchina è 0, la velocità massima è data dalla potenza del motore moltiplicata per 10.

- 2.3 Implementare una classe Bike, rappresentante una bicicletta, definita da un oggetto Pedestrian che la guida ed una potenza delle ruote (float).
  - 2.3.1 Implementare l'interfaccia Movable per Bike. La velocità iniziale di una bici è 0, la velocità massima è data dalla forza muscolare del guidatore moltiplicata per la potenza delle ruote.

## Enum
### ShopProduct
- Implementare una classe ShopProduct che rappresenta un prodotto di un negozio. Esso è caratterizzato da un nome, un prezzo (double) e una categoria. La categoria è un'enumerazione che può avere valore "FOOD", "BEVERAGE", "ELECTRONICS"
- Definire un'interfaccia Eatable avente un solo metodo "isEatable", che ritorna true se l'oggetto in questione è commestibile.
- Implementare Eatable per la classe ShopProduct. isEatable deve ritornare true se e solo se il prodotto fa parte di una categoria commestibile (FOOD o BEVERAGE). Usare uno switch per implementare il controllo.
- Scrivere un metodo main in cui viene creata una lista di ShopProduct, ordinata poi in base al prezzo e stampata.
Implementare un metodo statico che presa una Lista di ShopProduct ritorni una nuova lista di ShopProduct contenente i 3 prodotti più costosi. La lista originale non dev'essere modificata dal metodo.

## Date
### Calendar
Implementare una classe Calendar che rappresenta un calendario di eventi. Ogni evento è rappresentato dalla classe Event sviluppata in precedenza.

- Il calendario deve fornire i seguenti metodi, oltre ad altri metodi basilari (es: aggiunta/rimozione di un evento in calendario):
- Un metodo che ritorna una lista di Event in ordine temporale d'inizio
- Un metodo che ritorni 'true' se e solo se nel DateTime preso come parametro c'è almeno un evento in calendario, 'false' se invece nessun evento è presente in quel DateTime specificato
