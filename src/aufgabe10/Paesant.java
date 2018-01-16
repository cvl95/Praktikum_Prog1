package aufgabe10;

public class Paesant {
   
   String name;      //Im Objekt enthaltene Information, spätere Implementierung von Objektklassen möglich
   Paesant next;     //zeigt auf das nächste Objekt(Paesant Objekt=Speicheradresse!)
   
   Paesant(String name, Paesant next){
      this.name=name;
      this.next=next;
   }

}
