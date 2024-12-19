
/* 
 * class without name.
 * only use one time.
 * 
 * use creting comperators
 */

class OuterClass {
    public void outerClass() {

    }
}

interface SuperInterFace{
    void interfaceMethod();
}


public class AnonymousClass {

    /*
     * class InnerClass extends OuterClass{
     * 
     * }
     */

    // * Anonymous class */
    OuterClass obj = new OuterClass() {

    }; // compulsari to give ';'


    SuperInterFace obj2 = new SuperInterFace(){

        @Override
        public void interfaceMethod() {
        }
    };


    public static void main(String[] args) {

    }
}
