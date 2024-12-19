

public class Main {
    class Toy{
        int price;

        void getPrice (){
            System.out.println("Price of toy : "+price);
        }
    }

    static class PlayStation{
        int price;

        void getPrice (){
            System.out.println("Price of toy : "+price);
        }
    }

    public static void main(String[] args) {
        /* 
        *  -------- Toy toy = new Toy(); 
         * - above version not allowed. give error 
         * - first have to create object of parent class (main) and then create obj of toy class
         * 
         */

         Toy toy = new Main().new Toy(); 
         /* 
          *  OR
          *  Main obj = new Main(); // outer class obj
          *  Toy toy = obj.new Toy();
          */
        toy.price = 67;
        toy.getPrice();

        PlayStation playStation = new Main.PlayStation(); //* static class : without createing outer class obj you can crete inner class obj
        playStation.price = 78;
        playStation.getPrice();

    }
}
