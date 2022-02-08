package ezen;

public class DBTest 
{
	public static void main(String[] args) 
	{
		 MemoVO vo = new MemoVO();//public class MemoVO ���پ��� �ڵ�
		 vo.setNo(1);
		 vo.setTitle("�̰��� ����'�Դϴ�");
		 vo.setNote("�̰��� �����Դϴ�");
		 vo.setDate("2021-11-18");
		 vo.PrintInfo();
		 
		 //�Ű������� ��ü�� �Ѱܹ���
		 MemoDTO dto = new MemoDTO();
		 if(dto.DBOpen() == true)
		 {
			 int mode = 4;
			 
			 switch(mode)
			 {
			 case 0:
				 for(int i = 1; i <=100; i++)
				 {
					 vo.setTitle("�̰��� ����" + i + "�Դϴ�");
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
				 vo.setTitle("�̰��� ����203�Դϴ�.");
				 vo.setNote("�̰͵� 203�� ���� �����Դϴ�.");
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
