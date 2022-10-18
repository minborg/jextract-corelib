package org.openjdk.jextract.corelibs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Generate {

    public static void main(String[] args) {
        System.out.println("Generating classes...");

        String[] arguments = """
--source -t netinet
-I /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include/netinet/
/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include/netinet/in.h
--include-struct sockaddr
--include-struct sockaddr_in
--include-struct sockaddr_in6
--include-macro AF_INET
--include-macro AF_INET6
--include-macro AF_UNSPEC""".split("\\s");
/*                lines().toArray(String[]::new);*/

        var command = "jextract "+ Arrays.stream(arguments).collect(Collectors.joining(" "));
        System.out.println(command);

        String[] help = new String[]{"--help"};
        String[] version = new String[]{"--version"};

        org.openjdk.jextract.JextractTool.main(version);

    }
}
