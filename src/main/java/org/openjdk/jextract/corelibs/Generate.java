package org.openjdk.jextract.corelibs;

public class Generate {

    public static void main(String[] args) {
        System.out.println("Generating classes...");
        org.openjdk.jextract.JextractTool.main(new String[0]);
    }
}
