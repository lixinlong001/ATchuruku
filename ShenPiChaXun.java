package com.hx.ATwuliu.pages;

import com.hx.ATwuliu.util.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Administrator on 2019/4/16.
 */
public class ShenPiChaXun extends Actions{
    /*************************************************************************************/
    //页面控件
    //审批查询主页面
    @FindBy(xpath = "//*[@id=\"approvalNum\"]")
    private WebElement Ipt_ShenPiBianHao;      //审批编号输入框

    @FindBy(xpath = "//span/button[1]")
    private WebElement Ipt_Query;      //查询按钮

    @FindBy(xpath = "//span/button[2]")
    private WebElement Btn_Reset;           //重置按钮

    @FindBy(xpath = "//tr[1]/td[2]/span")
    private WebElement Btn_DianJi;           //点击第一条数据

 //审批处理
    @FindBy(xpath = "//div[2]/div[2]/button")
    private WebElement Btn_FanHui;           //返回按钮

    /*************************************************************************************/
    //封装完可执行的方法






}
