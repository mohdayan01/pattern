public class pattern {

    public static void main(String[] args) {

        // Star pattern -(01)
        // *****
        // *****
        // *****
        // *****
        // *****

        // int n=5;
        // //outer loops
        // for (int i=0; i<n; i++){
        // //inner loops
        // for(int j=0; j<n; j++){
        // System.out.print("*");// print the star
        // }
        // System.out.println();// print the next line
        // }
        // --------------------------------------------------------------------------------------------------------------------------------

        // next pattern (02)
        // *
        // **
        // ***
        // ****
        // *****

        // int n=5;
        // //outer loops
        // for (int i=0; i<=n; i++){
        // //inner loops
        // for(int j=0; j<=i; j++){
        // System.out.print("*");// print the star
        // }
        // System.out.println();// print the next line
        // }

        // --------------------------------------------------------------------------------------------------------------------------------
        // next pattern (03)-
        // *****
        // ****
        // ***
        // **
        // *

        // solution (03)---->
        // int n=5;
        // //outer loops
        // for (int i=n; i>=1; i--){
        // //inner loops
        // for(int j=1; j<=i; j++){
        // System.out.print("*");// print the star
        // }
        // System.out.println();// print the next line
        // }

        // --------------------------------------------------------------------------------------------------------------------------------
        // next pattern (04)---->

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // int n=5;
        // //outer loops
        // for (int i=1; i<=n; i++){
        // //inner loops
        // for(int j=1; j<=i; j++){
        // System.out.print(j);// print the star
        // }
        // System.out.println();// print the next line
        // }

        // --------------------------------------------------------------------------------------------------------------------------------
        // next pattern (05)----
        // 1
        // 22
        // 333
        // 4444
        // 55555

        // int n=5;
        // //outer loops
        // for (int i=1; i<=n; i++){
        // //inner loops
        // for(int j=1; j<=i; j++){
        // System.out.print(i);// print the star
        // }
        // System.out.println();// print the next line
        // }

        // --------------------------------------------------------------------------------------------------------------------------------
        // next pattern (06)---->
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *

        // // solution (06)---->
        // int n = 5;
        // //upper part of pattern 
        // // outer loops
        // for (int i = 1; i <= n; i++) {
        //     // inner loops
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");// print the star
        //     }
        //     System.out.println();// print the next line
        // }//lower part of pattern
        // for (int i = n; i >=1; i--) {
        //     // inner loops
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");// print the star
        //     }
        //     System.out.println();// print the next line
        // }

        //--------------------------------------------------------------------------------------------------------------------------------
        //next pattern(07)--->
      //      *
      //     **
      //    ***
      //   ****
      //  *****
  
    //   solution(07)--->
    
        // int n=5;//no.of rows 
        // for(int i=0; i<=n; i++){ // i stacd for number of columes 
        //     //inner loop
        //     //space
        //     int space = n-i;
        //     for(int j=0; j<=space; j++){
        //         System.out.print(" ");
        //     }
        //     //print star
        //     for(int j=0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //--------------------------------------------------------------------------------------------------------------------------------
        //next pattern(08)--->
    //    *****
    //     ****
        //  ***
        //   **
        //    *

        // solution (08)--->
        //  int n=5;//no.of rows 
        // for(int i=n; i>=1; i--){ // i stacd for number of columes 
        //     //inner loop
        //     //space
        //     int space = n-i;
        //     for(int j=1; j<=space; j++){
        //         System.out.print(" ");
        //     }
        //     //print star
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //--------------------------------------------------------------------------------------------------------------------------------
        //next pattern(09)---->
          //     *
          //    ***
          //   *****
          //  *******
          // *********

//   int n=5;
//  for(int i=1; i<=n; i++){
//     //inner loops
//     //space
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     //print star
//     for(int j=1; j<=i*2-1; j++){
//         System.out.print("*");

//     }
//     System.out.println();
//  }

//------------- ------------------------------------------------------------------------------------------------------
//next pattern(10)---->
      //  *******
      //  *******
      //   *****
      //    ***
      //     *

      //solution(10)--->

//   int n=5;
//  for(int i=n; i>=1; i--){
//     //inner loops
//     //space
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     //print star
//     for(int j=1; j<=i*2-1; j++){
//         System.out.print("*");

//     }
//     System.out.println();
//  }


//--------------------------------------------------------------------------------------------------------------------------------
//next pattern(11)---->

     //      *
     //     * *
     //    * * *
     //   * * * *
     //  * * * * *

    //  int n=5;
   
    //  for (int i = 0; i < n; i++) {

    //     for (int j = n - i; j > 1; j--) { //Loop for blank space
        
    //     System.out.print(" "); //Print Space
        
    //     }
        
    //     for (int j = 0; j <= i; j++) { //loop for star
        
    //     System.out.print("* "); //Print Star
        
    //     }
        
    //     System.out.println(); //Newline
        
    //     }

//--------------------------------------------------------------------------------------------------------------------------------
//next pattern(12)--->
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *

    //solution(12)--->


//   int n=5;
   
//      for (int i = n; i >= 1; i--) {

//         for (int j = n - i; j > 1; j--) { //Loop for blank space
        
//         System.out.print(" "); //Print Space
        
//         }
        
//         for (int j = 1; j <= i; j++) { //loop for star
        
//         System.out.print("* "); //Print Star
        
//         }
        
//         System.out.println(); //Newline
        
//         }


//--------------------------------------------------------------------------------------------------------------------------------
//next pattern(13)-->
    //   * * * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
        //    *
        //   * *
        //  * * *
        // * * * *
    //   * * * * * *

    // solution(13)--->

    // int n=5;
    //   for (int i = n; i >= 1; i--) {

    //     for (int j = n - i; j > 1; j--) { //Loop for blank space
        
    //     System.out.print(" "); //Print Space
        
    //     }
        
    //     for (int j = 1; j <= i; j++) { //loop for star
        
    //     System.out.print("* "); //Print Star
        
    //     }



        
        
    //     System.out.println(); //Newline
        
    //     }

    //       for (int i = 1; i <=n; i++) {

    //     for (int j = n - i; j > 1; j--) { //Loop for blank space
        
    //     System.out.print(" "); //Print Space
        
    //     }
        
    //     for (int j = 1; j <= i; j++) { //loop for star
        
    //     System.out.print("* "); //Print Star
        
    //     }
        
    //     System.out.println(); //Newline
        
    //     }






    }}