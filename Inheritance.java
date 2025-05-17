public class Inheritance {

    void sound(){
        System.out.println("Animal Make Sound");

    }

    class Dog extends Inheritance{

        @Override
        void sound(){
            System.out.println("Dog barks");
        }

    }

    class Grandparent {              //MultiLevel Inheritance

        void message() {

            System.out.println("I am the grandparent.");

        }

    }

    class Parent extends Grandparent {

        void message() {

            System.out.println("I am the parent.");

        }

    }

    class Child extends Parent {

        void message() {

            System.out.println("I am the child.");

        }

    }


}
