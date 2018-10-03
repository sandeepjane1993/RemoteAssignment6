import java.util.ArrayList;
import java.util.List;

public class CommonElements {

	public static void main(String[] args) {
		
		CommonElements obj = new CommonElements();
		int[] array1 = {1,3,5,6,7,9};
		int[] array2 = {2,5,4,7,3,9};
		System.out.println((obj.common(array1, array2)));
	}
	public List<Integer> common(int[] arr1,int[] arr2)
	{
		
		int l1= arr1.length; 
		int l2= arr2.length; 
		List<Integer> list = new ArrayList<>();
		for(int i =0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					list.add(arr1[i]);
					}
			}
		}
		return list;
	}

}
