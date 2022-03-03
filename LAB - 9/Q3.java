class plate {
    plate() {
        System.out.println("This is constructor of class plate");
    }

    void ml_Inherit(double length, double width) {
        System.out.println("Length: " + length + " Width: " + width);
    }
}

class Box extends plate {
    Box() {
        System.out.println("This is constructor of class Box");
    }

    void ml_Inherit(double length, double width, double height) {
        System.out.println("Length: " + length + " Width: " + width + " Height: " + height);
    }
}

class woodBox extends Box {
    woodBox() {
        System.out.println("This is constructor of class woodBox");
    }

    void ml_Inherit(double length, double width, double height, double thick) {
        System.out.println("Length: " + length + " Width: " + width + " Height: " + height + " Thick: " + thick);
    }
}

public class Q3 {
    public static void main(String args[]) {
        woodBox obj = new woodBox();
        obj.ml_Inherit(10, 10);
        obj.ml_Inherit(10, 10, 10);
        obj.ml_Inherit(10, 10, 10, 10);
    }
}