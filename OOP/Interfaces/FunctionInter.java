
/* 
 * In functional interface , there is only one function in that interface class.
 * 
 * if lambda function want's to use outside the main class then make it 'static'
 */

@FunctionalInterface
interface SuperInterface {
    void interfaceMethod(int a);

}

public class FunctionInter {
    /*
     * Approach 1 :
     *
     * SuperInterface obj2 = new SuperInterface() {
     * 
     * @Override
     * public void interfaceMethod(int a) {
     * 
     * }
     * 
     * };
     */

    /*
     * // * lambda function
     * static SuperInterface obj3 = (int a) -> {
     * System.out.println(a);
     * };
     */

    public static void main(String[] args) {

        // * lambda function
        SuperInterface obj3 = (int a) -> {
            System.out.println(a);
        };

        // call the method using the obj3 instance
        obj3.interfaceMethod(6);
    }
}
