package com.github.biconou;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class CommonsLangStringUtilsTest {

    @Test
    public void stringUtilsIsBlankTest() {
        Assert.assertTrue(StringUtils.isBlank(null));
        Assert.assertTrue(StringUtils.isBlank(""));
        Assert.assertTrue(StringUtils.isBlank("    "));
        Assert.assertFalse(StringUtils.isBlank("Mozart"));
    }

    @Test
    public void stringUtilsIsEmptyTest() {
        Assert.assertTrue(StringUtils.isEmpty(null));
        Assert.assertTrue(StringUtils.isEmpty(""));
        Assert.assertFalse(StringUtils.isEmpty("    "));
        Assert.assertFalse(StringUtils.isEmpty("Mozart"));
    }


}
