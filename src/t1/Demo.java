package t1;
import us.codecraft.webmagic.Spider;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spider
		//过程
		.create(new TestPageProcessor())	
		//保存
		.addPipeline(new Testpipeline())
		//第一个页面
	//	.addUrl("http://www.wanho.net/a/jyxb/")
		.addUrl("https://www.tmall.com/?ali_trackid=2:mm_26632158_2456665_53442973:1543201922_198_1456321686&clk1=b4e23f78fe74232607db7283292e7a78&upsid=b4e23f78fe74232607db7283292e7a78")
		.thread(3)
		.run();;

	}

}
