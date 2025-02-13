# Esercizi
## Indice per argomenti
- [Array](#array)
- [Object-oriented programming](#oop)
- [Enum](#enum)
- [Date](#date)
- [Testing](#testing)
- [Builder](#builder)

## Array
### Ricerca in un array
- Implementare un metodo che prenda come parametro un array di interi e ne ritorni il minimo
- Implementare un metodo che prenda come parametro un array di interi e ne ritorni il massimo
- Implementare un metodo che prenda come parametro un array di interi e ne ritorni il minimo dei valori maggiori di un parametro k
- Implementare un metodo che prenda come parametro un array di interi e ne ritorni il minimo dei valori minori di un parametro k
- Implementare un metodo che prenda come parametro un array di interi e ne ritorni il minimo dei numeri strettamente positivi
- Implementare un metodo che prenda come parametro un array di interi e ne ritorni il massimo dei numeri strettamente negativi

È possibile ed incoraggiato richiamare dei metodi scritti in alcuni punti precedenti

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
- Estendere il metodo per l'aggiunta di un evento in calendario, facendogli lanciare un'eccezione se l'evento da inserire va in conflitto con qualche altro evento già aggiunto in calendario
- Aggiungere dei metodi per ritornare dal calendario:
  - L'evento con la durata più lunga
  - L'evento con la durata più breve
  - I mesi dell'anno in cui non sono presenti eventi
  
BONUS: Implementare la classe Calendar usando una struttura dati sottostante che mantenga l'ordine in base al tempo d'inizio dell'evento già in fase d'inserimento. 

## Testing
### Test-driven development
Dato il seguente scheletro di una classe che rappresenta una frazione:

```java
// Tipo di dato che rappresenta una frazione
public class Fraction {
	// Initializza la frazione con i valori passati come parametri
	public Fraction(int numerator, int denumerator) {
	}

	
	// Aggiunge il valore della frazione passata come parametro all'oggetto su cui il metodo viene chiamato (this)
	public void add(Fraction other) {
	}

	// Ritorna 'false' se la frazione non è valida (esempio: il denominatore è 0), 'true' altrimenti
	public boolean isValid() {
		return false;
	}
}
```

- Scrivere una classe di test che verifica tutti i casi possibili, seguendo le indicazioni date dai commenti. **In questa fase non implementare i metodi, va bene che alcuni test diano errore, concentrarsi sulla scrittura dei test con asserzioni che seguano ciò che il commento sopra ogni metodo indica**.
Esempio: Una frazione con numeratore 5 e numeratore 7 sarà valida, tuttavia un test in cui si fa asserzione "assertTrue(obj.isValid())" fallirà poichè per adesso il metodo isValid ritorna sempre false.
- Dopo aver scritto una quantità considerevole di test, procedere con l'implementazione della classe fin quando tutti i test non passano.

## Builder
### Shape builder
- Convertire l'esercizio sul factory method per la classe "Shape" al design pattern Builder. In questo caso il builder deve permettere di configurare solo il tipo di forma geometrica, con il metodo build() che effettua il controllo ritornando la classe Shape giusta.
- Aggiungere un parametro "numberOfSides" che indica il numero di lati della figura geometrica, di default 0. Il builder, al momento della chiamata a build(), deve verificare i seguenti vincoli e lanciare un'eccezione se si cerca di creare una forma geometrica non valida:
	- Se si sta creando un cerchio, il numero di lati dev'essere 0 (un quadrato non ha lati)
 	- Un triangolo può avere 1 o 3 lati (con 1 lato intendiamo un triangolo collassato su se stesso con altezza 0)
  	- Un quadrato può avere 1 o 4 lati (con 1 lato intendiamo un quadrato collassato su se stesso con altezza 0)
