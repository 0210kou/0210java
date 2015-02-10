package practice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main38 {
	public static void main(String[]args)throws Exception{
		Log logger  = LogFactory.getLog(Main38.class);

		if(args.length != 2){
			logger.error("起動引数の数が異常:"  + args.length);
		}
	}

}
