import java.util.Scanner;

public class Linearsearch {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        int n,i;
        System.out.println("Enter the size of the array :");
        n = sc.nextInt();

        System.out.println("Enter the " + n + " array elements :" );
        for(i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int key;
        System.out.println("Enter the Key to Check its presence in the given array :");
        key = sc.nextInt();

        for (
                i=0;i<n;i++){
            if(key==arr[i]){
                System.out.println("Key found @ position : " + i);
                break;
            }
        }
        if (i==n) {
                System.out.println("Key not found");
            }
    }
}
