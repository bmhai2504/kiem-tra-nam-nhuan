import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap nam: ");
        int year = scanner.nextInt();

//        if (year % 4 == 0) {
//            if (year % 100 == 0){
//                if (year % 400 == 0){
//                    System.out.println(year + " la nam nhuan!!");
//                }else {
//                    System.out.println(year + " khong la nam nhuan!!");
//                }
//            }else{
//                System.out.println(year + " la nam nhuan!!");
//            }
//        } else {
//            System.out.println(year + " khong la nam nhuan!!");
//        }


        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 ==0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400){
                    System.out.println(year + " la nam nhuan!!");
                }else {
                    System.out.println(year + " khong la nam nhuan!!");
                }
            }else{
                System.out.println(year + " la nam nhuan!!");
            }
        }else{
            System.out.println(year + " khong la nam nhuan!!");
        }
    }
}