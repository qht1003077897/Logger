package com.example.logger;

import android.util.Log;

public class L {
	static boolean deBug=true;
    static String Msg;
    static String Tag="QHT";
    
    public static void e(String msg){
    	
    	if(!deBug)return;
		Msg=msg;
		printTargetElement(Msg);
	}
    
	public  static void  e(String tag,String msg){
		
		if(!deBug)return;
		if(!"".equals(tag)){
			Tag=tag;
		}
		e(msg);
		
		printTargetElement(Msg);
	}

	private static void printTargetElement(String Msg) {
		// TODO Auto-generated method stub
		StackTraceElement targetStackTraceElement = getTargetStackElement();
		Log.e(Tag, "�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T\n");
		Log.e(Tag,"��"+"\n" );
		Log.e(Tag,"��   " +targetStackTraceElement.getClassName()+"."+targetStackTraceElement.getMethodName()+"("+targetStackTraceElement.getFileName()+":"+
				targetStackTraceElement.getLineNumber()+")");
		Log.e(Tag,"��   "+Msg);
		Log.e(Tag, "�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T�T\n");
		
	}

	private static StackTraceElement getTargetStackElement() {
		// TODO Auto-generated method stub
		StackTraceElement Element=null;
		StackTraceElement[] stackTraceElement=Thread.currentThread().getStackTrace();
		boolean LocalClass=false;
		boolean LocalClass2=false;
		for(StackTraceElement element:stackTraceElement){
			//ջ֡��Ϣ��L�෽���µĵ�һ����L�෽������oncreate��L��������ջ��Lλ��oncreate֮�ϣ�
			if(element.getClassName().equals(L.class.getName())){
				LocalClass=true;
			}else{
				LocalClass=false;
			}
				 if(!LocalClass&&LocalClass2){
					 Element=element;
					 break;
				 }
				 LocalClass2=LocalClass;
			
		}
		return Element;
	}
	
}
