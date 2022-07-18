import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter worker name: ");
        String name = s.nextLine();
        System.out.println("Please enter salary: ");

        float salary = s.nextFloat();
        System.out.println("Your current salary is " + salary);
        if (salary * 1.1 > 6000) {
            System.out.println("Workers salary increased by 5%");
            salary = salary * 1.05f;
        }
        if (salary * 1.1 < 6000) {
            System.out.println("Workers salary increased by 10%");
            salary = salary * 1.10f;
        }
        System.out.println("Your name is " + name);
        System.out.println("now your salary is " + salary);

//        int numOne = s.nextInt();
//        int numTwo = s.nextInt();

        // targil 5
//        if (numOne < numTwo){
//            System.out.println(numOne);
//            System.out.println(numTwo);
//        }
//
//        if (numTwo < numOne){
//            System.out.println(numTwo);
//            System.out.println(numOne);
//        }
//        if (numTwo == numOne){
//            System.out.print(numTwo);
//            System.out.print(" ");
//            System.out.print(numOne);
//        }


////        targil 4
//        if (numOne % numTwo == 0) {
//            System.out.println("rishon mithalek be sheni lelo shaarit ");
//        }
//
//        if (numTwo % numOne == 0) {
//            System.out.println("sheni mithalek be rishon lelo shaarit ");
//        }

////        targil 3
//        if (numOne % 2 == 0){
//            System.out.println("Even");
//        }
//
//        if (numOne % 2 != 0){
//            System.out.println("Odd");
//        }

//        if (numOne % 2 == 1){
//            System.out.println("Odd");
//        }


//                targil 2
//        if (numOne > numTwo) {
//            System.out.println(numOne);
//        }
//        if (numOne < numTwo) {
//            System.out.println(numTwo);
//        }
//        if (numTwo == numOne) {
//            System.out.println("even");
//            System.out.println(numOne);
//        }

//        // targil -1
//        if (numTwo > numOne) {
//            System.out.println("Growing");
//        }

    }
}
