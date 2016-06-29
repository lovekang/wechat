package com.weqia;

import java.io.File;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.weqia.pojo.CompanyEmployees;
import com.weqia.pojo.CompanyOpenIds;
import com.weqia.pojo.Employee;
import com.weqia.pojo.FileUploadForm;
import com.weqia.pojo.NoticeForm;
import com.weqia.pojo.OpenEmployeeForm;
import com.weqia.pojo.OpenEmployeeListForm;
import com.weqia.pojo.OpenNoticeForm;
import com.weqia.pojo.OpenNoticeListForm;
import com.weqia.pojo.OutNotifysForm;
import com.weqia.util.EncryptUtils;

/**
 * 
 * @Description : 接口测试类
 * @author sam    
 * @version 1.0  
 * @created Sep 15, 2014 3:11:04 PM
 * @fileName com.weqia.WeqiaClientTest.java
 * 
 * 类名：WeqiaClientTest
 * 功能：微洽接口测试类
 * 详细：接口测试类：实现“员工批量添加”、“外部消息通知”等接口测试；
 * 版本：1.0
 * 日期：2014-08-18
 * 说明：
 * 以下代码只是为了方便测试而提供的样例代码,企业可以根据自己系统的需要,按照技术文档编写,并非一定要使用该代码
 * 该代码仅供学习和研究微洽接口使用,只是提供一个参考 
 *
 */
public class WeqiaClientTest {
	
		
	public static void main(String[] args) {
		
		//4008
//		testFindPicUrl();
		//4007
//		testFindDepartment();
		
		//4006
//		testFileUpload();
		
		//4005
//		testFindNoticeClassifyList();
		
		//4004
//		testFindNotice();
		
		//4003
//		testFindNoticeList();
		
		//4002
//		testDelNotice();
		
		//4001
//		testAddNotice();
		
		//3001
//		testOutNotify();
		//1007
		//testFindEmployee();
		//1006
	findEmployeeList();
		//1005
//		batchUpdateEmployeesDepartment();
		//1004
//		testBatchDeleteEmployees();		
		
		//1003
//		testBatchUpdateEmployeesStatus();			
		
		//1002
//		testBatchUpdateEmployees();		
		
		//1001
//		testBatchAddEmployees();			
	}
	/**
	 * 接口：4008 
	 */
	private static void testFindPicUrl(){	
		WeqiaClient wqClient = initWeqiaClient();
		OpenNoticeForm form =new OpenNoticeForm();
		String url = "403/402880d14c36d8fb014c36da12230002.jpg";
		String[] urls = new String[1];
		urls[0] = url;
		form.setUrls(urls);
		form.setTh(2);
		//findNoticePicUrl
		String sRet = wqClient.findNoticePicUrl(form);
		System.out.println(sRet);
	}
	
	/**
	 * 接口：4007 查询部门
	 */
	private static void testFindDepartment(){
		WeqiaClient wqClient = initWeqiaClient();
		OpenNoticeForm form =new OpenNoticeForm();
		form.setOpenId("4028809b535e588201535e5916330001");
		String sRet = wqClient.batchFindDepartment(form);
		System.out.println(sRet);
	}
	
	/**
	 * 接口： 4006 文件上传
	 */
	private static void testFileUpload(){
		WeqiaClient wqClient = initWeqiaClient();
		String[] fileNames = new String[1];
		String[] contentTypes = new String[1];
		contentTypes[0] = "text/plain";//文件头
		fileNames[0]="123.txt";//文件名称
		File[] files = new File[1];
		files[0] = new File("E:\\download\\123.txt");//文件url
		FileUploadForm form =new FileUploadForm();
		form.setFileNames(fileNames);
		form.setFiles(files);
		form.setItype(404);
		form.setContentTypes(contentTypes);
		form.setOpenId("4028809b4b0af85b014b0b08a40c000f");
		String sRet = wqClient.batchFileUpload(form);
		System.out.println(sRet);
	}
	
	/**
	 * 接口： 4005 公告分类列表
	 */
	private static void testFindNoticeClassifyList(){
		WeqiaClient wqClient = initWeqiaClient();
		OpenNoticeListForm form = new OpenNoticeListForm();
		form.setStartRow(0);//分页开始
		form.setEndRow(100);//分页结束
		form.setPageSize(1);
		String sRet = wqClient.batchFindNoticeClassifyList(form);
		System.out.println(sRet);
	}
	/**
	 *  接口 ：4004    测试公告详情
	 */
	private static void testFindNotice(){
		WeqiaClient wqClient = initWeqiaClient();
		OpenNoticeForm form =new OpenNoticeForm();
		form.setOpenId("4028809b535e588201535e5916330001");
		form.setNoticeId(1205);
		String sRet = wqClient.batchFindNotice(form);
		System.out.println(sRet);
	}
	
