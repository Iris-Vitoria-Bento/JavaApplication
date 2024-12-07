
package javaapplication;


public class FormaBidimensional {
        int numSides;
        boolean regular;
    FormaBidimensional(){
            numSides= 3;
            regular = true;
           }
   FormaBidimensional(int n,boolean regular){
            numSides=n;
            this.regular= regular;
           }
    public boolean isRegular(){
            return regular;
    }
    public int getSides(){
            return numSides;
    }
    public void getSides(int s){
            numSides = s;
    }
    public void setRegular(boolean regular){
            this.regular=regular;
    }
        
    
}
