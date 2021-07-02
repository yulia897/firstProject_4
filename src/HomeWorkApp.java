public class HomeWorkApp {
    public static void main (String[] args){
         System.out.println ("_Orange");
        System.out.println ("_Banana");
        System.out.println ("_Apple");
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void checkSumSign(){
        int a=1;
        int b=-10;
        boolean c=(a+b)>0;
                if (c) {
                    System.out.println("Сумма положительная");
                }
                else {
                    System.out.println("Сумма отрицательная");
                }
    }
    public static void printColor() {
        int value=101;
        if (value<=0) {
            System.out.println("Красный");
        }
        else if (value<=100 && value>0) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public  static  void compareNumbers() {
        int a=2;
        int b=2;
        boolean d= (a>=b);
        if (d) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
