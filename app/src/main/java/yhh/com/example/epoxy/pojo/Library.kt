package yhh.com.example.epoxy.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Library(
    @field:[Expose SerializedName("name")]
    val name: String,
    @field:[Expose SerializedName("address")]
    val address: String,
    @field:[Expose SerializedName("tel")]
    val tel: String
)