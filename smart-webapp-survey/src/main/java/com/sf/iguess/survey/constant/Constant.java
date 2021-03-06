package com.sf.iguess.survey.constant;

/**
 * @author 80002286
 * @date 2017年12月4日
 * @time 下午8:01:44
 * @description 
 */
public class Constant {
	
	public static final String USER_INFO = "userInfo";
	public static final String SUFFIXRULE = "\\.(?=\\w+?$)";
	
	public static final String PAGE_DATA = "pageData";
	
	public static final String MOBILE_NUMBER_SESSION_KEY = "sessionMobileNumber";  
	
	public static final String USER_CODE_SESSION_KEY = "userCode";  
	public static final String SESSION_KEY = "sessionId";  
	
	public static final String USER_ROLE_TYPE = "current_user_role_type";
	
	public static final String USER_SUBMIT_TIMES = "last_submit_time";
	
	public static final long USER_SUBMIT_DURATION = 1000 * 15 * 60l;
	
	public static final long UPLOAD_FILE_LIMIT = 1024 * 1024 * 1l;
   
	private static Constant instance = new Constant();
	
	private String winPath = "E:/filesystem/upload/";
	
	private String linuxPath = "/app/upload/";
	
	public static String getOsName(){
    	return System.getProperty("os.name");
    }

	private Constant(){
	}

	public String getWinPath() {
		return winPath;
	}

//	@Value("${upload.win.path}")
	public void setWinPath(String winPath) {
		this.winPath = winPath;
	}

	public String getLinuxPath() {
		return linuxPath;
	}

//	@Value("${upload.linux.path}")
	public void setLinuxPath(String linuxPath) {
		this.linuxPath = linuxPath;
	}
	
	/**
     * 获取系统路径
     * @return
     */
    public static String getOsPath(){
    	String osName = getOsName();
 	   	if(osName.startsWith("Windows")){
 		   return instance.getWinPath();
        }else{
     	   return instance.getLinuxPath();
        }
    }
}
