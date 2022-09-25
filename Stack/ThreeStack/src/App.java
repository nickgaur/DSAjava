public class App {
    // static String func(String )
    public static void main(String[] args) throws Exception {
        int previousFib = 0, currentFib = 1;
    for (int i = 2; i <=6; i++)
    {
        int newFib = 0;
        if(i % 5 == 0){
            newFib = 11;
        }
        else{
            newFib = previousFib + currentFib;
        }
        previousFib = currentFib;
        currentFib = newFib;
    }
        System.out.println(currentFib);
    }
}
