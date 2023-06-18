class swapWithoutTemp {
    public static void main(String[] args){
        int a = 10, b = 20;
        // swap by using + and - Operator

        /*
        a = a + b;
        b = a - b;
        a = a -b;
        */
        // swap by using * and / operator

         b = a*b;
         a = b /a;
         b = b/a;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}

