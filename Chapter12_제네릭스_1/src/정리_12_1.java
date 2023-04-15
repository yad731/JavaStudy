// 다음은 정수집합 1,2,3,4와 3,4,5,6의 교집합, 차집합, 합집합을 구하는 코드이다
import java.util.*;
public class 정리_12_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
//		list1.retainAll(list2);
//		System.out.println("교집합 : "+list1);
		
//		list1.addAll(list2);
//		System.out.println("합집합 : "+list1);
		
		list1.removeAll(list2);
		System.out.println("차집합 : "+list1);
		
		// => 한 번에 하나씩 출력해야
	}
}
