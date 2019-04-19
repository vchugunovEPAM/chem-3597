import java.util.Arrays;

import java.awt.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException, FontFormatException
    {
	try {
	  sun.awt.FontConfiguration.init();
          System.out.println("ok");
        } catch(Exception e) {
          e.printStackTrace();
        } finally {
          System.out.println("end");
        }
    }
}