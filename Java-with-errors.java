Int x = 10;
system.out.println(x);

int x = 10;
System.out.println(x);

int x = 10;
System.out.println x);

public static void main(String[] ars) throws Exception {

    System.err.println("Successfully Printed!");
    PrintStream console = System.err;

    File file = new File("C:\\Users\\USer1\\Documents\\ERRORS\\errors.txt");
    FileOutputStream fos = new FileOutputStream(file);
    PrintStream ps =  PrintStream(fos);
    System.setErr(ps);

    System.err.println("ERRORS FOUND n \n");



    try {
          int[] x = new int[1];
            x[2] = 5
            x[1] = 10;
            x[2]=4;
    } catch (Exception e) {
        e.printStackTrace();
    }
    SystemsetErr(console);
  
  
  package com.rollbar.test;

public class SecurityExceptionExample {
    public static void main(String args[]) {
        System.out.println("Hello World");

        MyObject obj = new MyObject();
    }
}
  
