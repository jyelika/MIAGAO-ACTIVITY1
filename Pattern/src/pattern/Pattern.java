
package pattern;

public class Pattern {

    
    public static void main(String[] args) 
    {
    int rows = 4;
        for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
                
                
            }
            System.out.println();
        }
        
            int line = 3;
            
            for(int i = line; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
            

            
        }
    }
    

