package aufgabe10;

public class Paesant {
   
   String name;      //Im Objekt enthaltene Information, sp�tere Implementierung von Objektklassen m�glich
   Paesant next;     //zeigt auf das n�chste Objekt(Paesant Objekt=Speicheradresse!)
   
   Paesant(String name, Paesant next){
      this.name=name;
      this.next=next;
   }

}
