package com.zj;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println();
        Logger logger = new Logger();
        logger.startLogger("D:\\log.txt");
        logger.endLogger();
    }
}
