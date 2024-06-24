package com.algodatastructures.ft.ConstructorDependency;

/* Clasa asta in construsctor primeste ca obiect clasa 'Emisiune' si in felul asta 'Emisiune' devinde dependenta
   pentru clasa 'FurnizorServiciuConsumator'. Cand in constructorul clasei punem o alta clasa ca obiect, noi ii
   'fortam' o dependenta atunci cand cream instanta a clasei. Asta ne permite ca 'FurnizorServiciuConsumator' sa se
   foloseasca de orice impementare a interfetei 'Emisiune' fara sa se cunoasca toate detaliile despre cum a fost
   facute toate implementarile
 */
public class FurnizorServiciuConsumator {

    private Emisiune emisiune;

    public FurnizorServiciuConsumator(Emisiune emisiune) {
        this.emisiune = emisiune;
    }

    public void procesareMesaje(String mesaje) {
        // Simulam procesarea mesajelor doar prin afisarea in consola
        System.out.println("Procesare mesaje: " + mesaje);
        // Apelam metoda transmisiune
        emisiune.transmisiune();
    }

}
