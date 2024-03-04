class Semester
{
    Semester()
    {
        System.out.print("All the best ");
    }
    Semester(int s)
    {
        this();
        System.out.print(" For Semester " +s);
    }
}
class Semester3
{
    public static void main(String args[])
    {
        Semester obj = new Semester(3);
    }
}