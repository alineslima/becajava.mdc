import java.util.Scanner;

public class DescobrirMdc {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero1 = Integer.parseInt(leitor.nextLine());
		int numero2 = Integer.parseInt(leitor.nextLine());
		
		System.out.println(mdc(numero1, numero2));
		
		leitor.close();
	}
	
	public static double mdc (double dividendo, double divisor){

        if (dividendo % divisor == 0){
            return divisor;
        }else{
        	return mdc(divisor,(dividendo % divisor));
        } 
    }
}
