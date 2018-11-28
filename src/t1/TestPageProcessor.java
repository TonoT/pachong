package t1;

import java.util.ArrayList;
import java.util.List;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;

public class TestPageProcessor implements PageProcessor {

	
	   /*2.设置抓取网站的相关配置*/    
    private Site site = Site
    		.me()
    		.setRetryTimes(3)
    		.setSleepTime(1000)
    		.setTimeOut(10000)
    		.setCharset("UTF-8");
    

	@Override
	//获取站点
	public Site getSite() {
		// TODO Auto-generated method stub
		return site;
	}

	@Override
	
	//爬取过程
	public void process(Page page) {
		// TODO Auto-generated method stub
		/*List<String> all = page.getHtml().xpath("//div[@class='main_l']/ul/li").all();
		List<text> list =new ArrayList<>();
		for (String item : all) {
			Html tmp = Html.create(item);
			String title = tmp.xpath("//div[@class='content']/h4/a/text()").toString();
			String content = tmp.xpath("//div[@class='content']/p/text()").toString();
			String img = tmp.xpath("//a/img/@src").toString();
			text text = new text(title,content,img);
			System.out.println(text.toString());
			list.add(text);
		}*/
		List<String> all = page.getHtml().xpath("//div[@class='middle-column-con']").all();
		System.out.println(page.getHtml());
		for (String item : all) {	
			Html tmp = Html.create(item);
			String title = tmp.xpath("//div[@class='floor-item-title']/text()").toString();
		}
	}

}
