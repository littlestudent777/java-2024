package second;

/*public class NewsPage {
	public void showPage() {
		System.out.println("Header");
		System.out.println("News");
		System.out.println("Footer");
	}
}*/


public class NewsPage extends WebsiteTemplate {
	@Override
	public void showPageContent() {
		System.out.println("News");
	}
}