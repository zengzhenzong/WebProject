package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver","C:\\Program Files(x86)\\Mozilla Firefox\\firefox.exe");//设置默认浏览器。

		WebDriver driver=new FirefoxDriver();//打开浏览器
		driver.get("http:\\crm.jdy.com");//打开网页
		Thread.sleep(2000);

		driver.manage().window().maximize();//最大化

//		driver.manage().timeOuts().ImplicitlyWait(5,TimeUnit.SECONDS);智能等待5秒

		Thread.sleep(5000);//等待5秒

		driver.close();//关闭当前浏览器

		driver.quit();//关闭浏览器进程

	}
}
