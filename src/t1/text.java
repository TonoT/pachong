package t1;

public class text {
	private String title;
	private String content;
	private String img;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "text [title=" + title + ", content=" + content + ", img=" + img + "]";
	}
	public text(String title, String content, String img) {
		super();
		this.title = title;
		this.content = content;
		this.img = img;
	}
	

}
