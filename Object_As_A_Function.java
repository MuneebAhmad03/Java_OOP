
//Passing Objects to Methods

class Rectangle {

        int length, width;

        Rectangle(int l, int w) {

            length = l;

            width = w;

        }

        int area() {

            return length * width;

        }

    }

    public class Object_As_A_Function  {

        static void displayArea(Rectangle rect) {

            System.out.println("Area: " + rect.area());

        }

        public static void main(String[] args) {

            Rectangle myRect = new Rectangle(10, 5);

            displayArea(myRect); // Output: Area: 50

        }

    }

