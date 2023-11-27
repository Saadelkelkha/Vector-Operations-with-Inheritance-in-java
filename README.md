# Vector-Operations-with-Inheritance-in-java
This program defines two classes, Vecteur2D and Vecteur3D, representing 2D and 3D vectors, respectively. The Vecteur3D class inherits from the Vecteur2D class. These classes encapsulate vector operations and provide methods for accessing, modifying, and comparing vectors

# Class: Vecteur2D
Attributes:

_count: A static variable to count the number of instances of the class.
Methods:

__init__(self, X=1.5, Y=2): Constructor to initialize a 2D vector with default or specified coordinates.
GetX(self): Getter method for the x-coordinate.
GetY(self): Getter method for the y-coordinate.
Getcount(self): Getter method for the count of instances.
SetX(self, X1): Setter method for the x-coordinate.
SetY(self, Y1): Setter method for the y-coordinate.
ToString(self): Returns a string representation of the vector.
Equals(self, vecteur1): Checks if two vectors are equal.
Norme(self): Calculates the norm (magnitude) of the vector.

# Class: Vecteur3D (inherits from Vecteur2D)
Attributes:

__Z: A private instance variable for the z-coordinate.
Methods:

__init__(self, X=1.5, Y=2, Z=5): Constructor to initialize a 3D vector with default or specified coordinates.
GetZ(self): Getter method for the z-coordinate.
SetZ(self, Z1): Setter method for the z-coordinate.
ToString(self): Returns a string representation of the vector in 3D.
Equals(self, vecteur1): Checks if two 3D vectors are equal.
Norme(self): Calculates the norm (magnitude) of the 3D vector.

# Main Program:
Imports the Vecteur2D and Vecteur3D classes from the class4 module.
Creates instances of Vecteur2D and Vecteur3D.
Performs various operations such as printing string representations, comparing vectors, and calculating vector norms.
