package sagar;
// scope means where we can access our variable
// scope basically means you can only access these variables inside the function
// you can not access it outside
public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "sagar";
        {
//            int a = 78; // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a); // 100

            int c = 99;
            System.out.println(name);
            // values initialised in this block, will remain in block
        }

        int c = 900;
        System.out.println(a); // 100
        System.out.println(name);   // sagar
        System.out.println(c);  // 90  cannot use outside the block


        // scoping in for loops
        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println();
    }
}

// anything that is initializing outside the block can be used inside the block but anything initialize
// inside the block can not be used outside
// similarly anything can be initialize inside the block  initialize outside the box