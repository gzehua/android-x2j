
package androidx2j.parser.view
  
import androidx2j.parser.AttrParser

object ScrollView : IView {
    override val myParser = FrameLayout.myParser + AttrParser.androidBuilder()
        .add("android:fillViewport") {
            // setFillViewport(boolean)
            todo()
        }
        .build()

    
}
  