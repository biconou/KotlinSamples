import com.github.biconou.utils.isOnlySpace
import com.github.biconou.utils.isOnlySpaceEx
import com.github.biconou.utils.isOnlySpaceEx8
import org.junit.Assert
import org.junit.Test

class StringUtilsTests {

    @Test fun isOnlySpaceTest() {
        Assert.assertFalse(isOnlySpace(""))
        Assert.assertTrue(isOnlySpace(" "))
        Assert.assertTrue(isOnlySpace("             "))
        Assert.assertTrue(isOnlySpace("\t"))
        Assert.assertTrue(isOnlySpace("  \t  "))
        Assert.assertFalse(isOnlySpace("  Mozart  "))
    }

    @Test fun isOnlySpaceExTest() {
        Assert.assertFalse("".isOnlySpaceEx())
        Assert.assertTrue(" ".isOnlySpaceEx())
        Assert.assertTrue("             ".isOnlySpaceEx())
        Assert.assertTrue("\t".isOnlySpaceEx())
        Assert.assertTrue("  \t  ".isOnlySpaceEx())
        Assert.assertFalse("  Mozart  ".isOnlySpaceEx())
    }

    @Test fun isOnlySpaceEx8Test() {
        Assert.assertFalse("".isOnlySpaceEx8())
    }
}