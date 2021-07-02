public class TwoProject {
    public static void main (String[] args){
boolean hig=twoNumbers();
System.out.println(hig);

pozNegativ();

boolean hig2=Pozitiv();
System.out.println(hig2);

printMessage("Привет");

    }
    public static boolean twoNumbers(){
        int a=1;
        int b=9;
        return (10 <= a+b && a+b<= 20);
    }
    public static void pozNegativ() {
        int a=5;
        if (a>0) {
            System.out.println("Число положительное");
    }
    else {
        System.out.println("Число отрицательное");
    }
}
    public static boolean Pozitiv(){
        int a=10;
                return (a<0);
}
  //public static void numberLine(String message, int time) {
 //  int i;
  //  for (i=3;i<10;i++){
  //      System.out.println("Message");
   // }}
    public static void printMessage(String message){
        int i;
        for (i=4;i<10; i++) {
            System.out.println(message);
                    }
    }
}
