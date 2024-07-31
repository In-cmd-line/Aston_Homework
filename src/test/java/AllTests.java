package tests;

import org.junit.Test;
public class AllTests {

    @Test
    public void runAllTests() {
        tests.PostmanPostRawTest.postmanPostRawTest();
        tests.PostmanGetTest.postmanGetTest();
        tests.PostmanPostFormTest.postmanPostFormTest();
        tests.PostmanPutTest.postmanPutTest();
        tests.PostmanPatchTest.postmanPatchTest();
        tests.PostmanDeleteTest.postmanDeleteTest();
    }
}