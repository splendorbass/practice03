package prob5;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book( int bookNo, String title, String author){
		this.setBookNo(bookNo);
		this.setTitle(title);
		this.setAuthor(author);
		this.setStateCode(1);
	}
	
	public void rent(){
		System.out.println(this.title+"이(가) 대여 되었습니다.");
		this.setStateCode(0);
	}
	
	public void turnIn(){
		System.out.println(this.title+"이(가) 반납 되었습니다.");
		this.setStateCode(1);
	}
	
	public void print(){
		if( this.stateCode == 0){
			System.out.println("책 제목:"+this.title+", 작가:"+this.author+", 대여유무: 대여중");
		}else{
			System.out.println("책 제목:"+this.title+", 작가:"+this.author+", 대여유무: 재고있음");
		}
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	
	
	
}
