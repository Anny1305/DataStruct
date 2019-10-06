package com.codingNinja.oops;

import java.util.*;
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {

    
    List<Integer> poly;
	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    Polynomial()
    {
        this.poly = new ArrayList<Integer>(20);
    }
    
	public void setCoefficient(int degree, int coeff){

        
        
        if(this.poly.get(degree)!=0 ){
            poly.set(degree,poly.get(degree)+coeff);
        }else{
           poly.add(degree,coeff);
            
        }

	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		String res="";
        
        for(int i=0; i<this.poly.size();i++){  
            if(i==0)
              res += this.poly.get(i)+" ";
            else
              res+= this.poly.get(i)+"x"+i+" ";
        }
        System.out.println(res);
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
     
      Polynomial ans = new Polynomial();

        for(int i =0;i<this.poly.size();i++){     
            int val = this.poly.get(i)+p.poly.get(i);
            ans.poly.set(i,val);
        }
        
        for(int i=this.poly.size();i<p.poly.size();i++){
            ans.poly.set(i,p.poly.get(i));
        }
        
		return ans;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
        
     Polynomial ans = new Polynomial();

         for(int i =0;i<this.poly.size();i++){     
            int val = this.poly.get(i)-p.poly.get(i);
            ans.poly.set(i,val);
        }
        
        for(int i=poly.size();i<p.poly.size();i++){
            ans.poly.set(i,-p.poly.get(i));
        }
        
			return ans;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
        
        Polynomial ans = new Polynomial();
             
        for(int i =0;i<this.poly.size();i++){  
            
            for(int j=0;j<p.poly.size();j++){
                int newIndex =i+j;
                int value =this.poly.get(i)*p.poly.get(j);  
                
                ans.poly.set(newIndex,ans.poly.get(newIndex)+value);

            }
              
        }
        
        return ans;
        
        
	}

}
