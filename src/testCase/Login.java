package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver","C:\\Program Files(x86)\\Mozilla Firefox\\firefox.exe");//����Ĭ���������

		WebDriver driver=new FirefoxDriver();//�������
		driver.get("http:\\crm.jdy.com");//����ҳ
		Thread.sleep(2000);

		driver.manage().window().maximize();//���

//		driver.manage().timeOuts().ImplicitlyWait(5,TimeUnit.SECONDS);���ܵȴ�5��

		Thread.sleep(5000);//�ȴ�5��

		driver.close();//�رյ�ǰ�����

		driver.quit();//�ر����������

	}
}
