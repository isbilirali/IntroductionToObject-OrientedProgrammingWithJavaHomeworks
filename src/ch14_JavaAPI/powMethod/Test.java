package ch14_JavaAPI.powMethod;

/*
java.lang.Math sınıfındaki pow() metodunun ne işe yaradığını,
ne alıp ne döndürdüğünü API dokümanına bakarak araştırın, bir örnekle test edin.
 */

/*
static double pow(double a, double b) : Returns the value of the first argument raised to the power of the second argument.
Parameters:
    a - the base.
    b - the exponent.
Returns:
    the value a^b.
*/
public class Test {

    static void main() {

        System.out.println(Math.pow(0,0));
        System.out.println(Math.pow(0,1));
        System.out.println(Math.pow(1,0));
        System.out.println(Math.pow(2,5));
    }
}
