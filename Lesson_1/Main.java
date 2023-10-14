// терминал  Ctrl + Alt + t


// public class Main{
//     public static void main(String[] args) {
//     // TODO: просуммировать числа в диапазоне от 1 до 5

//     int sum = 1 + 2;
//     boolean isEvenNumber = sum % 2 == 0;
//     if (isEvenNumber == true) {
//         System.out.println("Число " + sum + " является четным");
//     }else if (isEvenNumber == false) {
//         System.out.println("Число " + sum + " является нечетным");
//     }

//     // int sum1 = sum + 3;


//     // int sum2 = sum1 + 4;


//     // int result = sum2 + 5;


//     // System.out.println(result);

//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         int sum = 0;
//         for (int i = 1; i <= 5; i++) {
//             if(i % 2 == 0){
//                 System.out.println("Число " + i + " является четным");
//             }else{
//                 System.out.println("Число " + i + " является нечетным");
//             }
//             sum += i;
//         }
//         System.out.println("1+2+3+4+5=" + sum);
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         int sum = 0;
//         int i = 1;
//         while(i<=5){
//             if(i % 2 == 0){
//                 System.out.println("Число " + i + " является четным");
//             }else{
//                 System.out.println("Число " + i + " является нечетным");
//             }
//             sum += i;
//             i++;
//         }
//         System.out.println("1+2+3+4+5=" + sum);
//     }
// }

public class Main{
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do{
            if(i % 2 == 0){
                System.out.println("Число " + i + " является четным");
            }else{
                System.out.println("Число " + i + " является нечетным");
            }
            sum += i;
            i++;
        }while(i<=5);

        System.out.println("1+2+3+4+5=" + sum);
    }
}
