package arraylist;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList_1 go= new ArrayList_1();
		go.jon();
	}
public  void jon() {
		ArrayList obj=new ArrayList();
		obj.add("nanadini");
		obj.add(1234);
		obj.add(" java");
		obj.add(24422);
		
		for(int a=0;a<obj.size();a++) {
		
		
	
		System.out.println(obj.get(a));
		
		}
	}

	
}