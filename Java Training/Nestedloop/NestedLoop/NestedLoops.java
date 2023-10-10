package NestedLoop;

public class NestedLoops {
    NestedLoops(){};

    public void loop1 () {

        for (int i=1, j=10; i<10; i+=2, j-=2) {
            System.out.print(i + " ");
            System.out.print(j + " ");
        }

    }

    public void loop2 () {

        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++) {
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }

    }

    public void loop3 () {

        for (int i=1; i<5; i++) {
            for (int k=0; k<i; k++) {
                System.out.print("#");
            }
            for (int j=5; j>i; j--) {
                System.out.print("@");
            }
            System.out.println();
        }

    }
}
