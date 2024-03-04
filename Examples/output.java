class output 
 { 
 int x,y; 
 output() 
 { 
 x=y=0; 
 } 
 void put() 
 { 
 System.out.println(x+" "+y+" "+x/y); 
 } 
 public static void main(String args[]) 
 { 
 output ob=new output(); 
 ob.put(); 
 } 
} 