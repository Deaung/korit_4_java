package ch07_loops;

public class Loop03 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 101){
            System.out.print(i + " ");
            if(i%10 == 0){
                System.out.println();
            }
            i++;
        }
        int i2 = 1;
        while (i2<101){

            System.out.println(i2+" "+(i2+1)+" "+(i2+2)+" "+(i2+3)+" "
                    +(i2+4)+" "+(i2+5)+" "+(i2+6)+" "+(i2+7)+" "+(i2+8)+" "+(i2+9));

            i2+=10;
        }

    }
}
