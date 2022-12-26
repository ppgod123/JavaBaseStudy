import org.apache.log4j.Logger;

public class Log4jTester {
     public static Logger logger = Logger.getLogger(Log4jTester.class);
    public static void main(String[] args) {
          test();
    }
    public static void test(){
        logger.debug("debug级别日志");
        logger.info("info级别日志");
        logger.warn("警告级别日志");
        logger.error("错误级别日志");
    }
}
