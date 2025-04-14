class Myclass {
    static int count = 0;  
    final double pi = 3.14;  
    Myclass() {
        count = count+1;
    }
    public void display() {
        System.out.println("Count is: " + count);
        System.out.println("Double is: " + pi);
        System.out.println();
    }
    public static void main(String[] args) {
        Myclass Asec = new Myclass();
        Asec.display();
        Myclass Bsec = new Myclass();
        Bsec.display();
        Myclass Cse = new Myclass();
        Cse.display();
        System.out.println("The final count is: " + count);
        System.out.println("Double is: " + Asec.pi);
    }
}
