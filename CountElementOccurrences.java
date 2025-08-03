import java.util.ArrayList;
import java.util.Arrays;
public class CountElementOccurrences {
     public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>( Arrays.asList(1,2,3,2,2,4,5,6,7));
		int target=2;
		int count=0;
		for(int x:arr)
		{
			if(x==target)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}
}