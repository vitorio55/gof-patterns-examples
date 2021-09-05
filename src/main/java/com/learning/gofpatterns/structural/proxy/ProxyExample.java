package com.learning.gofpatterns.structural.proxy;

import com.learning.gofpatterns.BannerPrinter;
import com.learning.gofpatterns.Example;

public class ProxyExample implements Example {

    @Override
    public void runExample() {
        BannerPrinter.printProxyBanner();

        System.out.println("==> Running Proxy Example");

        System.out.println("""
            Here we have two entities:
              * One is the base Content class that stores data which is directly accessed
              * The other is a Proxy that only allows it's inner Content to be accessed if the correct access key is
              configured with an expected value
              
            These entities share a base interface, which the Proxy uses so it can be interchanged in client code where
            the base entity is used.
            """);

        String data = "<SOME_CONTENT>";
        String correctKey = "ABC_123";

        PublicContent unsafeContent = new PublicContent(data);
        System.out.println("Accessing unsafe content: " + unsafeContent.getContent());

        System.out.println("\nAttempting to access private content using wrong access key...");
        PrivateContent privateContent = new PrivateContent(unsafeContent);
        privateContent.getContent();

        System.out.println("\nAttempting to access private content using correct access key...");
        privateContent.setAccessKey(correctKey);
        String privateData = privateContent.getContent();
        System.out.println("Accessed private content: " + privateData);
        System.out.println();
    }
}
