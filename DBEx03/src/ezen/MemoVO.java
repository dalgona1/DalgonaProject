package ezen;

public class MemoVO 
{
	private int    no;    //메모번호
	private String title; //제목
	private	String note;  //내용
	private String date;  //일자
	
	
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
		System.out.println("번호:" + no);
		System.out.println("제목:" + title);
		System.out.println("내용" + note);
		System.out.println("일자" + date);
	}
}
	
