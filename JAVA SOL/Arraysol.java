import java.util.*;

class Arraysol {
    static void add(){          //Answer 1 & 6
        int arr[] = {1,2,3,4,6,7};
        int n = arr.length;
        int addarr[] = new int [n+1];
        int a = 8;
        for(int i=0; i<n; i++){
            addarr[i] = arr[i];
        }
        addarr[n] = a;
        System.out.println(Arrays.toString(addarr));
    }

    static void average(){      //Answer 2
        int arr[] = {1,2,3,4};
        int n = arr.length;
        float a = 0;
        for(int i=0; i<n; i++){
            a += arr[i];
        }
        a /= n;
        System.out.println(a);
    }

    static void index(){        //Answer 3
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int idx = 4;
        for(int i=0; i<n; i++){
            if(arr[i]==idx){
                System.out.println(i);
            }
        }
    }
    static void value(){        //Answer 4 & 17
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int val = 18;
        int count = 0;
        for(int i =0; i<n; i++){
            if(arr[i]==val){
                System.out.println(val + " is there on index "+i);
                count++;
            }
        }
        if(count == 0){
            System.out.println("No value is there");
        }
    }

    static void remove(){       //Answer 5 & 7
        int arr[] = {1,2,3,4,6,7};
        int n = arr.length;
        int removearr[] = new int [n-1];
        int a = 7;
        for(int i=0, k=0; i<n; i++){
            if(i==a){
                continue;
            }
            removearr[k++] = arr[i];
        }
        System.out.println(Arrays.toString(removearr));
    }

    static void minmax(){       //Answer 8 & 16
        int arr[] = {3,8,9,54,89,34,88};
        int min =54;
        int max =0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int a = max - min;
        System.out.println("Difference of largest and smallest value are ");
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : " +min);
    }

    static void reverse(){          ////Answer 9
        int a = 12345, rev = 0, rem , b=a;
        while(a!=0){
            rem = a%10;
            rev = rev * 10 + rem;
            a/=10;
        }
        System.out.println("Reverse : "+rev);
    }
        //Answer 12 & 18 using recursion
    static boolean[] map = new boolean[26];
    static void dublicateremove(String s, String str, int i){

        if(i==s.length()){
            System.out.println(str);
            return;
        }
        
        char ch = s.charAt(i);
        if(map[ch - 'a']){
            dublicateremove(s, str, i+1);
        }
        else{
            map[ch - 'a'] = true;
            str = str + ch;
            dublicateremove(s, str, i+1);
        }
    }

    static void dublicatefind(){        //Answer 10
        int arr[] = {1,2,3,4,5,2,6,5,4};
        int n= arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }

    static void comman(){           //Answer 11
        int arr[] = {1,2,3,4,0,8,6543,3321,6};
        int arr1[] = {1,54,6543,6,8,5,67};
        for(int i=0; i<arr1.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr1[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }

    static int secondlarge(int arr[], int n){       //Answer 13 & 14
        int temp;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }return arr[n-1];
    }

    static void evenodd(){          //Answer 15
        int arr[] = {1,2,3,4,5,6,7,8,9,23,54,76,65};
        int count = 0;
        int count1 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
            else{
                count1++;
            }
        }System.out.println("Number of Evens : "+count);
        System.out.println("Number of Odds : "+count1);
    }

    static void missing(){          //Answer 19
        int arr[] = {1,2,3,4,5,7};
        int n = arr.length;
        int sum = ((n+1)*(n+2))/2;
        for(int i=0; i<n; i++){
            sum = sum - arr[i];
        }
        System.out.println(sum);
    }



    public static void main(String[] args) {

    }
}