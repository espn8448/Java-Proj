package core;

public class ArrayEx {

	public static void main(String[] args) {
		int ar[] = new int[5];
		
		ar[0]= 100;
		ar[1]= 101;
		ar[2]= 102;
		ar[4]= 104;
		
		int ar2[]= {100,101,102,104};
		
		
		System.out.println("0 Index "+ ar[0]);
		System.out.println("1 Index "+ ar[1]);
		System.out.println("2 Index "+ ar[2]);
		System.out.println("3 Index "+ ar[3]);
		System.out.println("4 Index "+ ar[4]);
		
		System.out.println("0 Index "+ ar2[0]);
		System.out.println("1 Index "+ ar2[1]);
		System.out.println("2 Index "+ ar2[2]);
		System.out.println("3 Index "+ ar2[3]);
		//System.out.println("4 Index "+ ar2[4]);
	}

}
