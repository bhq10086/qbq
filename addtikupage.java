package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.baseutil;

public class addtikupage extends baseutil{
	//进入题库管理新增题库
	public void tikuguanli()  {
		driver.switchTo().frame("menu");//进入左边框架
		//点击题库管理
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
		//点击进入新增题库
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
		driver.switchTo().defaultContent();//退出框架
	}
	//题库名称
	public void tikuname() {
		driver.switchTo().frame("main");//入右边框架
		driver.findElement(By.name("d_name")).sendKeys("rap班周测2");
	}
	//题库状态(下拉框)
	public void tikuzhuangtai() {
		Select s=new Select(driver.findElement(By.name("d_status")));
    	s.selectByIndex(1);
	}
	//题库说明
	public void tikushuoming() {
		driver.findElement(By.name("d_remark")).sendKeys("监考老师网警刘波");
	}
	//提交按钮
	public void tijiao() {
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
		driver.switchTo().defaultContent();//退出框架
	}

}
