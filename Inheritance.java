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


}
