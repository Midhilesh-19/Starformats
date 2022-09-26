public class Starformats
 {
    public static void main(String[] args) {
        //Output
//           *
//          **
//         ***
//        ****

        for (int i=1;i<=4;i++){
            for (int j = 3;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }


//         for (int i=1;i<=4;i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 7; k > (i * 2); k--) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//
//             for (int j = 3; j >= i; j--) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//

        //Output
//             *
//               *
//                 *
//                   *
//        for (int i=1;i<=4;i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//Output
//     *
//   *
// *
//
//        for (int i=1;i<=3;i++){
//            for (int j =3;j>=i;j--){
//                System.out.print(" ");
//            }
//            for (int k=1;k>=1;k--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//Output
//         *
//       *
//     *
//   *
// *

//        for(int i =0;i<5;i++){
//            for (int j=0;j<5;j++){
//                if (i+j==5-1){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println("");
//        }



//Output
//        *****
//        *   *
//        *   *
//        *   *
//        *****

//        for(int i=0;i<5;i++){
//            for (int j=0;j<5;j++){
//                if(i==0 || i==4){
//                    System.out.print("*");
//                } else if (j==0 || j==4){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }


//Output
//        1
//        23
//        456
//        78910
//
//        int n=1;
//        for(int i=0;i<=3;i++){
//            for (int j=0;j<=i;j++){
//
//                System.out.print(n);
//                n=n+1;
//            }
//
//            System.out.println(" ");
//        }

//Output
//        1
//        21
//        321
//        4321
//        54321


//        for(int i=1;i<=5;i++){
//            for (int j=i;j>=1;j--){
//
//                System.out.print(j);
//
//            }
//
//            System.out.println(" ");
//        }
    }
}
