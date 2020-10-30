package com.example.helloworld.command;

import java.io.*;
import java.util.*;

public class CommandLineExecutor{
    private String cmdStr;
    private String defaultPath;

    public CommandLineExecutor() {
        defaultPath = "src/main/resources/static/images/";
    }
    private boolean executeCmd(String cmd) {
        Process process = null;
        Runtime runtime = Runtime.getRuntime();
        StringBuffer successOutput = new StringBuffer();
        StringBuffer errorOutput = new StringBuffer();
        BufferedReader successBufferReader = null;
        BufferedReader errorBufferReader = null;
        String msg = null;
        boolean result = false;
 
        List<String> cmdList = new ArrayList<String>();
 
        cmdList.add("/bin/sh");
        cmdList.add("-c");
        
        cmdList.add(cmd);
        String[] array = cmdList.toArray(new String[cmdList.size()]);
 
        try {
            process = runtime.exec(array);
 
            successBufferReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "EUC-KR"));
 
            while ((msg = successBufferReader.readLine()) != null) {
                successOutput.append(msg + System.getProperty("line.separator"));
            }
 
            errorBufferReader = new BufferedReader(new InputStreamReader(process.getErrorStream(), "EUC-KR"));
            while ((msg = errorBufferReader.readLine()) != null) {
                errorOutput.append(msg + System.getProperty("line.separator"));
            }
 
            process.waitFor();
 
            if (process.exitValue() == 0) {
                result = true;
            } else {
            }
 

 
        } catch (IOException e) {
        } catch (InterruptedException e) {
        } finally {
            try {
                process.destroy();
                if (successBufferReader != null) successBufferReader.close();
                if (errorBufferReader != null) errorBufferReader.close();

            } catch (IOException e1) {
            }
        }
        return result;
    }

    
    public void originalShellCmd() {
        cmdStr = "curl http://cdn.011st.com/ds/2020/09/25/1130/76bc9e49b5bda8e952261ecd2752f344.jpg -o "+ defaultPath + "/org.jpg";
        executeCmd(cmdStr);
    }

    public void resizeShellCmd(String percent, String width, String height) {
        cmdStr = "curl http://1.255.134.156:3000/ds/2020/09/25/1130/76bc9e49b5bda8e952261ecd2752f344.jpg/dims/resize/";
        if(percent != null) {
            cmdStr += percent + "%";
        } else {
            cmdStr += width + "x" + height;
        }
        cmdStr += " -o "+ defaultPath + "resize.jpg -H \"Host: cdn.011st.com\"";
        executeCmd(cmdStr);
    }
    
    public void cropShellCmd(String width, String height, String xPoint, String yPoint,String center) {
        if(xPoint == null) xPoint = "0";
        if(yPoint == null) yPoint = "0";
        
        cmdStr = "curl http://1.255.134.156:3000/ds/2020/09/25/1130/76bc9e49b5bda8e952261ecd2752f344.jpg/dims/";
        if(center != null ) {
            cmdStr += "cropcenter/";
        }  else {
            cmdStr += "crop/";
        }
        cmdStr += width + "x" + height + "+" + xPoint + "+"+ yPoint + " -o " + defaultPath + "crop.jpg -H \"Host: cdn.011st.com\"";
        executeCmd(cmdStr);
    }
    
    public void compositeShellCmd() {
        cmdStr = "curl http://1.255.134.156:3000/ds/2020/09/25/1130/76bc9e49b5bda8e952261ecd2752f344.jpg/dims/composite/water1c -o "+ defaultPath + "composite.jpg -H \"Host: cdn.011st.com\"";
        executeCmd(cmdStr);
        System.out.println(cmdStr);
    }

}