package Week1;

public class PrimeNumber {

	public static void main(String[] args) {
	  int num=15;
	  boolean flag=false;
	  for(int i=2;i<=num/2;++i) {
		  if(num%i==0) {
			  flag=true;
			  break;
		  }
		  if(flag) {
			  System.out.println(num +"It is a primenumber");
			  
		  }
		  else {
			  System.out.println(num +"It is not a primenumber");
		  }
	  }
		  
	}
}
	  
	  
	  
	  

	


