public class HelloNumbers{
    public static void main(String[] args){
        int x = 0; /* variable x must be declared before used, and must be given a type.*/
        int sum = 0; /* semicolon ;*/
        while (x < 10){  /* curly brace {} */
            sum += x;
            System.out.println(sum);
            x = x + 1;
        }
        /* static typing:
            x = 'horse'  The compiler rejects this program out of hand before it even runs.
            This is a big deal, because it means that there's no chance that somebody running
            this program out in the world will ever run into a type error!
        */


        System.out.println(5+"horse");  /* output: 5horse */
        /* java: if there is a string by the +, it will treat both sides as string and combine them.
        * python: it will not automatically treat both sides as string, you need to check and change by yourself.
        * print(5 + "horse") ! error
        * */
    }

}


