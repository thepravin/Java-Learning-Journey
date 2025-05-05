


public class _11_Math_Class {
    public static void main(String args[]){
       
        int a = 24;
        int b = 13;

        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.pow(5,2)); //* 25.0 double
        // System.out.println((int)Math.pow(5,2)); //* 25 int

        System.out.println(getRandom());

        System.out.println(Math.abs(-3));

        System.out.println(Math.floor(5.9)); //5
        System.out.println(Math.ceil(5.9));//6
        System.out.println(Math.round(5.9));


    }

    public static int getRandom(){
        return (int)(Math.random()*6)+1; //  1 to 6 random value
    }
}
