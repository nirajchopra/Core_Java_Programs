package Loops.ContinueStatement;

public class Continue {
    public static void main(String[] args) {
        
        for(int i=1; i<=20; i++){
            if(i==17){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
