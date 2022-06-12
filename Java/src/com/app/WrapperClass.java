package com.app;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i=5; // Primitive Datatype...i -> Primitive Variable
		    // OR //
        Integer x = new Integer(5); // Wrapper Class....x -> Reference Variable
        System.out.println(x);
        
        
        Integer y = new Integer(i); // Putting a Variable inside a Object -> Wrapping or Boxing
        int j = y.intValue(); // Unboxing or Unwrapping
        System.out.println(j);
             
            // OR //
        
        Integer k = 25; // AutoBoxing
        int z = k; // Autounboxing
        System.out.println(z);
        
        // Conversion of Int to Double,Float by Wrapper Class
        int p=75;
        Double q = Double.valueOf(p);
        System.out.println(q);
        Float r = Float.valueOf(p);
        System.out.println(r);
        
        
        // Parsing String to Int,Double,Float
        String str = "12345";
        
        int a = Integer.parseInt(str);
        System.out.println(a);
        double b = Double.parseDouble(str);
        System.out.println(b);
        float c = Float.parseFloat(str);
        System.out.println(b);

	}

}
