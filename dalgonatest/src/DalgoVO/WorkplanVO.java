package DalgoVO;

public class WorkplanVO {

	private int	   User_No; 	// 작성 유저번호
	private int    Wp_No;		// 계획 번호
	private String Wp_Date;		// 워크플랜 작성일
	private String Wp_Note;		// 일정내용
	private String Wp_Start;	// 계획 시작일
	private String Wp_End;		// 계획 마감일
	
	
	public void 	setUser_No(int user_No) 	{User_No = user_No;}
	public void     setWp_No(int wp_No)			{Wp_No  = wp_No;}
	public void 	setWp_Date(String wp_Date) 	{Wp_Date = wp_Date;}
	public void 	setWp_Note(String wp_Note) 	{Wp_Note = wp_Note;}
	public void 	setWp_Start(String wp_Start){Wp_Start = wp_Start;}
	public void 	setWp_End(String wp_End) 	{Wp_End = wp_End;}
	
	
	public int 		getUser_No() 				{return User_No;}
	public int      getWp_No()					{return Wp_No;}
	public String 	getWp_Date() 				{return Wp_Date;}
	public String 	getWp_Note() 				{return Wp_Note;}	
	public String 	getWp_Start() 				{return Wp_Start;}	
	public String 	getWp_End() 				{return Wp_End;}
		
}
