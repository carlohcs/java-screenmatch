package br.com.screenmatch.models.dontuse;

// In java, you can't do multiple inheritance classes
// like the example bellow:
// because of the "The Diamond Problem"
// https://www.shiksha.com/online-courses/articles/why-multiple-inheritance-is-not-supported-in-java-blogId-154385#:~:text=Java%20disallows%20multiple%20inheritance%20to,in%20the%20inheritance%20of%20methods.
class Car {
    public void start() {
        System.out.println("Car starts");
    }

    public void move() {
        System.out.println("Car moves on roads");
    }
}

class Boat {
    public void start() {
        System.out.println("Boat starts");
    }

    public void move() {
        System.out.println("Boat moves on water");
    }
}

// it throws: "Class cannot extend multiple classes"
// class AmphibiousVehicle extends br.com.screenmatch.model.dontuse.Car, Boat {
//class AmphibiousVehicle extends Car, Boat {
//    // Ambiguity and complexity arise here.
//}