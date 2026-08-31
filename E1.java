package Exception_handling;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;

        try {
            k = i / j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[2]);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("wrong index assigned");
        }
        catch (Exception e) {
            System.out.println("wrong exception");
        }
        finally {
            System.out.println("This will execute no matter what");
        }

        System.out.println(k);
        System.out.println("Jeevan has done");
    }
    static{
        System.out.println(" Execution started");
    }

}

