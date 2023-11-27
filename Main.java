package Vecteur;

public class Main {
    public static void main(String[] args) {
        // Creating instances of Vecteur2
        Vecteur2 vecteur0 = new Vecteur2();        // Default constructor
        Vecteur2 vecteur1 = new Vecteur2(1.5, 3);   // Parameterized constructor

        // Displaying the string representation of the vectors
        System.out.println("Vecteur0: " + vecteur0.toString());
        System.out.println("Vecteur1: " + vecteur1.toString());

        // Checking if the abscissa and ordinate of the two vectors are equal
        System.out.println("Abscissa and ordinate of the two vectors are equal: " + vecteur0.equals(vecteur1));

        // Calculating and displaying the norm of Vecteur0 and Vecteur1
        System.out.println("Norm of Vecteur0: " + vecteur0.norme());
        System.out.println("Norm of Vecteur1: " + vecteur1.norme());

        // Creating instances of Vecteur3
        Vecteur3 vecteur2 = new Vecteur3();        // Default constructor
        Vecteur3 vecteur3 = new Vecteur3(1.5, 3, 5); // Parameterized constructor

        // Displaying the string representation of the vectors including z for Vecteur3
        System.out.println("Vecteur2: " + vecteur2.toString());
        System.out.println("Vecteur3: " + vecteur3.toString());

        // Checking if the abscissa, ordinate, and z of the two vectors are equal
        System.out.println("Abscissa, ordinate, and z of the two vectors are equal: " + vecteur2.equals(vecteur3));

        // Calculating and displaying the norm of Vecteur2 and Vecteur3
        System.out.println("Norm of Vecteur2: " + vecteur2.norme());
        System.out.println("Norm of Vecteur3: " + vecteur3.norme());
    }
}
