
public class bubblesort {

	public static void bubble_sort(int []arr) {
		int size=arr.length;
		
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int  temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int []arr= {5,7,3,4,1};
		
		bubble_sort(arr);
		
		for(int ele:arr) System.out.print(ele+" ");
		

	}

}
