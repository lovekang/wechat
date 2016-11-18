package fortest;

import java.util.ArrayList;
import java.util.List;

/**
 * for循环性能测试
 * @author Administrator
 *
 */
public class ForTest {
	public static void main(String[] args) {
//		new ForTest().for1();
//		new ForTest().for2();
		
//		new ForTest().for3();
//		new ForTest().for4();
		
//		new ForTest().for5();
//		new ForTest().for6();
		
//		new ForTest().for7();
//		new ForTest().for8();
		
		new ForTest().for9();
		
	}
	int a=10;
	int b=20;
	int c=0;
	long stratTime=0;
	long endTime=0;
	
	//外大内小
	public void for1(){
		stratTime = System.nanoTime();  
		for (int i = 0; i < 10000000; i++) { 
			
		}  
		endTime = System.nanoTime();  
		System.out.println("未提取耗时："+(endTime - stratTime)); 
	}
	
	//外小内大
	public void for2(){
		stratTime = System.nanoTime();  
		for (int i = 0; i <10 ; i++) {  
		    for (int j = 0; j < 10000000; j++) {  
		          
		    }  
		}  
		endTime = System.nanoTime();  
		System.out.println("外小内大耗时："+(endTime - stratTime)); 
	}
	
	//for3与for4比较，提取去循环无关的表达式
	public void for3(){
	    stratTime = System.nanoTime();  
	    for (int i = 0; i < 10000000; i++) {  
	        i=i*a*b;  
	    }  
	    endTime = System.nanoTime();  
	    System.out.println("未提取耗时："+(endTime - stratTime));  
	}
	
	public void for4(){
	    stratTime = System.nanoTime();  
	    c = a*b;  
	    for (int i = 0; i < 10000000; i++) {  
	        i=i*c;  
	    }  
	    endTime = System.nanoTime();  
	    System.out.println("已提取耗时："+(endTime - stratTime));  
	}
	
	
	//for5与for6方法比较，消除循环终止判断时的方法调用
	public void for5(){
		List<String>list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
	    stratTime = System.nanoTime();  
	    for (int i = 0; i < list.size(); i++) {  
	          
	    }  
	    endTime = System.nanoTime();  
	    System.out.println("未优化list耗时："+(endTime - stratTime));  
	}
	
	public void for6(){
		List<String>list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		stratTime = System.nanoTime();  
		int size = list.size();  
		for (int i = 0; i < size; i++) {  
		      
		}  
		endTime = System.nanoTime();  
		System.out.println("优化list耗时："+(endTime - stratTime));
	}
	
	//for7与for8方法比较，将异常捕获放到循环外面
	public void for7(){
	    stratTime = System.nanoTime();  
	    for (int i = 0; i < 10000000; i++) {  
	        try {  
	        } catch (Exception e) {  
	        }  
	    }  
	    endTime = System.nanoTime();  
	    System.out.println("在内部捕获异常耗时："+(endTime - stratTime));  
	}
	
	public void for8(){
	    stratTime = System.nanoTime();  
	    try {  
	        for (int i = 0; i < 10000000; i++) {  
	        }  
	    } catch (Exception e) {  
	      
	    }  
	    endTime = System.nanoTime();  
	    System.out.println("在外部捕获异常耗时："+(endTime - stratTime));  
	}
	
	//字符串比较
	public void for9(){
		long time1Before=System.nanoTime();  
        String str="";  
        for(int i=0;i<10000;i++){  
            str+=i;  
        }  
        long time1After=System.nanoTime();  
        System.out.println("use String --->  "+(time1After-time1Before));  
  
        long time2Before=System.nanoTime();  
        StringBuilder sbuilder=new StringBuilder();  
        for(int i=0;i<10000;i++){  
            sbuilder.append(i);  
        }  
        long time2After=System.nanoTime();  
        System.out.println("线程不安全，use StringBuilder--->  "+(time2After-time2Before));  
  
        long time3Before=System.nanoTime();  
        StringBuffer stringBuffer=new StringBuffer();  
        for(int i=0;i<10000;i++){  
            stringBuffer.append(i);  
        }  
        long time3After=System.nanoTime();  
        System.out.println("线程安全，use StringBuffer--->  "+(time3After-time3Before));  
	}
}
