class Loops{
    static void bright(){
        for(int i=0; i<10; i++){        //Answer 1
            System.out.println("Bright IT Career " + i);
        }
        int a = 1;
        while(a<=20){           //Answer 2
            System.out.print(a+ " ");
            a++;
        }
    }

    static void oddeven(){
        for(int i=2; i<6; i++){         //Answer 3 & 4
            if(i%2==0){
                System.out.println("Even " +i);
            }
            if(i%2!=0){
                System.out.println("Odd  " +i);
            }
        }
    }

    static int largest(int a, int b, int c){        //Answer 5 & 13
        if(a>b && a>c){
            return a;
        }
        if(b>c && b>c){
            return b;
        }
        else{
            return c;
        }

    }

    static void even(){             //Answer 6
        int a = 10;
        while (a<=100){
            if(a%2==0){
                System.out.print(a+" ");
            }
            a++;
        }
    }

    static void dowhile(){          //Answer 7
        int a = 1;
        do{
            System.out.print(a+ " ");
            a++;
        }
        while(a<=10);
    }

    static void armstrong(){            //Answer 8
        int a = 183 , b=a, rem, arm = 0;

        while(a!=0){
        rem = a % 10;
        arm += (rem * rem * rem);
        a = a/10;
        }

        if(b==arm){
            System.out.println("Armstrong Number : "+b);
        }
        else{
            System.out.println("Not an Armstrong Number : "+b);
        }

    }

    static void isPrime(){          //Answer 9
        int a = 17;
        int count = 0;
        for(int i=2; i<=a/2; i++){
            if(a%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(a+" is Prime");
        }
        else{
            System.out.println(a+" is not Prime");
        }
    }

    static void palindrome(){           //Answer 10
        int a = 12522, rem, rev =0, b=a;
        while(a!=0){
            rem = a%10;
            rev = rev *10 + rem;
            a = a/10;
        }
        if(b == rev){
            System.out.println(b + " is Palindrome");
        }
        else{
            System.out.println(b + " is not palindrome");
        }
    }

    static void evenodd(){          //Answer 11
        int a = 100;
        int b = 101;
        switch(b%2){
            case 0:
            System.out.println(a + " is Even");
            break;

            case 1:
            System.out.println(b + " is Odd");
        }
    }

    static void gender(){           //Answer 12
        String a = "Male";
        String b = "Female";
        switch(a){
            case "Male":
            System.out.println("Male");
            case "Female":
            System.out.println("Female");
        }
    }

   public static void main(String[] args) {
        bright();
        System.out.println();
        oddeven();
        System.out.println();
        System.out.println(largest(10, 20, 30));
        System.out.println();
        even();
        System.out.println();
        dowhile();
        System.out.println();
        armstrong();
        System.out.println();
        isPrime();
        System.out.println();
        palindrome();
        System.out.println();
        evenodd();
        System.out.println();
        gender();
   }
}