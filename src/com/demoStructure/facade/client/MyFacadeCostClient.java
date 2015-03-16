package com.demoStructure.facade.client;

import com.demoStructure.facade.facade.MyFacade;

/**
 * 外观模式_成本管理系统_客户端类
 * 
 * @author popkidorc
 * 
 */
public class MyFacadeCostClient {
	// 客户端不关注调用的是哪个子类(子系统)的方法，只关注外观类提供的服务。这也是应用集成的一个基本思路。
	MyFacade myFacade = new MyFacade();

	// 调用2个方法，核算员工成本，这里不进行组织
	public void getEmployeeCost() {
		// 理论上只对costClient开放这两个方法，其余的方法不开放(一般通过权限控制)。这里一般通过代理模式调用
		String result = "";
		result += "\n员工列表：" + myFacade.searchEmployees();
		result += "\n薪水列表：" + myFacade.searchSalarys();
		System.out.println("getEmployeeCost==" + result);
	}
}
