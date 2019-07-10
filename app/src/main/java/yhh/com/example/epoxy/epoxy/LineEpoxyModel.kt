package yhh.com.example.epoxy.epoxy

import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import yhh.com.example.epoxy.R

@EpoxyModelClass(layout = R.layout.epoxy_model_line)
abstract class LineEpoxyModel : EpoxyModelWithHolder<LineEpoxyModel.Holder>() {
    class Holder : KotlinEpoxyHolder()
}