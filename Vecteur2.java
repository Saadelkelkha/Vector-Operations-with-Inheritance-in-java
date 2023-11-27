package Vecteur;

public class Vecteur2 {
    // Private member variables
    private double x;
    private double y;
    
    // Static variable to keep track of the number of Vecteur2 instances
    private static int count = 0;

    // Parameterized constructor
    public Vecteur2(double x, double y) {
        this.x = x;
        this.y = y;
        // Increment the count when a new instance is created
        Vecteur2.count += 1;
    }

    // Default constructor
    public Vecteur2() {
        // Default values
        x = 1.5;
        y = 2;
        // Increment the count when a new instance is created
        Vecteur2.count += 1;
    }

    // Getter method for count
    public int getCount() {
        return Vecteur2.count;
    }

    // Getter method for x
    public double getX() {
        return this.x;
    }

    // Getter method for y
    public double getY() {
        return this.y;
    }

    // Setter method for x
    public void setX(double X1) {
        this.x = X1;
    }

    // Setter method for y
    public void setY(double Y1) {
        this.y = Y1;
    }

    // String representation of the object
    public String toString() {
        return "X = " + getX() + " Y = " + getY();
    }

    // Method to check equality with another Vecteur2 object
    public boolean equals(Vecteur2 vecteur1) {
        return vecteur1.getX() == this.getX() && vecteur1.getY() == this.getY();
    }

    // Method to calculate the norm of the vector
    public float norme() {
        return (float) Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
    }
}

// Subclass Vecteur3 inheriting from Vecteur2
class Vecteur3 extends Vecteur2 {
    // Additional private member variable
    private double z;

    // Parameterized constructor calling the superclass constructor
    public Vecteur3(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    // Default constructor setting default value for z
    public Vecteur3() {
        z = 3;
    }

    // Getter method for z
    public double getZ() {
        return this.z;
    }

    // Setter method for z
    public void setZ(double Z1) {
        this.z = Z1;
    }

    // String representation of the object including z
    public String toString() {
        return "X = " + getX() + " Y = " + getY() + " Z = " + getZ();
    }

    // Method to check equality with another Vecteur2 object, including z
    public boolean equals(Vecteur2 vecteur1) {
        // Note: It's necessary to override the equals method from the superclass
        // and include the comparison for z
        if (vecteur1 instanceof Vecteur3) {
            Vecteur3 vecteur3 = (Vecteur3) vecteur1;
            return super.equals(vecteur1) && vecteur3.getZ() == this.getZ();
        }
        return false;
    }

    // Method to calculate the norm of the vector including z
    public float norme() {
        return (float) Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2));
    }
}
