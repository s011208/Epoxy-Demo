package yhh.com.example.epoxy.epoxy

import com.airbnb.epoxy.TypedEpoxyController
import yhh.com.example.epoxy.pojo.Library


class MyEpoxyController : TypedEpoxyController<List<Library>>() {

    override fun buildModels(data: List<Library>) {
        data.forEach { library ->
            my {
                id(library.name)
                library(library)
            }

            line {
                id("line_${library.name}")
            }
        }
    }
}