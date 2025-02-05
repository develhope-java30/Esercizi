# Esercizi
## Indice per argomenti
- [Enum](#enum)
- [Date](#date)

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
