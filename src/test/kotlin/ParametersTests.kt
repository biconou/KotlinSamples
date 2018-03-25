import com.github.biconou.utils.isOnlySpace
import com.github.biconou.writeForenameAndName
import org.junit.Assert
import org.junit.Test

class ParametersTests {

    @Test
    fun isOnlySpaceTest() {
        writeForenameAndName("Johann Sebastian", "Bach")
        writeForenameAndName(forename = "Johann Sebastian", name = "Bach")
        writeForenameAndName(name = "Bach", forename = "Johann Sebastian")
    }

}