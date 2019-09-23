package eventhandling;

import java.util.ArrayList;

public class EventMain {

	public static void main(String[] args) {
		//new EventFrame();
		//new EventRouting();
		//new ItemFrame();
		new TextEvent();
		/*
		ArrayList<String> list = new ArrayList<>();
		//데이터의 리스트
		list.add("강화");
		list.add("장착");
		list.add("사냥");
		list.add("대기");
		list.add("상점");
		list.add("사기");
		
		
		//삭제할 항목의 인덱스 리스트
		ArrayList<Integer> deleteList = new ArrayList<>();
		deleteList.add(1);
		deleteList.add(3);
		deleteList.add(5);
		//리스트에서 데이터를 삭제하는 메소드 remove(int index)
		//데이터의 리스트를 가지고 인덱스 리스트에해당하는 데이터를 삭제
		//리스트에서 여러개를 삭제할 때는 뒤에서 부터 삭제를 하던가
		//삭제를 할 때마다 인덱스를 변경하던가 해야합니다.
		/*
		for(int i : deleteList)
			
		{
			list.remove(i);
			
		}
		*/
		/*
		//deleteList에서 뒤에서부터데이터를 가져오기
		for(int i = deleteList.size()-1; i >=0; i--)
		{
			int idx = deleteList.get(i);
			list.remove(idx);
		}
		//데이터의 리스트를 가지고 인덱스 리스트에 해당하는 데이터를 삭제
		
		for(String temp : list)
		{
			System.out.printf("%s\n", temp);
		}
		*/
		
	}

}
