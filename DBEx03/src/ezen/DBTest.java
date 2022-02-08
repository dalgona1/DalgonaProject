package ezen;

public class DBTest 
{
	public static void main(String[] args) 
	{
		 MemoVO vo = new MemoVO();//public class MemoVO 갖다쓰는 코드
		 vo.setNo(1);
		 vo.setTitle("이것은 제목'입니다");
		 vo.setNote("이것은 내용입니다");
		 vo.setDate("2021-11-18");
		 vo.PrintInfo();
		 
		 //매개변수로 객체를 넘겨받음
		 MemoDTO dto = new MemoDTO();
		 if(dto.DBOpen() == true)
		 {
			 int mode = 4;
			 
			 switch(mode)
			 {
			 case 0:
				 for(int i = 1; i <=100; i++)
				 {
					 vo.setTitle("이것은 제목" + i + "입니다");
					 dto.Insert(vo);
				 }
			 	 break;
			 case 1:
				 vo = dto.Select(202);
				 
				 if(vo != null)
				 {
					 vo.PrintInfo();
				 }
				 break;
				 
			 case 2:
				 dto.Delete(202);
				 break;
				 
			 case 3:
				 vo = dto.Select(203);
				 vo.PrintInfo();
				 vo.setTitle("이것은 제목203입니다.");
				 vo.setNote("이것도 203에 대한 내용입니다.");
				 dto.Update(vo);
				 break;
			 case 4:
				 MemoVO []list = null;
				 list = dto.SelectList();
				 for(MemoVO item : list)
				 {
					 if( item != null)
					 {
					 item.PrintInfo();
					 }
				 }
				 
				 
				 break;
			 }
			 
			 dto.DBClose();
		 }
	}
}
