package com.trenditra;

import org.junit.jupiter.api.Test;

public class AnnotationStepTest {

    private final String Url = "https://github.com";
    private final String Repository = "TrendiTra/PracticeWithAllureReports";

    @Test
    public void issueSearchTestInGithubWithAnnotationSteps() {

        StepsForAnnotationStepTest steps = new StepsForAnnotationStepTest();
        steps.openWebsiteUrl(Url);
        steps.searchRepository(Repository);
        steps.openRepository(Repository);
        steps.checkColumnNameIssue();
    }
}
