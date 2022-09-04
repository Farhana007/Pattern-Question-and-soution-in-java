 
//  problems and solutions related to Patterns 

import java.util.*;

  


public class Patterns {


  public static void numberPyramid(int n){
    // outer loppf
    for( int  i = 1; i <= n; i++){

      //spaces

      for (int j = 1; j<=n-i; j++){

        System.out.print(" ");
      

      }

      for(int j = 1; j<= i ;j++){
        System.out.print(i + " ");
      }
      System.out.println();
    }
    
  }
  /// palindrome pattern 
  public static void palindrome(int n){

    for(int i = 1; i<= n; i++){
      for(int j = 1; j<=n-i; j++){
        System.out.print(" ");
      }
        for(int j = i; j>=1; j--){
          System.out.print(j);

        }

        for(int j = 2; j<=i; j++){
          System.out.print(j);
        }
    
        System.out.println();
    }
   
  }




    //  Print a Hallow rectangle

        // public static void hollow_rectangle(int totalRows, int totalColum){
        //    //outer loop rows means line
        //    for(int i = 1; i<=totalRows; i++){
        //     // inner colum
        //      for( int j = 1; j<=totalColum; j++ ){
        //       // cell (i,j)
        //       if (i == 1 || i == totalRows || j == 1 || j == totalColum ){
        //         System.out.print("*");

        //       } else {
        //         System.out.print(" ");
        //       }
        //      }

        //      System.out.println();
        //    }

        // }



      // Inverted Rotated HALF PYRAMID

      // public static void inverted_rotate_half_pyramid(int n){
      //   // outer 
      //   for (int i = 1; i <= n ; i++){
      //     //spaces 
      //     for (int  j = 1; j<=n-i; j++){
      //       System.out.print(" ");
      //     }

      //     //stars
      //     for (int j = 1; j<=i;j++){
      //       System.out.print("*");
      //     }
      //     System.out.println();
      //   }

      // }


      // inverted half pyramid with number

      // public static void inverted_half_pyramid_number(int n){
      //    //outer
      //    for(int i = 1; i <= n; i++){
      //     //inner 
      //     for( int j = 1; j<=n-i+1; j++){
      //       System.out.print(j + " ");
      //     }
      //     System.out.println();
      //    }
      // }

      // floydss TRIngle


      // public static void floyds_triangle(int n){
      //   // outer
      //   int number = 1;
      //   for( int i = 1; i <= n; i++){
      //     // inner - how many times will number be printed
      //     for ( int j = 1; j<=i; j++){
      //       System.out.print(number + " ");
      //       number++;

      //     }
      //     System.out.println();
      //   }
      // }
  
       
      //ZERO-ONE Trianglev

      // public static void zero_one_triangle(int n){
      //   for(int i = 1; i <= n; i++){
      //     for(int j = 1; j<=i; j++){
      //       if (( i+j)%2 == 0){
      //         System.out.print("1");
      //       }
      //       else{
      //         System.out.print("0");
      //       }
      //     }
      //     System.out.println();
      //   }
      // }


      // Butterfly Pattern

      // public static void butterfly(int n){
      //   //first half

      //   for (int i =1; i <= n; i++){
      //     // start-i
      //     for(int j = 1; j <= i; j++){
      //       System.out.print("*");
      //   }

      //   // spaces- 2* (n-i)
      //    for (int j =1; j<= 2*(n-i); j++){
      //     System.out.print( " ");
      //    }

      //    // star-i 
      //    for(int j = 1; j<=i ; j++){
      //     System.out.print("*");
      //    }
      //    System.out.println();
      //   } 
      
      // //     // 2nd half

      //     for (int i =n; i>=1; i--){
      //       // start-i
      //       for(int j = 1; j <= i; j++){
      //         System.out.print("*");
      //     }
  
      //     // spaces- 2* (n-i)
      //      for (int j =1; j<= 2*(n-i); j++){
      //       System.out.print( " ");
      //      }
  
