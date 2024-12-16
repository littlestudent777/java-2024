package second;

/*public class WelcomePage {
	public void showPage() {
		System.out.println("Header");
		System.out.println("Welcome");
		System.out.println("Footer");
	}
}*/


public class WelcomePage extends WebsiteTemplate {
	@Override
	public void showPageContent() {
		System.out.println("Welcome");
	}
}
