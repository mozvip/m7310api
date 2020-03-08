package com.github.mozvip.m7310;

import com.github.mozvip.m7310.responses.StatusResponse;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "checksum", mixinStandardHelpOptions = true, version = "checksum 4.0",
        description = "Prints the checksum (MD5 by default) of a file to STDOUT.")
public class GetCurrentActivityCommand implements Callable<Integer> {

    @CommandLine.Parameters(index = "0", description = "The ip address of the router.")
    private String ipAddress;

    @CommandLine.Parameters(index = "1", description = "The admin password.")
    private String password;

    // this example implements Callable, so parsing, error handling and handling user
    // requests for usage help or version help can be done with one line of code.
    public static void main(String... args) {
        int exitCode = new CommandLine(new GetCurrentActivityCommand()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception { // your business logic goes here...
        M7310 m = new M7310(ipAddress, password);
        final StatusResponse status = m.getStatus();
        System.out.println("RXSPEED=" + status.getWan().getRxSpeed());
        System.out.println("TXSPEED=" + status.getWan().getTxSpeed());
        return 0;
    }

}
