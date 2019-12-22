import javax.management.*;
import java.lang.management.ManagementFactory;

public class ActiveSessionTomcat {

    public static void main(String[] args) {


        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = null;
        try {
            objectName = new ObjectName("Catalina:type=Manager,context=/,host=localhost");
        } catch (MalformedObjectNameException e) {
            e.printStackTrace();
        }
        try {
            int activeSessions = (Integer) mBeanServer.getAttribute(objectName, "activeSessions");
            System.out.println(" Active Session " + activeSessions);
        } catch (MBeanException e) {
            e.printStackTrace();
        } catch (AttributeNotFoundException e) {
            e.printStackTrace();
        } catch (InstanceNotFoundException e) {
            e.printStackTrace();
        } catch (ReflectionException e) {
            e.printStackTrace();
        }


    }
}
