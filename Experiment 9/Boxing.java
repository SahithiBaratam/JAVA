public class Boxing 
{
    public static void main(String args[]) 
    {
        int a = 10;
        Integer s = a;
        char c = 'Z';
        Character b = c;
        boolean i = true;
        Boolean l = i; 
        float f = 3.9f;
        Float e = f;
        double d = 29.657;
        Double g = d;
        System.out.println("AUTO BOXING");
        System.out.println(s+" "+a);
        System.out.println(c+" "+b);
        System.out.println(i+" "+l);
        System.out.println(f+" "+e);
        System.out.println(d+" "+g);
        Integer w = 20;        
        int x = w;
        Character v = 'Y';
        char t = v;
        Boolean m = false;
        boolean n = m;
        Float o = 5.8f;
        float p = o;
        Double u = 98.76;
        double h = u;
        System.out.println("UN BOXING");
        System.out.println(w+" "+x);
        System.out.println(v+" "+t);
        System.out.println(m+" "+n);
        System.out.println(o+" "+p);
        System.out.println(u+" "+h);
    }
}