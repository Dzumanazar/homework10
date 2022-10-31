public class Main {
    public static void main(String[] args) {
        System.out.println(method(4, 2,3,4,2,1,7));
    }
    public static boolean method(int a, int... numbers) {
        for (int i : numbers) {
            if (a == i) {
                return true;
            }
        }
        return false;
    }
}