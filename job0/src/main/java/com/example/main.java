class AbstractFinal {
    public static void main(String[] args) {
        A[] tab = new A[3];
        tab[0] = new A();
        tab[1] = new B();
        tab[2] = new C(); 
        ((B) tab[1]).b = 2; // Correction de la conversion pour accéder à 'b'
        // ((C) tab[2]).c = 3; // Impossible de modifier 'c' car il est final
    }
}

abstract class A {
}

class B extends A {
    int b;
}

class C extends A {
    final double c = 1; // Champ 'c' est final et ne peut être modifié
}

abstract class D extends A {
    double d;
    
    abstract int operation(int a); // Méthode abstraite vide

    int calcul(int b) {
        // Méthode concrète dans une classe abstraite
        return b * 2;
    }

    abstract int machin(); // Méthode abstraite vide
}
