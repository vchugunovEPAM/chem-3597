public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Checking fonts availability");
        try
        {
            java.awt.GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        } catch (Exception e)
        {
            System.out.println("Failed to create font instance.");
            if (!(e instanceof NullPointerException))
            {
                return;
            }

            StackTraceElement location = e.getStackTrace()[0];
            if (location.getClassName().equals("sun.awt.FontConfiguration")
                && location.getMethodName().equals("getVersion")
                && location.getLineNumber() == 1264)
            {
                System.out.println("\n\nCHEM-3597 is reproduced\n\n");
            }
        } finally
        {
            System.out.println("Test finished");
        }
    }
}