      //      // star-i 
      //      for(int j = 1; j<=i ; j++){
      //       System.out.print("*");
      //      }
      //      System.out.println();
      //     } 
      
      // }


      //solid RHOMBUSH

      // public static void solid_rhombus(int n){
      //    for(int i = 1; i <= n; i++){
      //     //spaces 
      //     for (int j = 1; j<=(n-i); j++){
      //       System.out.print(" ");
      //     }

      //     // stars
      //     for( int j = 1; j<=n; j++){
      //       System.out.print("*");
      //     }
      //     System.out.println();
      //    }
      // }
   

      // Hollow Rhombush 

      // public static void hollow_rhombus(int n){
      //   for(int i = 1; i <= n; i++){
      //    //spaces 
      //    for (int j = 1; j<=(n-i); j++){
      //      System.out.print(" ");
      //    }

      //    // stars
      //    for( int j = 1; j<=n; j++){
      //      if ( i == 1 || i == n || j == 1 || j == n){
      //       System.out.print("*");
      //      } 
      //      else{
      //       System.out.print(" ");
      //      }
      //     }
      //      System.out.println();
           
      //     }
      //   }

    

      // DiamonD Pattern 

      // public static void diamond (int n){
      //    // 1st half

      //    for (int i = 1; i <= n; i++){
      //     //spaces
      //     for(int j = 1; j<=(n-i); j++){
      //       System.out.print( " ");
      //     }

      //     // star
      //     for (int j= 1; j <= (2*i)-1; j++){
      //       System.out.print("*");
      //     }
      //     System.out.println();
      //    }

      //    // 2nd half

      //    for (int i = n; i >= 1; i--){
      //     //spaces
      //     for(int j = 1; j<=(n-i); j++){
      //       System.out.print( " ");
      //     }

      //     // star
      //     for (int j= 1; j <= (2*i)-1; j++){
      //       System.out.print("*");
      //     }
      //     System.out.println();
      //    }

      // }





  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);


    // nested means things within in a things. means loop
    //  in a loop called nested loop and if in a if called nested if


  //  Q1: A STAR PATTERNS


    // for(int line = 1; line <= 4; line++){
    //   for(int star = 1; star <=line; star++){
    //     System.out.print("* " + "");
    //   }
    //   System.out.println();
    // }
    


    // Q2:Print Inverted(ulta) star pattern


      //  int n = 4;
      //  for(int line = 1; line <= n; line++){
      //   for(int star = 1; star <= (n - line+1);star++){
      //     System.out.print("*");
      //   }
      //   System.out.println("");
      //  }


      

    //  Q3:Prints Half number Pyramid

    //  int n = 5;

   

    //  for( int line = 1; line<= n; line++){
    //   for(int number = 1; number <=line; number++){
    //     System.out.print(number);
     
    //   }
    //   System.out.println("");
    //  }

    // Q4:Print Character Patterns


    //  int n = 7;

    //  char ch = 'A';
      
    //  for(int line = 1; line<=n; line++){
    //   for(int chars = 1; chars<=line; chars++){
    //     System.out.print(ch);
    //     ch++;
    //   }
    //   System.out.println("");
    //  }


    // Q5: PRINT NUMBER PYRAMID:


      //  numberPyramid(7);
      


      // int n = 5;
      
      // for( int line = 1; line <= n; line++){
       
      //   for( int num =1; num <=line; num++){
          
      //     System.out.print(line + " ") ;
          
      //   }
      //     System.out.println("");
      // }


    // hollow_rectangle(4, 5); 

    // inverted_rotate_half_pyramid(5);

    // inverted_half_pyramid_number(6);

    // floyds_triangle(4);

    // zero_one_triangle(7);

    // butterfly(5);


    // solid_rhombus(4);

    // hollow_rhombus(5);

    // diamond(7);

    // numberPyramid(6);

  
    palindrome(5);















  }
  
}
