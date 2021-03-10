package Webdriver_Arch;

public interface WebDriver extends SearchContext {

	@Override
	public void findElement(String locator);

	public void get(String url);

	public String getTitle();

	public void click();

	public void sendKeys();

	public void close();

}
