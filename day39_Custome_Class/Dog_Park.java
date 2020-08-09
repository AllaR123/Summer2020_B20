package day39_Custome_Class;

public class Dog_Park {

    public static void main(String[] args) {
        // dogPark

        Dog dog1 = new Dog();


        Dog[] dogPark = { new Dog(),  new Dog(), new Dog(), new Dog(), new Dog()  };
        //               0           1          2         3            4

        dogPark[0].setInfo("Karaoglan", "German Shepperd", "Medium",  6, "Black");
        dogPark[1].setInfo("Roko", "German Sheper", "Medium", 3, "Brown");
        dogPark[2].setInfo("Champ" , "Retriver", "small", 5, "Black");
        dogPark[3].setInfo("Akbas", "Anatolian Sheppard", "Large",  2, "White");
        dogPark[4].setInfo("Grizzly","BoxerPitt","Large",3,"Mix");
        //dogPark[5].setDogInfo("Pasa", "Pitbull","large", 1, "White");

        for(int i=0; i <= dogPark.length-1; i++ ){
            dogPark[i].getInfo();
        }


        System.out.println("=====================================================");

        for(Dog eachDog : dogPark ){
            eachDog.getInfo();
        }

        System.out.println("====================================================");
        String food = "treats";
        for( Dog eachDog  : dogPark ){
            eachDog.eat(food);
        }

        System.out.println("=====================================================");
        String drink = "milk";
        for( Dog eachDog  : dogPark ){
            eachDog.drink(drink);
        }

        System.out.println("====================================================");
        int sleep = 12;
        for( Dog eachDog  : dogPark ){
            eachDog.sleep(sleep);
        }



    }

}