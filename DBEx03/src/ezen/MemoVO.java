package ezen;

public class MemoVO 
{
	private int    no;    //�޸��ȣ
	private String title; //����
	private	String note;  //����
	private String date;  //����
	
	
	public int    getNo()    { return no;    }
	public String getDate()  { return date;  }
	public String getNote()  { return note;  }
	public String getTitle() { return title; }
	
	public void setNo(int no) 		   { this.no = no;       }
	public void setTitle(String title) { this.title = title; }
	public void setNote(String note)   { this.note = note;   }
	public void setDate(String date)   { this.date = date;   }
	
	public void PrintInfo()
	{
		System.out.println("��ȣ:" + no);
		System.out.println("����:" + title);
		System.out.println("����" + note);
		System.out.println("����" + date);
	}
}
	
