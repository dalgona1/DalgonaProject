package DalgoVO;

public class ChatVO {
	private String Chat_NO;		//��ȣ
	private String Chat_DATE;	//��¥
	private String Chat_NOTE;	//����
	
	public String getChat_NO() 	 { return Chat_NO; 	 }
	public String getChat_NOTE() { return Chat_NOTE; }
	public String getChat_DATE() { return Chat_DATE; }
	
	public void setChat_NO(String chat_NO) 	   { Chat_NO = chat_NO;  	}
	public void setChat_DATE(String chat_DATE) { Chat_DATE = chat_DATE; }
	public void setChat_NOTE(String chat_NOTE) { Chat_NOTE = chat_NOTE; }
}
