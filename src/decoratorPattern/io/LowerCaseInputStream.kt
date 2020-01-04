package decoratorPattern.io

import java.io.FilterInputStream
import java.io.InputStream


class LowerCaseInputStream(`in`: InputStream) : FilterInputStream(`in`) {


}