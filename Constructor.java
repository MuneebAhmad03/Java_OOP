class Constructor {

    int age;
    String name;


    //Default Constructor

    Constructor(){
        this.name = name;
        this.age = age;
    }


    // Parametrized Constructor

     Constructor(String name, int age) {     // constructor with two parameters
        this.name = name;
        this.age = age;
    }

    // constructor overloading

    Constructor(String name ){      //Constructor with one parameter only
        this.name = name;
    }
}
