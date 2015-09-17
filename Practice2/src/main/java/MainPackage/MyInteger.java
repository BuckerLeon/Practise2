package MainPackage;

public class MyInteger {
	private int value;
	
	MyInteger(int value){
		this.value = value;
	}
	
	public int get_value(){
		return value;
	}
	
	public boolean isEven(){
		if(this.value % 2 == 0){
			return true;
		}
		else
			return false;
	}
	
	public boolean isOdd(){
		if(this.get_value() % 2 != 0){
			return true;
		}
		else
			return false;
	}
	
	public boolean isPrime(){
		for(int i=2; i < this.value; i++){
			if(this.value % i == 0){
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean isEven(int a){
		if(a % 2 == 0){
			return true;
		}
		else
			return false;
	}
	
	public static boolean isOdd(int a){
		if(a % 2 != 0){
			return true;
		}
		else
			return false;
	}
	
	public static boolean isprime(int a){
		for(int i=2; i < a; i++){
			if(a % i == 0){
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean isEven(MyInteger val){
		if(val.get_value()%2 == 0){
			return true;
		}
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger val){
		if(val.get_value()%2 != 0){
			return true;
		}
		else
			return false;
	}
	
	public static boolean isPrime(MyInteger val){
		for(int i=2; i < val.get_value(); i++){
			if(val.get_value() % i == 0){
				return false;
			}
			
		}
		return true;
	}
	
	public boolean equals(int a){
		if(value == a){
			return true;
		}
		else
			return false;
	}
	
	public boolean equals(MyInteger a){
		if(value == a.get_value()){
			return true;
		}
		else 
			return false;
	}
	
	public static int parseInt(char[] val){
		return parseInt(new String(val));
	}
	
	public static int parseInt(String val){
		return Integer.parseInt(val);
	}
}