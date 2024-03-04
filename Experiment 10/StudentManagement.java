package ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;

class StudentManagement extends Exception
{  
    StudentManagement(String error)
    {
	super(error);
    }
}


