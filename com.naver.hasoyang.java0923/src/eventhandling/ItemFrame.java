package eventhandling;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class ItemFrame extends Frame {
	//List(아이템 목록)와 버튼을 배치해서 List에서 선택을 변경했을 때
	//이벤트 처리를 해보고 버튼을 눌렀을 때 List에서 어떤 항목들을 선택했는지 확인
	List list;
	Checkbox[] checkboxs;
	Button btn;
	
	//List나 Choice처럼 여러개의 항목을 출력하고 그 중에서 선택된 항목을 가져오는
	//경우에 항목을 배열이나 java.util.List로 만들어 놓는 것이 좋습니다.
	//List에 출력할 항목의 리스트
	ArrayList<String> items;
	public ItemFrame() {
		setLayout(new FlowLayout());
		
		//목록 만들기
		items = new ArrayList<String>();
		items.add("오버워치");
		items.add("스타크래프트");
		items.add("배틀그라운드");
		items.add("메이플스토리");
		items.add("아이온");
		items.add("테라온라인");
		items.add("월드오브워크래프트");
		items.add("카드라이더");
		items.add("카스온라인");
		items.add("서든어택");
		
		//항목을 출력하는 List 생성하고 데이터 추가하기
		//6개의 항목을 보여주고 여러 개를 선택할 수 있도록 만들어줍니다.
		list = new List(6,true);
		for(String item : items)
		{
			list.add(item);
		}
		add(list);
		
		checkboxs = new Checkbox[5];
		
		checkboxs[0] = new Checkbox("피시방");
		checkboxs[1] = new Checkbox("우리집");
		checkboxs[2] = new Checkbox("친구집");
		checkboxs[3] = new Checkbox("부모님집");
		checkboxs[4] = new Checkbox("길바닥");
		
		for(Checkbox box : checkboxs)
		{
			add(box);
		}
		
		//버튼을 생성하고 추가
		btn = new Button("확인");
		add(btn);
		
		list.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//선택한 항목 출력 - 선택이 해제된 아이템과 선택된 아이템의
				//인덱스가 리턴됩니다.
				//System.out.printf("%s\n", e.getItem());
				//선택이 변경된 내용
				//선택이 된 아이템은 1 선택이 해제된 아이템은 2가 리턴
				//System.out.printf("%d\n", e.getStateChange());
				
				//어떤 메소드의 리턴타입이 Object 일 때
				//출력하는 경우를 제외하고는 강제 형 변환해서 사용해야 합니다.
				if(e.getStateChange() == 1)
				{
					System.out.printf("%s가 선택되었습니다.\n", items.get((Integer)e.getItem()));
				}
				else 
				{
					System.out.printf("%s가 선택해제 되었습니다.\n",items.get((Integer)e.getItem()));
				}
			}
			
		});
		
		//버튼을 클릭했을 때 List에서 선택된 항목들을 출력
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//List처럼 여러개의 항목을 출력하는 컴포넌트들은
				//자신의 항목 중에서 몇번째 항목이 선택되었는지 리턴하는 메소드가 
				//존재합니다.
				//getSelectedIndex, getSelectedIndexes
				int[] selectedIndexes = list.getSelectedIndexes();
				
				for(int i : selectedIndexes)
				{
					System.out.printf("%s가 선택됨\n", items.get(i));
				}
			}
			
		});
		
		
		setBounds(100,100,550,200);
		setVisible(true);
		setTitle("아이템 프레임");
	}
}
