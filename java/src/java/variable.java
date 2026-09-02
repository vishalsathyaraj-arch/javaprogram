package java;

public class variable {
	public static void main(String[] args) {
   String productname="   Laptop Dell   ";
   String brand="DELL";
   int length=productname.length();
   System.out.println("Original product name ="+productname);
   
   System.out.println("After trim() ="+productname.trim());
   
   System.out.println("touppercase() ="+productname.toUpperCase());
   
   System.out.println("tolowercase() ="+productname.toLowerCase());
   
   
   
   
   System.out.println("length of the productname() ="+ length);
   
   
   System.out.println("contains() ="+brand.contains("DELL"));
   
   System.out.println("equals() ="+productname.equals(brand));
   
	}
}
