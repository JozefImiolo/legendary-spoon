package com.company;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        ConfigTest ct = new ConfigTest();
        System.out.println(ct.getValue(ConfigTest.HOSTNAME));
    }


    private void reg() {
        String log = "password=asdgq34gsod34t. vdfbsdfbsfg password=434dfaFV ssczxc";
        Pattern p = Pattern.compile("(password=)(\\d+)");
        Matcher m = p.matcher(log);
        StringBuffer result = new StringBuffer();
        while (m.find()) {
            System.out.println("Group 1:" + m.group(1));
            System.out.println("Group 2:" + m.group(2));
            m.appendReplacement(result, m.group(1) + "*****");
        }

        m.appendTail(result);
        System.out.println(result);

        System.out.println("--------------");
        log = "192.168.1.1 Debug ble IP=8.8.8.8.";
        Pattern pi = Pattern.compile("(IP=)(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})");
        Matcher mi = pi.matcher(log);
        while (mi.find()) {
            System.out.println("Group 1:" + mi.group(1));
            System.out.println("Group 2:" + mi.group(2));
            System.out.println(mi.start());
            System.out.println(mi.end());
        }

        Pattern pp = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        Matcher mm = pp.matcher(log);
        System.out.println(mm.matches());


        String mac = "34:02:86:eb:c6:e3";
        Pattern macPattern = Pattern.compile("([0-9a-fA-F]{2}:?){6}");
        Matcher macMatcher = macPattern.matcher(mac);
        System.out.println(macMatcher.matches());
    }
}
