import java.util.Scanner;
public class NewSort1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int l=sc.nextInt();
		int arr[]=new int[l];
		int temp=0;
		System.out.println("Enter the no's");
		for(int k=0;k<l;k++){
			arr[k]=sc.nextInt();
			}
		for(int i=0;i<arr.length;i++){
			for (int j = i + 1; j < l; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
		}
		// TODO Auto-generated method stub

	}


		System.out.print("Ascending Order:");
        for (int m = 0; m < l - 1; m++) 
        {
            System.out.print(arr[m] + ",");
        }
        System.out.print(arr[l - 1]);
    }
}}