	/**
	 *  接口 ：4003   测试公告列表
	 */
	private static void testFindNoticeList(){
		WeqiaClient wqClient = initWeqiaClient();
		OpenNoticeListForm form = new OpenNoticeListForm();
		form.setOpenId("4028809b535e588201535e5916330001");//会员ID
		form.setNoticetitle("");//用于模糊查询
		form.setStartRow(0);//分页开始
		form.setEndRow(8);//分页结束
		form.setPageSize(1);
		String sRet = wqClient.batchfindNoticeList(form);
		System.out.println(sRet);
	}
	
	/**
	 *  接口 ：4002    测试公告删除
	 */
	private static void testDelNotice(){
		WeqiaClient wqClient = initWeqiaClient();
		OpenNoticeForm form =new OpenNoticeForm();
		form.setOpenId("4028809b4b0af85b014b0b08a40c000f");
		form.setNoticeId(950);
		String sRet = wqClient.batchDelNotice(form);
		System.out.println(sRet);
	}
	/**
	 * 接口 ：4001    测试发布公告
	 */
	private static void testAddNotice(){
		WeqiaClient wqClient = initWeqiaClient();
		NoticeForm form =new NoticeForm();
		Integer[] file_ids = new Integer[1];
		file_ids[0] = 14684;//附件ID
		form.setNotice_title("test公告");//公告主题
		form.setNotice_content("好心情！好心情！好心情！好心情！好心情！好心情！");//公告内容
		form.setClassify_id(144050);
		form.setModify_id("4028809b535e588201535e5916330001");
		form.setPub_scope(1);
		form.setCreate_id("4028809b535e588201535e5916330001");
		form.setFile_ids(file_ids);
		String sRet = wqClient.batchAddNotice(form);
		System.out.println(sRet);
	}
	/**
	 * 
	 * @Description  接口: 3001  外部消息通知 - 测试
	 *
	 */
	private static void testOutNotify(){
		WeqiaClient wqClient = initWeqiaClient();
		
		//生成测试数据				
		OutNotifysForm outNotifysForm = new OutNotifysForm();
		
		//String fromId = "40288086409abe5201409ac289570001";
		//String fromId = "4028808740a4e3000140a4e4927a0001"; 4028808740a4e3000140a4e4927a0001
		String fromId = "";
		
		String title = "OA消息";
		String content = "hi,你有一条新的通知!";  //王总，你有个合同需要你审批，请登录CRM审批~ https://www.weqia.com  //hi，请登录OA审批~ https://www.weqia.com
		String[] toIds = new String[3];
		
		toIds[0] = "4028809b5580ef99015580ef9d3f0001";
		toIds[1] = "402880d14d4cc110014d4cf9a6f3000c";
		toIds[2] = "402880d14d526f08014d526fb3540001";
		
		
		
		outNotifysForm.setFromId(fromId);
		outNotifysForm.setToIds(toIds);
		outNotifysForm.setTitle(title);
		outNotifysForm.setContent(content);
		outNotifysForm.setWarnType((byte)1);					//0：普通提醒 (消息上有小圆点提醒) 1：重要提醒(消息上有数字标记)，2：不提醒，默认为1
		outNotifysForm.setVoiceType((byte)1);  					//1：有声音提醒 2：不声音提醒，默认为1
		outNotifysForm.setWarnContent("你有一个合同需要审批~");
		
		outNotifysForm.setClickUrl("http://192.168.0.27/index.htm");
		
		//outNotifysForm.setClickUrl("https://www.mychint.com/wfPhone/mod/unapproved.do?action=list&c=xq%2FVqA8nZJMK1rcVNiScP6EpxWvq2KQm09NaYs8U8e%2BSCrkBAbKsI%2BSElKO68uNnBPxIo4iuTxfawAJHUFofpxuj6XGpiXvc2lalqXwPLoo%3D");
				
		String sRet = wqClient.outNotify(outNotifysForm);
		System.out.println(sRet);
	}
	/**
	 * 
	 *  @Description  接口: 1007   获取员工详情  - 测试
	 *  
	 */
	private static void testFindEmployee(){
		WeqiaClient wqClient = initWeqiaClient();
		OpenEmployeeForm openId = new OpenEmployeeForm();
		openId.setOpenId("4028809b558f992f01558f9932980001");
		String sRet = wqClient.findEmployee(openId);
		System.out.println(sRet);
	}
	
	/**
	 * 
	 * @Description  接口: 1006   获取员工列表  - 测试
	 *
	 */
	private static void findEmployeeList(){
		WeqiaClient wqClient = initWeqiaClient();
		OpenEmployeeListForm form = new OpenEmployeeListForm();
		form.setStartRow(0);//分页开始
		form.setEndRow(5);//分页结束
		form.setPageSize(1);
		String sRet = wqClient.findEmployeeList(form);
		System.out.println(sRet);
		
		//处理json数据
		JSONObject jsonObject=JSONObject.fromObject(sRet);
		JSONArray jsonArray=jsonObject.getJSONArray("list");
		for (Object object : jsonArray) {
			JSONObject obj=JSONObject.fromObject(object);
			System.out.println(obj.get("openId"));
		}
	}
	/**
	 * 
	 * @Description  接口: 1005  更新员工所属部门  - 测试
	 *
	 */
	private static void batchUpdateEmployeesDepartment(){
		WeqiaClient wqClient = initWeqiaClient();
		
		//生成测试数据：员工列表				
		CompanyEmployees companyEmployees = new CompanyEmployees();
		
		Employee[] employees = new Employee[1];
		
			
		Employee employee = new Employee();
		
		employee.setOpenId("4028809b558f992f01558f9932980001");
		employee.setDepartment("开发"); //部门必须存在  如：
	
		//设置要修改的员工
		employees[0] = employee;
		
		companyEmployees.setEmployees(employees);
		String sRet = wqClient.batchUpdateEmployeesDepartment(companyEmployees);
		System.out.println(sRet);
	}
	
