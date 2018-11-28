import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/*1.ʵ��PageProcessor�ӿ�*/
	public class QuesPageProcess implements PageProcessor{
	    /*2.����ץȡ��վ���������*/    
	    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

	    public Site getSite() {
	        // TODO Auto-generated method stub
	        /*3.����site*/    
	        return site;
	    }

	    /*5.��ȡ�߼�*/
	    public void process(Page page) {
	        // TODO Auto-generated method stub
	        page.putField("html", page.getHtml());
	        String pageHtml = page.getResultItems().get("html").toString();
	        System.err.println(pageHtml);
	    }

	    /*4.��ȡ*/
	    public static void main(String[] args) {
	        /*�����ȡ��url���ӣ�����5���߳���ȡ*/
	        Spider spider = Spider.create(new QuesPageProcess())
	        .addUrl("http://www.tiku.com/")
	        .thread(5);
	        /*��������*/
	        spider.run();
	    }
	}

