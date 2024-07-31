package tests;

import org.junit.Test;
public class AllEchoTests {

    @Test
    public void runAllTests() {
        tests.PostmanEchoPostRawTest.postmanPostRawTest();
        tests.PostmanEchoGetTest.postmanGetTest();
        tests.PostmanEchoPostFormTest.postmanPostFormTest();
        tests.PostmanEchoPutTest.postmanPutTest();
        tests.PostmanEchoPatchTest.postmanPatchTest();
        tests.PostmanEchoDeleteTest.postmanDeleteTest();
    }
}