	/**
	 * 
	 * @Description  接口: 1004  批量删除员工 - 测试
	 *
	 */
	private static void testBatchDeleteEmployees(){
		WeqiaClient wqClient = initWeqiaClient();
		
		//生成测试数据：员工列表
				
		CompanyOpenIds companyOpenIds = new CompanyOpenIds();
		
		String[] openIds = new String[1];
						
		//设置要删除的员工
		openIds[0] = "4028809b558f992f01558f9932980001";

		companyOpenIds.setOpenIds(openIds);
		String sRet = wqClient.batchDeleteEmployees(companyOpenIds);
		System.out.println(sRet);
	}		
	
	
	/**
	 * 
	 * @Description  接口: 1003  批量更新员工信息 - 测试
	 *
	 */
	private static void testBatchUpdateEmployeesStatus(){
		WeqiaClient wqClient = initWeqiaClient();
		
		//生成测试数据：员工列表				
		CompanyEmployees companyEmployees = new CompanyEmployees();
		
		Employee[] employees = new Employee[1];
		
			
		Employee employee = new Employee();
		
		employee.setOpenId("4028809b558f992f01558f9932980001");
		employee.setStatus((byte)2); 								//必填，1：正常 2：离职
	
		//设置要修改的员工
		employees[0] = employee;
		
		
		companyEmployees.setEmployees(employees);
		String sRet = wqClient.batchUpdateEmployeesStatus(companyEmployees);
		System.out.println(sRet);
	}		

	
	/**
	 * 
	 * @Description  接口: 1002  批量更新员工信息 - 测试
	 *
	 */
	private static void testBatchUpdateEmployees(){
		WeqiaClient wqClient = initWeqiaClient();
		
		//生成测试数据：员工列表				
		CompanyEmployees companyEmployees = new CompanyEmployees();
		
		Employee[] employees = new Employee[1];
		
			
		Employee employee = new Employee();
		
		employee.setOpenId("4028809b558f992f01558f9932980001");
		employee.setName("Azhou周1");
		employee.setMobile("");
		employee.setEmail("");
		employee.setSex((byte)2);
		employee.setPosition("产品经理2");
		employee.setJobnumber("test001818");
	
		//设置要修改的员工
		employees[0] = employee;
		
		
		companyEmployees.setEmployees(employees);
		String sRet = wqClient.batchUpdateEmployees(companyEmployees);
		System.out.println(sRet);
	}	
	
	
	/**
	 * 
	 * @Description  接口: 1001  批量添加员工 - 测试
	 *
	 */
	private static void testBatchAddEmployees(){
		WeqiaClient wqClient = initWeqiaClient();
		
		//生成测试数据：员工列表				
		CompanyEmployees companyEmployees = new CompanyEmployees();
		
		Employee[] employees = new Employee[2];
		String pwd = EncryptUtils.md5Encrypt("abc123");
		
		for (int i=1;i<3;i++){
			
			Employee employee = new Employee();
			employee.setName("测测"+i);
			employee.setAccountType((byte)3);        // employee.setAccountType((byte)1);
			employee.setAccount("test888"+i);	 // employee.setAccount("1318802282"+i);
			employee.setPwd(pwd);
			employee.setMobile("");
			employee.setEmail("test" + i +"@weqia.com");
			employee.setSex((byte)1);
			employee.setDepartment("研发中心\\研发三部\\");
			employee.setPosition("Java工程师");
			employee.setStatus((byte)1);
			employee.setJobnumber("test888"+i);
		
			//添加员工
			employees[i-1] = employee;
		}
		
		companyEmployees.setEmployees(employees);
		String sRet = wqClient.batchAddEmployees(companyEmployees);
		System.out.println(sRet);
	}
	

	/**
	 * 
	 * @Description 初始化企业信息
	 * @return  
	 *
	 */
	private static WeqiaClient initWeqiaClient(){
		//192.168.0.27
		//return new WeqiaClient("2205794","30bbcdb301cfc56390e4e25849ff0f25");
		return new WeqiaClient("jingtang_test", "da72dd333788ad10fedf2db1ac514748");
		//192.168.0.81测试环境
//		return new WeqiaClient("jingtang_test","da72dd333788ad10fedf2db1ac514748");
		
		//return new WeqiaClient("super8","b17fdf3949c5716f9b34c176747c5898");
	}
	
}
