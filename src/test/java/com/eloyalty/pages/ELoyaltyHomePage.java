package com.eloyalty.pages;

import org.openqa.selenium.By;

import com.cucum.baseclass.BaseClass;

public class ELoyaltyHomePage extends BaseClass {

	public static final By login_txt = By.id("AppletTitle_Label_1");
	public static final By Ann_Mem_txt = By.xpath("//div[@class='content']/h2");
	public static final By Ann_Mem_dec = By.xpath("(//div[@class='content']/p)[1]");
	public static final By Ann_Fe = By.xpath("(//div[@class='content']/p)[2]");
	public static final By An_Fe_1 = By.xpath("//li[text()='Comfortable chairs to relax']");
	public static final By An_Fe_2 = By.xpath("//li[text()='Chef-inspired food and drinks']");
	public static final By An_Fe_3 = By.xpath("//li[text()='Wi-Fi and power ports']");
	public static final By An_Fe_4 = By.xpath("//li[text()='Personal travel assistance']");
	public static final By An_Fe_5 = By.xpath("//li[text()='Shower suites (select locations)']");
	public static final By Join_Aadv = By.xpath("//div[@class='join']/a");
	public static final By Aadv_Num = By.xpath("(//div[@class='need-help pull-left']/a)[1]");
	public static final By Pass_word = By.xpath("(//div[@class='need-help pull-left']/a)[2]");
	public static final By Learn_more = By.xpath("//div[@class='apply']/a");
	public static final By your_name = By.id("profile.information.personalInfo.title");
	public static final By N_Y_Aadv = By.xpath("(//section[@class='section margin-top']/p)[1]");
	public static final By N_Y_Password = By.xpath("(//form[@id='needPasswordForm']/section/p)[1]");
	public static final By le_more = By.xpath("//h2[text()='Enrich your travel experience with these remarkable card benefits:']");
	
}
