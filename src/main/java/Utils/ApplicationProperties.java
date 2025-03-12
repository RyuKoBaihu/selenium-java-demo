package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Class responsible for instantiate the properties from application.properties file
 */
public class ApplicationProperties {

    private static final Properties applicationproperties = new Properties ();
    private static final Properties userproperties = new Properties ();

    /**
     * Method that store the application properties from file
     *
     */
    public static void setProperties() {

        try(FileInputStream fis = new FileInputStream("src/test/resources/application.properties")){
            applicationproperties.load(fis);
        }catch (IOException e){
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }

    public static void setUser() {

        try(FileInputStream fis = new FileInputStream("src/test/resources/user.properties")){
            userproperties.load(fis);
        }catch (IOException e){
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }

    /**
     * Method that return the log browser console property
     *
     * @return boolean
     */

    public static String getUrl(){

        return userproperties.getProperty("systemundertest.url");
    }

    public static String getUrlClient(){

        return userproperties.getProperty("systemundertest.urlClient");
    }


    public static boolean getLogBrowserconsoleProperty(){
        String value = applicationproperties.getProperty("log.browserconsole");
        return Boolean.parseBoolean(value);
    }

    /**
     * Method that return the log network property
     *
     * @return boolean
     */
    public static boolean getLogNetworkProperty(){
        String value = applicationproperties.getProperty("log.network");
        return Boolean.parseBoolean(value);
    }

    /**
     * Method that return the download folder path of the browser property
     *
     * @return String
     */
    public static String getBrowserDownloadFolderPath(){
        return applicationproperties.getProperty("browser.downloadfolder.path");

    }

    /**
     * Method that return the system under test (SUT) URL property
     *
     * @return String
     */
    public static String getSystemUnderTestURL(){
        return userproperties.getProperty("systemundertest.url");
    }

    /**
     * Method that return the system under test (SUT) URL property for the Internal Privileges Officer Access Test
     *
     * @return String
     */
    public static String getInternalPrivilegesOfficerAccessURL(){
        return userproperties.getProperty("internalprivileges.accessusertest.url");
    }


}