package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.baseutil;

public class addtikupage extends baseutil{
	//�����������������
	public void tikuguanli()  {
		driver.switchTo().frame("menu");//������߿��
		//���������
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
		//��������������
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
		driver.switchTo().defaultContent();//�˳����
	}
	//�������
	public void tikuname() {
		driver.switchTo().frame("main");//���ұ߿��
		driver.findElement(By.name("d_name")).sendKeys("rap���ܲ�2");
	}
	//���״̬(������)
	public void tikuzhuangtai() {
		Select s=new Select(driver.findElement(By.name("d_status")));
    	s.selectByIndex(1);
	}
	//���˵��
	public void tikushuoming() {
		driver.findElement(By.name("d_remark")).sendKeys("�࿼��ʦ��������");
	}
	//�ύ��ť
	public void tijiao() {
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
		driver.switchTo().defaultContent();//�˳����
	}

}
