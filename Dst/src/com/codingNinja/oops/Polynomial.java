//package com.codingNinja.oops;
//
//
//
//ASK/VIEW DOUBT
//
//
//SOLUTION
//
//
//Problem
//Result
//Polynomial class
//Send Feedback
//Implement a polynomial class, that contains following functions -
//1. setCoefficient -
//This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value
//2. add -
//Adds two polynomials and returns a new polynomial which has result
//3. subtract -
//Subtracts two polynomials and returns a new polynomial which has result
//4. print -
//Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree. **
//Print pattern for a single term : "x"
//And multiple terms should be printed separated by space. For more clarity, refer sample test cases
//Note : Only keep those terms which have non - zero coefficients.
//Sample Input 1 :
//P1 : 1x2 2x3 4x6 
//P2 : 3x4 1x2
//Sample Output 1 :
//P1 + P2 = 2x2 2x3 3x4 4x6
//
//Main Code
//
//1
//import java.util.*;
//2
///* Signature of four required functions is given in the code. You can create other functions as well if you need.
//3
//*  Also you should submit your code even if you are not done with all the functions. 
//4
//*/
//5
//​
//6
//// Main used internally is shown here just for your reference.
//7
///*public static void main(String[] args) {
//8
//        Scanner s = new Scanner(System.in);
//9
//        int n = s.nextInt();
//10
//        int degree1[] = new int[n];
//11
//        for(int i = 0; i < n; i++){
//12
//            degree1[i] = s.nextInt();
//13
//        }
//14
//        int coeff1[] = new int[n];
//15
//        for(int i = 0; i < n; i++){
//16
//            coeff1[i] = s.nextInt();
//17
//        }
//18
//        Polynomial first = new Polynomial();
//19
//        for(int i = 0; i < n; i++){
//20
//            first.setCoefficient(degree1[i],coeff1[i]);
//21
//        }
//22
//        n = s.nextInt();
//23
//        int degree2[] = new int[n];
//24
//        for(int i = 0; i < n; i++){
//25
//            degree2[i] = s.nextInt();
//26
//        }
//27
//         int coeff2[] = new int[n];
//28
//        for(int i = 0; i < n; i++){
//29
//            coeff2[i] = s.nextInt();
//30
//        }
//31
//        Polynomial second = new Polynomial();
//32
//        for(int i = 0; i < n; i++){
//33
//            second.setCoefficient(degree2[i],coeff2[i]);
//34
//        }
//35
//        int choice = s.nextInt();
//36
//        Polynomial result;
//37
//        switch(choice){
//38
//        // Add
//39
//        case 1: 
//40
//             result = first.add(second);
//41
//            result.print();
//42
//            break;
//43
//        // Subtract 
//44
//        case 2 :
//45
//             result = first.subtract(second);
//46
//            result.print();
//47
//            break;
//48
//        // Multiply
//49
//        case 3 :
//50
//             result = first.multiply(second);
//51
//            result.print();
//52
//            break;
//53
//        }
//54
//​
//55
//    }
//56
//  */
//57
//​
//58
//​
//59
//public class Polynomial {
//60
//​
//61
//    
//62
//    List coefficient;
//63
//    
//64
//    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
//65
//     *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
//66
//     *  is already present in the polynomial then previous coefficient is replaced by
//67
//     *  new coefficient value passed as function argument
//68
//    */
//69
//    Polynomial()
//70
//    {
//71
//        this.coefficient = new ArrayList();
//72
//    }
//73
//    
//74
//    public void setCoefficient(int degree, int coeff){
//75
//​
//76
//        
//77
//        
//78
//    }
//79
//    
//80
//    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
//81
//    public void print(){
//82
//        
//83
//    }
//84
//​
//85
//    
//86
//    // Adds two polynomials and returns a new polynomial which has result
//87
//    public Polynomial add(Polynomial p){
//88
//​
//89
//        
//90
//    }
//91
//    
//92
//    // Subtracts two polynomials and returns a new polynomial which has result
//93
//    public Polynomial subtract(Polynomial p){
//94
//            
//95
//    }
//96
//    
//97
//    // Multiply two polynomials and returns a new polynomial which has result
//98
//    public Polynomial multiply(Polynomial p){
//99
//        
//100
//    }
//101
//​
//102
//}
//103
//​
//
//CUSTOM INPUT
//
//
//SUBMIT
//
//
//PREVIOUS
//
//
//NEXT
//
//
//Java (SE 1.8)
//C++ (g++ 5.4)
//
//
//1
//public class Polynomial {
//2
//    int degCoeff[];
//3
//​
//4
//    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
//5
//     *  then corresponding term(with specified degree and value is added in the polynomial. If the degree
//6
//     *  is already present in the polynomial then previous coefficient is replaced by
//7
//     *  new coefficient value passed as function argument
//8
//     */
//9
//​
//10
//    Polynomial() {
//11
//        degCoeff = new int[10];
//12
//    }
//13
//​
//14
//    public void setCoefficient(int degree, int coeff) {
//15
//        if(degree > degCoeff.length-1) {
//16
//            //create a new array with size= degree+1
//17
//            int temp[] = degCoeff;
//18
//            degCoeff = new int[degree+1];
//19
//            //copy values from temp to degCoeff
//20
//            for(int i = 0; i < temp.length; i++) {
//21
//                degCoeff[i] = temp[i];
//22
//            }
//23
//        }
//24
//        degCoeff[degree] = coeff;   
//25
//    }
//26
//​
//27
//    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
//28
//    public void print(){
//29
//        for(int i = 0;i < degCoeff.length; i++) {
//30
//            if(degCoeff[i] != 0) {
//31
//                System.out.print(degCoeff[i] + "x" + i + " ");
//32
//            }
