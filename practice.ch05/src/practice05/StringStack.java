package practice05;

public class StringStack implements StackInterface {
	
	String stack[]= new String[10];
	
	private int cnt=0; //zero indexing
	public int length() {
		return cnt+1; //갯수니까 0이 아니라 1부터 시작
	}
	public String pop() {
		return stack[--cnt]; //다섯 단어 다 입력되면 cnt=5인데 index는 0~4d임으로 cnt 1 감소해서 4로 만들고 시작 
	}
	
	public boolean push(String ob) {
		if(cnt==10) {return false;}
		else {
			stack[cnt]=ob;	//0부터 index 시작
			cnt++; //index 하나 증가해서 다음 칸으로 넘겨
			return true;
			}
	}
	
}
