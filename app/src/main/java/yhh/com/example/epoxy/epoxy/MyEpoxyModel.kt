package yhh.com.example.epoxy.epoxy

import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import yhh.com.example.epoxy.R
import yhh.com.example.epoxy.pojo.Library

@EpoxyModelClass(layout = R.layout.epoxy_model_my)
abstract class MyEpoxyModel : EpoxyModelWithHolder<MyEpoxyModel.Holder>() {

    @EpoxyAttribute
    lateinit var library: Library

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.name.text = library.name
        holder.tel.text = library.tel
        holder.address.text = library.address
    }

    class Holder : KotlinEpoxyHolder() {
        val name by bind<TextView>(R.id.name)
        val tel by bind<TextView>(R.id.tel)
        val address by bind<TextView>(R.id.address)
    }
}